public class SwitchStatement {
    //Instead of writing many if else statements, you can use the switch statement.
    //The switch statement selects one of many code blocks to be executed
    /* example :
        int input = 2;
        if (input=1)
            do something
        else if(input=2)
            do something

        if you use "if-else" statement, the program will check your code to the "if" logic first
        but if you use switch statement we can skip the if input = 1
     */

    public static void main(String[] args) {

        int inputValue = 2;

        switch (inputValue){
            case 1:
                System.out.println("the value is 1");
                break; //don't forget to write break if you don't want your program to execute statement in next "case" option
            case 2:
                System.out.println("the value is 2");
                break;
            case 3:
                System.out.println("the value is 3");
                break;
            default:
                System.out.println("this is default , this is equivalent to 'else' ");
                break;
        }

        //this is another option to write switch - case statement
        // *Enhanced Switch*
        int optionValue = 1;
        switch (optionValue) {
            case 1 -> System.out.println("the value is 1");
            case 2 -> System.out.println("the value is 2");
            case 3 -> System.out.println("the value is 3");
            default -> System.out.println("this is default , this is equivalent to 'else' ");
        }

        System.out.println(getQuarterMonth("X929xasd"));
        printDayOfWeek(0);
    }

    public static String getQuarterMonth(String month){
        String lowerCaseMonth = month.toLowerCase();
        return switch (lowerCaseMonth){
            case "january","february","march" -> "1st";
            case "april","may","june" -> "2nd";
            case "july","august","september"-> "3rd";
            case "october","november","december" -> "4th";
            default -> {
                String badResponse = month + " is not valid month name!";
                //return badResponse , this will return an error, if you want to use return, use "yield" syntax
                yield badResponse;
            }
        };
    }

    public static void printDayOfWeek(int day){
        switch(day){
            case 0 -> System.out.println(day+" is Sunday");
            case 1 -> System.out.println(day+" is Monday");
            case 2 -> System.out.println(day+" is Tuesday");
            case 3 -> System.out.println(day+" is Wednesday");
            case 4 -> System.out.println(day+" is Thursday");
            case 5 -> System.out.println(day+" is Friday");
            case 6 -> System.out.println(day+" is Saturday");
            default -> System.out.println(day+" is Invalid Day");
        }

    }

}
