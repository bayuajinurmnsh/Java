public class Main_82 {

    public static void main(String[] args) {
        ConstructorChallenge_82 firstConstructor = new ConstructorChallenge_82("Nurmansah",20000.99,"nurmansah@dummymail");
        System.out.println("This is the result from first constructor");
        System.out.println("Name: "+firstConstructor.getName()+"\nCredit Limit: "+firstConstructor.getLimit()+"\nEmail Address: "+firstConstructor.getEmailAddress());

        ConstructorChallenge_82 secondConstructor = new ConstructorChallenge_82();
        System.out.println("\nThis is the result from second constructor");
        System.out.println("Name: "+secondConstructor.getName()+"\nCredit Limit: "+secondConstructor.getLimit()+"\nEmail Address: "+secondConstructor.getEmailAddress());

        ConstructorChallenge_82 thirdConstructor = new ConstructorChallenge_82("Aji","aji@dummymail");
        System.out.println("\nThis is the result from third constructor");
        System.out.println("Name: "+thirdConstructor.getName()+"\nCredit Limit: "+thirdConstructor.getLimit()+"\nEmail Address: "+thirdConstructor.getEmailAddress());

    }

}
