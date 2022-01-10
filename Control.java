public class Control {
    public static void main(String... args) {
        char ch = 'z';
        switch (ch) {
            case 'A', 'B', 'C':
                System.out.println("does not match");

                break;
            default:
                System.out.println("nothing matches");
                System.out.println("right one was:" + ch);
                break;
        }
        printDayOfTheWeek(0);
    }

    public static void  printDayOfTheWeek(int day) {
        switch (day) {
            case 0:

                System.out.println("day is Sunday");
                break;

            case 1:
                System.out.println("day is Monday");
                break;
            case 2:
                System.out.println("day is Tuesday");
                break;
            case 3:
                System.out.println("day is Wednesday");
                break;

            case 4:
                System.out.println("day is Thursday");
                break;
            case 5:
                System.out.println("day is Friday");
                break;
            case 6:
                System.out.println("day is Saturday");
                break;
            default:
                System.out.println("Invalid day");



        }
    }
}
