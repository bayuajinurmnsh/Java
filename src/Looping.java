public class Looping {
    public static void main(String[] args) {

        /* There is 3 looping option in Java:
            1. for -> The for loop is more complex to set up but is commonly used when you are iterating
                      over a set of values
            2. while -> The while loop execute until a specified condition becomes false
            3. do while -> The do while loop always executes at least one and continues until a specified
                           condition becomes false
        */

        printForLoop(3);
        printWhileLoop(4);
        printDoWhileLoop(5);
        printInterest(); // for loop example

        printPrimeNumber(50);
    }

    public static void printForLoop(int counter){
        //start from 1 and stop until number < = counter
        System.out.print("For Loop -> ");
        for(int number = 1; number <= counter; number++){
            System.out.print(number+",");
        }
        System.out.println("");
    }

    public static void printWhileLoop(int counter){
        int number = 1;

        System.out.print("While Loop -> ");
        //if the condition true, looping will continue
        while(number <= counter){
            System.out.print(number+",");
            number+=1;
        }
        System.out.println("");
    }

    public static void printDoWhileLoop(int counter){
        int number = 1;

        System.out.print("Do While Loop -> ");
        do{
            System.out.print(number+",");
            number+=1;
        }while(number <= counter);
        System.out.println("");
    }

    public static void printInterest(){
        for(double interestRate=7.5; interestRate <= 10; interestRate+=0.25){
            double interestAmount = calculateInterest(100,interestRate);
            if(interestAmount > 8.5){
                break; //in for loop we can use a break statement;
            }
            System.out.println("$100.00 at "+interestRate+"% interest = $"+interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100 ));
    }

    public static boolean isPrime(int wholeNumber){

        if(wholeNumber<=2){
            return (wholeNumber==2); // this is equivalent with boolean x = (wholeNumber==2);
        }

        //this is useful to handle if the number is greater than 2 and can be divided by 2
        //that mean the number is not a prime number, so we will not do a for loop
        if(wholeNumber>2 && wholeNumber % 2==0)
            return false;

        for (int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor ==0){
                return false;
            }
        }

        return true;
    }

    public static void printPrimeNumber(int rangeNumber){
      if(rangeNumber<=0 || rangeNumber > 1000){
          System.out.println("you can't enter a number lower than 1 or a number greater than 1000");
      }else{
          int primeNumberCounter=0;
          for(int iterator=10; iterator<=rangeNumber && primeNumberCounter<3; iterator++){

              if(isPrime(iterator)){
                  System.out.println(iterator+" is a prime number");
                  primeNumberCounter++;
              }
          }
      }

    }

}
