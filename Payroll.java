import java.util.Scanner;


 
public class Payroll2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println();
        System.out.println("What is your name?");
        String Name = in.nextLine();
        
        System.out.println();
        System.out.println("How many hours did you work this week?");
        int hours = sc.nextInt();
        
        System.out.println();
        System.out.println("What is your hourly pay?");
        Double payRate = sc.nextDouble();
        
        System.out.println();
        System.err.print("Hello , " + Name);
        
        Double grossPay = hours * payRate;
        
        System.out.println();
        System.out.println();
        System.out.println("Your gross pay $" + grossPay);
        
        
    }
}
