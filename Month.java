public class Month {
    public static void main(String... args) {

        //boolean leap = isLeap(2021);
        int days = noOfDays(2021,9);
        System.out.println("No od days in  this month is "+days);

    }

    public static boolean isLeap(int year) {
        if (year >= 0 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }
    public static int noOfDays(int year,int month)
    {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       boolean leap = isLeap(year);
       if(leap)
       {
           days[1]=29;
           return days[month];

       }
       else
       {
           //days[1]=28;
           return days[month];
       }
    }
}
