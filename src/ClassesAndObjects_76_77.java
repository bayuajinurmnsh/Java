public class ClassesAndObjects_76_77 {
    /*
    Class -> describes the data(fields) and the behaviour (methods) that are relevant to the real world object we want to describe
    */

    /*to set a value we can use setter and getter

    what is setters and getters ?
    a getter is a method on a class that retrieves the value of a private field and returns it.
    a setter is a method on a class that sets the value of a private field.

    THE PURPOSE OF THESE METHODS IS TO CONTROL AND PROTECT ACCESS TO PRIVATE FIELDS.
     */

    // "this" is a special keyword in java. What it really refers to it the instance that was created when the object was instantiated.

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden","porsche","tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
