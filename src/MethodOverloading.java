public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(100));
        System.out.println(convertToCentimeters(0,68));

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(-3945));

        printYearsAndDays(525600);
    }

    public static double convertToCentimeters(int height){

        double result = height*2.54d;

        return result;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches){

        int inches;
        double result;

        inches = (heightFeet * 12) + heightInches;
        result = convertToCentimeters(inches);

        return  result;
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds/60;
            int remainingSeconds = seconds % 60;

            return getDurationString(minutes , remainingSeconds);
        }else{
            return "Please enter a correct seconds, the correct seconds is equal or greater than zero";
        }


    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)){
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return hours+"h "+remainingMinutes+"m "+remainingSeconds+"s ";
        }else{
            if(minutes<0)
                return "Please enter a correct minute(s), the correct minute(s) is equal or greater than zero";
            else
                return "Please enter a correct seconds, the correct seconds is between 0 - 59";
        }
    }

    public static void printYearsAndDays(long minutes){
        if(minutes<0)
            System.out.println("Invalid Value");
        else{
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long remainingDay = day % 365;

            System.out.println(minutes+" min = "+year+" y and "+remainingDay+" d");

        }
    }

}
