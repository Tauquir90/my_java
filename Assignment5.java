public class Assignment5 {
    public static void main(String... args) {
        //This is program for sum of digits
        int sum_dig = sumDigits(-987123547);
        int first_last = firstAndLastSum(-17);
        int sumOfEven = sum_even(123456);
        System.out.println(sumOfEven);
        System.out.println(sum_dig);
        System.out.println(first_last);

    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;


        }
        return sum;
    }

    public static int firstAndLastSum(int num) {
        int sum = 0;
        if (num > 10) {
            int digit1 = num % 10;
            int digit = 0;
            while (num > 0) {
                int count = 0;
                digit = num % 10;

                num /= 10;

            }
            int final_digit = digit + digit1;
            return final_digit;
        }
        return -1;
    }

    public static int sum_even(int num) {
        int sum = 0;
        if (num > 10) {
            while (num > 0) {
                int position = 1;
                int digit = num % 10;
                if (position % 2 == 0) {
                    sum += digit;

                }
                num /= 10;
                position++;
                return sum;
            }


        }
        return -1;
    }
}



