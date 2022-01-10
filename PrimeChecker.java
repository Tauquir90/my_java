public class PrimeChecker {
    public static void main(String...args)
    {
       for(int number = 1; number<101; number++)
       {
           int count = 0;
           boolean prime = isPrime(number);
           if(prime)
           {
               System.out.println(number + " is a prime no.");

           }
           count++;
           if(count==3)
               break;
       }
    }
    public static boolean isPrime(int n)
    {
        if(n ==1)
        {
            return false;

        }
        for(int i =2; i<=n/2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
