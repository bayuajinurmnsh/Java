import java.util.Scanner;

public class ReadingUserInputChallenge_73 {
    /*
    - You will read 5 valid numbers from the console, entered by the user, and print the sum of those five numbers.
    - Check the numbers entered are valid integers
    - print "Invalid number" to the console if numbers are not a valid integers, but continue looping until you have 5 valid numbers
    - Before the user enters each number , prompt them with the message, "Enter number #x:" where x is represents the count, 1,2,3, etc.
    */
    public static void main(String[] args) {
        readingUserInput();
    }

    public static void readingUserInput(){
        int count=1;
        int sum=0;
        int inputNumber;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter number #"+count+":");
            try{
                inputNumber = Integer.parseInt(scanner.nextLine());
                sum += inputNumber;
                count++;
            }catch (NumberFormatException e){
                System.out.println("Invalid number");
            }

        }while (count<=5);
        System.out.println("Total sum of the integer is : "+sum);
    }

}
