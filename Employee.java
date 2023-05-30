import java.security.PublicKey;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int overTime;

    public static int employeeNumber;

    public Employee(int baseSalary,int hourlyRate,int overTime){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        setOverTime(overTime);
        employeeNumber++;
    }
    public Employee(int baseSalary,int hourlyRate){
       this(baseSalary,hourlyRate,0);
    }
    public static void setEmployeeNumber(){
        System.out.println(employeeNumber);

    }

    public int calculateWage(){
        return baseSalary+(hourlyRate*overTime);
    }
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Error!!");
        this.baseSalary=baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }
    private void setHourlyRate(int hourlyRate){
        if (hourlyRate<=0)
            throw new IllegalArgumentException("Error!");
        this.hourlyRate=hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }
    private void setOverTime(int overTime){
        this.overTime=overTime;
    }
}

