public class IfThen {

    public static void main(String[] args) {
        boolean isHuman = false;
        //option 1
        if(isHuman == false) {
            System.out.println("You are an alien");
            System.out.println("You are a human");
        }

        /*option2 -> note: if you use an "if" operator
        within curly bracket "{}" you can only use this if there is only one statement inside the if logic */
        if(isHuman == true)
            System.out.println("You are an alien_");
            System.out.println("You are a human_");//this will be printed,

        /*option3 : if(isHuman) this is equal to if(isHuman==true)
                    if(!isHuman) this is equal to if(isHuman!=true) or if(isHuman==false) */
        if(!isHuman)
            System.out.println("You are an alien___");
    }
}
