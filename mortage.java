import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String [] arg){

        final byte MONTHS_IN_YEAR =12;
        final byte PERCENTAGE =100;

        Scanner object = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = object.nextInt();

        System.out.print("Annual Interest Rate: ");
        double interestRate = (object.nextDouble()/MONTHS_IN_YEAR)/PERCENTAGE;

        System.out.print("Period (Years): ");
        int months = object.nextInt()*12;

        double data1 = (Math.pow((1+interestRate),months))*interestRate;
        double data2 =(Math.pow((1+interestRate),months))-1;
        double data3 =(data1/data2)*principal;

        String result =NumberFormat.getCurrencyInstance().format(data3);
        System.out.println("Motage: "+result);


        }

    }

