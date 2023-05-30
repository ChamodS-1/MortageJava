import java.util.Scanner;

public class Main{
    public static void main(String[] arg) {

        int principal= checkValidate("Enter Principal between 1K - 1M: ",1_000_000,1000);
        int annualInterestRate= checkValidate("Enter Annual Interest Rate between 1% - 10%: ",10,1);
        int periodYears= checkValidate("Period (Years): ",10,2);

        var mortgage1 = new Mortgage(principal,annualInterestRate,periodYears);
        mortgage1.calMortgage();

    }
    public static int checkValidate(String prompt,int max,int min){
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        while (!(value<=max && value>=min)){

            System.out.print(prompt);
            value = scanner.nextInt();
        }
        return value;

    }
}

