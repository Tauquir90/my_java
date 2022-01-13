//importing scanner class
import java.util.Scanner;

public class Scanning {
    public static void main(String... args) {
        // creating object for scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year here..");
        //Taking int as an input
        int year = sc.nextInt();
        System.out.println("Enter your name here....  ");
        String name = sc.next();
        int my_age = 2022 - (year);
        greet(name, my_age);
        System.out.println(" ..press 0 to close and 1 to continue...");
        int option = sc.nextInt();
        while (option != 0) {
            System.out.println("Enter your birth year here..");

            year = sc.nextInt();
            System.out.println("Enter your name here....  ");

            name = sc.next();
            my_age = 2022 - (year);
            greet(name, my_age);
            System.out.println("Enter option again!! 0 to close");
            option = sc.nextInt();
        }
        sc.close();
    }
    public static void greet(String name, int age) {
        if (age < 0 && age > 90) {
            System.out.println("wrong input");
        }
        if (age >= 1 && age < 10) {
            System.out.println("Hello...." + name + ".... ur age is " + age);
            System.out.println("u r small baby");
        }
        if (age < 18 && age >= 10) {
            System.out.println("Hello...." + name + ".... ur age is " + age);
            System.out.println("U please focus on study");
        }
        if (age >= 18 && age <= 30) {
            System.out.println("Hello...." + name + ".... ur age is " + age);
            System.out.println("u need to focus on career");
        }
        if (age > 30 && age <= 45) {
            System.out.println("Hello...." + name + ".... ur age is " + age);
            System.out.println("Focus on your family");
        }
        if (age > 45 && age <= 60) {
            System.out.println("Hello...." + name + ".... ur age is " + age);
            System.out.println("U r old person..better to focus on health..");
        }
        if (age > 60 && age <= 90) {
            System.out.println("Hello...." + name + ".... ur age is " + age);
            System.out.println("u r senior citizen");
        }
    }
}
