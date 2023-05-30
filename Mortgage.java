import java.text.NumberFormat;
public class Mortgage {
    private final byte MONTHS_IN_YEAR =12;
    private byte LOOP ;
    private final byte PERCENTAGE =100;
    private final int principal;
    private double annualInterestRate;
    private int periodYears;
    public Mortgage(int principal,int annualInterestRate,int periodYears){
        this.principal=principal;
        setAnnualInterestRate(annualInterestRate);
        setPeriodYears(periodYears);
    }
    public void calMortgage(){
        double result = (((Math.pow((1+annualInterestRate),periodYears))*annualInterestRate)/((Math.pow((1+annualInterestRate),periodYears))-1))*principal;
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(result));

        double reduce = principal-result;
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (int i=1 ; i<=periodYears ;i++){

            System.out.println(NumberFormat.getCurrencyInstance().format(reduce));
            if(reduce==0)
                break;
            reduce-=result;
            if (reduce<0)
                reduce =0;

        }
    }
     private void setAnnualInterestRate(int annualInterestRate){
        this.annualInterestRate= (double) annualInterestRate / MONTHS_IN_YEAR / PERCENTAGE;
    }
    private void setPeriodYears(int periodYears){
        this.periodYears = periodYears*MONTHS_IN_YEAR;
    }
}
