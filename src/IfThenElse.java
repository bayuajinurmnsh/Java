public class IfThenElse {
    public static void main(String[] args) {

        int healthPoint = 100;
        int checkpoint = 1;

        if(healthPoint>100){
            //code that runs first
            System.out.print("you are cheating!");
        } else if(healthPoint<=0 && checkpoint <1){
            //code in this block will execute
            // if conditions in "if" is false
            System.out.print("game over!");
        } else {
            //code in this block will execute
            // if all conditions above are false
            System.out.print("Your game is continue;");
        }

    }
}
