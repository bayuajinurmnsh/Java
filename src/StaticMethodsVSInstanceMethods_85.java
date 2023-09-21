/*
    Static Methods
    - Are declared using a static modifier.
    - Can't access instance methods and instant variables directly.
    - They're usually used for operations that don't require any data from an instance of the class (From 'this').
    - If you remember, "this" keyword is the current instance of a class, so inside a static method, we can't use "this" keyword.
    - Whenever you see a method that doesn't use instance variables, that method should probably be declared as a static method.
    - For Example, main is a static method, and it's called by the Java Virtual Machine when starts the Java Application.

    Instance Methods
    - Is a methods belong to an instance of a class.
    - To use an instance methods, we have to instantiate the class first, usually by using the "new" keyword.
    - Instance methods can access instance methods and instance variables directly.
    - Instance methods can access static methods and static variables directly.
* */

class Calculator{
    public static void printSum(int a,int b){
        System.out.println("sum :"+(a+b));
    }
}

public class StaticMethodsVSInstanceMethods_85 {
    public static void main(String[] args) {
        //Static methods are called as ClassName.methodName(); or methodName() only if in the same class
        Calculator.printSum(5, 10);
        printHello();
    }

    public static void printHello(){
        System.out.println("Hello");
    }
}