public class Methods {

    public static void main(String[] args) {
        /* Definition
            A method declare executable code that can be invoked, passing
            a fixed number of values as arguments. */

        /*Benefits
            1. Reducing the code duplication
            2. Can be executed many times with potentially different results
                by passing data to the method in the form of arguments
         */

        triangleAreaOption1(); // "void" doesn't return a value
        triangleAreaOption2(50.2f , 30.3f); // using parameter to pass "base" value and "height" value

        //this option 3 method, using float as a return value
        System.out.println(triangleAreaOption3(10.2f , 30f));

        //use return value from method as a parameter for another method
        displayResult("Bayu",calculateHighScorePosition(1500));
        displayResult("Aji",calculateHighScorePosition(1000));
        displayResult("Nurmansah",calculateHighScorePosition(500));
        displayResult("Didik",calculateHighScorePosition(100));
        displayResult("Nugraha",calculateHighScorePosition(25));

    }

    public static void triangleAreaOption1() {
        float base = 17.2f, height = 15.6f, area;

        area = 0.5f*base*height;
        System.out.println(area);
    }

    public static void triangleAreaOption2(float base, float height) {
        float area;

        area = 0.5f*base*height;
        System.out.println(area);
    }

    public static float triangleAreaOption3(float base, float height){
        float area;

        area = 1f/2f * base * height;
        return area;
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000)
            return 1;
        else if(playerScore>=500 && playerScore <1000)
            return 2;
        else if(playerScore>=100 && playerScore<500)
            return 3;
        else
            return 4;
    }

    public static void displayResult(String studentName , int position){
        System.out.println(studentName+" is Ranking : "+position);
    }
}


