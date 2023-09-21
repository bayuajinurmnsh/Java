class DogStatic{
    private static String nameStatic;

    public DogStatic(String name){
        DogStatic.nameStatic = name;
    }

    public void printName(){
        System.out.println("name :"+ nameStatic);
    }
}

class DogInstance{
    private String nameInstance;

    public DogInstance(String name){
        this.nameInstance=name;
    }

    public void printName(){
        System.out.println("name :"+nameInstance);
    }
}

public class StaticVSInstanceVariables_84 {
    public static void main(String[] args) {
        DogStatic dog1 = new DogStatic("Dog 1");
        DogStatic dog2 = new DogStatic("Dog 2");
        dog1.printName(); //this will print dog 2
        dog2.printName(); //this will print dog 2

        DogInstance dogInstance1 = new DogInstance("Dog Instance 1");
        DogInstance dogInstance2 = new DogInstance("Dog Instance 2");
        dogInstance1.printName(); //this will print Dog Instance 1
        dogInstance2.printName(); //this will print Dog Instance 2
    }
}
