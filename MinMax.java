import java.util.Scanner;
// THIS IS THE PROGRAM FOR FINDING MINIMUM N MAX NOS AMONG SEVERAL NOS..

public class MinMax {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int min = 0, max = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number " + count);

            boolean hasNext = sc.hasNextInt();
            if (hasNext) {
               // System.out.println("Enter number " + count);
                int num = sc.nextInt();
                if(first){
                    first = false;
                    max = num;
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                count++;


            } else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("Min is : "+min +"..."+" Max is: "+max);

    }


}


