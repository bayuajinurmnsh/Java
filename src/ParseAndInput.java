public class ParseAndInput {
    public static void main(String[] args) {

        String currentYear = "2023";
        String usersDOB = "1999";

        // "Integer" is a build in class, "parseInt" is a build in method in Integer class
        int dateOfBirth = Integer.parseInt(currentYear) - Integer.parseInt(usersDOB);

        //parse from string to
        System.out.println("Age = "+ (dateOfBirth));

        //console will error if you run it from intellij, if you want this working correctly
        // you need to run this program from console
        System.out.println(getInputFromConsole(Integer.parseInt(currentYear)));
    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, What's your Name ? ");
        System.out.println("Hello "+name);
        String DOB = System.console().readLine("What year you were born ?");
        int age = currentYear - Integer.parseInt(DOB);
        System.out.println("Your age is : "+age);

        return "";

    }

}
