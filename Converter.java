public class Converter {
    public static void main(String... args) {
        double inMiles = toMilesPerHour(100);
        System.out.println("Ur speed in miles/hour is "+Math.round(inMiles));
        shouldWakeUp(true,23);
        shouldWakeUp(true,13);
        shouldWakeUp(false,12);
        boolean leap = isLeap(2600);
        if(leap)
        {
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not leap year");
        }
        double in_cm=calcFeetAndInchesToCenti(5,6);
        double in_feet= calcFeetAndInchesToCenti(65);
        System.out.println("ur height in centimetres is "+in_cm);
        System.out.println("Ur height in in feet is "+in_feet);
        String get = getDurationString(500,53);
        String get1 =getDurationString(32,57);
        System.out.println(get);
        System.out.println(get1);
        printYearAndDay(766666666);





    }

    public static double toMilesPerHour(int KiloMetrePerHour) {
        double inMilesPerHour =  (0.621371 * KiloMetrePerHour);
        if (inMilesPerHour > 0) {
            return inMilesPerHour;
        }
       return -1;
    }
    public static void shouldWakeUp(boolean isBarking, int hoursOfDay)
    {
        if(isBarking)
        {
            if(hoursOfDay<8 ||hoursOfDay>22)
            {
                System.out.println("come on get up!!Ur dog is barking at night");
            }
            else{
                System.out.println("U need not to take any action");
            }
        }
        else{
            System.out.println("Ur dog is quite....Give some food..");
        }

    }
    public static  boolean isLeap(int year)
    {
        if(year>=1 && year<=9999)
        {
           if(year % 4== 0)
           {
             if(year % 100 ==0)
             {
                 return year % 400 == 0;
             }
             return false;
           }
           return false;
        }
        return false;
    }
    public static double calcFeetAndInchesToCenti(int feet, int inches)
    {
        if((feet>=0) ||(inches>=0 && inches<=12))
        {
            double inCm = feet * 12 *2.54 +(inches *2.54);
            return inCm;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCenti( double inches)
    {
        if(inches >=0)
        {
           double inFeet = inches/12;
           return inFeet;
        }
        return -1;
    }
    public static String getDurationString(int minutes, int seconds)
    {
        if((minutes>=0) &&(seconds<=59))
        {
           int hours = minutes/60;
           int remaining_minutes = minutes%60;
           return hours+"hr " +remaining_minutes+"mins "+seconds+"sec";
        }
        else{
            return "invalid input";
        }
    }
    public static void printYearAndDay(long minutes)
    {
        if(minutes > 0)
        {
            long year = minutes/60/24/12;
            long day = minutes % 60 % 24 %12;
            System.out.println(year + "year "+day+" days");
        }
              else
        {
            System.out.println("invalid input....");
        }
    }

}

