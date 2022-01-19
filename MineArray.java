import java.util.Scanner;

public class MineArray {
        private static Scanner sc = new Scanner(System.in);
        public static void main(String...args)
        {
            System.out.println("how many integer u wanna type");
            int count = sc.nextInt();
            sc.nextLine();
            int [] myIntegers = getIntegers(count);
            for(int i =0; i<myIntegers.length; i++)
            {
                System.out.println("Element "+i+" , typed value was "+myIntegers[i]);
            }
            System.out.println("Average value was :"+getAverage(myIntegers));

        }
        public static int [] getIntegers(int number)
        {
            System.out.println("Enter "+number +" integers.\r");
            int [] values = new int[number];
            for(int i =0; i < values.length; i++)
            {
                values[i]=sc.nextInt();
            }
            return values;
        }
        public static double getAverage(int [] array)
        {
            int sum =0;
            for(int i =0; i <array.length; i++)
            {
                sum+=array[i];

            }
            return (double)sum/(double)array.length;
        }
    }

