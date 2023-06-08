public class JavaPrecedence {
    public static void main(String[] args) {
        //access this url https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        //the higher the number of precedence means the important it is

        double firstValue = 20.00d,secondValue = 80.00d,total;

        total = ((firstValue+secondValue) * 100.00d) % 40.00d; //this is the precedence

        boolean isItZero = (total == 0) ? true : false;

        if(!isItZero)
            System.out.print("got some remainder");
    }
}
