public class KeywordAndExpressions { //public class it called a reserved keyword
    public static void main(String[] args) { // public static void it called a reserved keyword
        int keyword1 ; // "int" it called a reserved keyword

        // "feet = (50 * 0.0003048)" it called an expression
        // "double feet = (50 * 0.0003048); //1 feet = 0.0003048 km" it called java statement
        double feet = (50 * 0.0003048); //1 feet = 0.0003048 km

        int score = 40;

        if (score < 75){
            score +=35; // equals to score = score + 35
        }

        int health = 100;
        if((health <25)&& (score>70)){ // there are 2 expression,
            // 1. health <25 , 2. score > 70 , semicolon, if, operator are not expressions
            score -=20; //equals to score = score -20
        }
    }
}