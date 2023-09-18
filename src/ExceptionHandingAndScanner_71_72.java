import java.util.Scanner;

public class ExceptionHandingAndScanner_71_72 {
    /*Exception
        Is an error that happens in code.
        Some types of errors can be predicted and named.
        You can "catch" an Exception to know what is the error msg
    * */

    public static void main(String[] args) {
        int currentYear = 2023;

        //exception
        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, what's your Name? ");
        System.out.println("Hi "+ name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year you were born ?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "You are "+ age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        //input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name ?");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name + ", Thanks for taking the course!");

        System.out.println("What year you were born ?");

        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= "+(currentYear));

            try{
                age=checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            }catch (NumberFormatException e){
                System.out.println("Characters not allowed!! Try again");
            }

        }while(!validDOB);

        return "You are "+ age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt((dateOfBirth));
        int minimumYear = currentYear - 125;

        if((dob < minimumYear ) || (dob > currentYear )){
            return -1;
        }

        return (currentYear - dob);
    }
}
