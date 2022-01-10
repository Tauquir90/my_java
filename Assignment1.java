public class Assignment1 {
    public static void main(String...args)
    {
        //This is the program to calculate of sum of five nos which is divisible by 3 and 5
        int count=0, sum = 0;
        for(int i = 1; i < 101; i++)
        {

            if((i % 3 ==0) && (i % 5==0))
            {
                System.out.println(i+" :This is divided by 3 and 5 both");
                count++;
                sum+=i;
                System.out.println("sum is "+sum);
                if(count==5)
                {
                    break;
                }
            }








        }



    }
}
