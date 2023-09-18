import java.util.Scanner;

public class MinMaxChallenge_74 {
    /*
    - Prompts the user to enter a number or any character to quit
    - Validates if the user-entered data really is a number, you can choose integer or double validation method
    - If the user-entered data is not a number, quit the loop.
    - Keep track of the minimum number entered.
    - Keep track of the maximum number entered.
     */
    public static void main(String[] args) {
        MinMax();
    }

    public static void MinMax(){
        boolean validNumber=true;
        int inputNumber,counter=1;
        int min=0,max=0;

        Scanner scanner = new Scanner(System.in);

        while(validNumber){
            System.out.println("Enter a valid number :");
            try{
                inputNumber = Integer.parseInt(scanner.nextLine());
                if(counter==1){
                    min=inputNumber;
                    max=inputNumber;
                }else{
                    if(inputNumber<min)
                        min=inputNumber;
                    if(inputNumber>max)
                        max=inputNumber;
                }
                counter++;
            }catch (NumberFormatException e){
                System.out.println("Program has been terminated, because you entered a character!");
                validNumber=false;
            }
            System.out.println("Max Number : "+max);
            System.out.println("Min Number : "+min);
        }
    }
}
