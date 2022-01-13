import java.util.Scanner;

public class Scan1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        //This is for taking 10 numbers from input n adding them...
        int count = 1;

        int num = 10;
        int number = 0;
        int sum = 0;


        while (num > 0) {
            System.out.println("Enter number # :" + count);

            boolean hasNext = sc.hasNextInt();
            if (hasNext) {

                number = sc.nextInt();
                sum += number;
                num--;
                count++;
            } else {
                System.out.println("u entered an invalid number");
            }
            sc.nextLine();

        }
        System.out.println("sum is :" + sum);
    }


}

