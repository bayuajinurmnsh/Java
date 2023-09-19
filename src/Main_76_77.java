public class Main_76_77 {

    public static void main(String[] args) {

        ClassesAndObjects_76_77 car = new ClassesAndObjects_76_77();

        //System.out.println("make = "+car.make); //this will return an error because "make" is a private, so we need to use a setter and getter
        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());
        car.setMake(null);
        car.describeCar();
    }
}
