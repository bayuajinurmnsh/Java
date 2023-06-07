public class IfThenWithOperator {
    public static void main(String[] args) {
        int firstScore = 100;
        int secondScore = 75;

        // True OR False = True
        if(firstScore == 100 || firstScore > 100) // greater than (>)
            System.out.print("you get A Score");

        //False AND True = False
        if(firstScore != 100 && firstScore > 80)
            System.out.print("You don't get A Score");

        //True AND True = True
        if( (firstScore > secondScore) && (firstScore >= 100) )
            System.out.print("you get A score");

    }
}
