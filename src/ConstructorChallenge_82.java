public class ConstructorChallenge_82 {
    /*
    1.Create a new class, called Customer, with three fields:
        -name
        -credit limit
        -email address.
    2.Create the getter methods only, for each field.  You don't need to create the setters.
    3.Create three constructors for this class:
        -First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
        -Second, create a no args constructor that calls another constructor, passing some literal values for each argument.
        -And lastly, create a constructor with just the name and email parameters, which also calls another constructor.
     */

    private String name;
    private double limit;
    private String emailAddress;

    public ConstructorChallenge_82(String name, double limit, String emailAddress) {
        this.name = name;
        this.limit = limit;
        this.emailAddress = emailAddress;
    }

    public ConstructorChallenge_82(){
        this("Bayu",15000.00,"bayu@dummymail");
    }

    public ConstructorChallenge_82(String name, String emailAddress) {
        this(name,1450.99,emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
