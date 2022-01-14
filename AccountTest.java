public class AccountTest {
    public static void main(String...args)
    {
        Account ac = new Account();
        ac.setCustomerName("Tauquir Ahmed");
        ac.setAccountNumber(1234);
        ac.setEmail("tauquir.ahmed90@gmail.com");
        ac.setPhoneNumber("7044607942");
        ac.setBalance(800.0);
        ac.getEmail();
        ac.getPhoneNumber();
        ac.getBalance();
        ac.getCustomerName();
        ac.getBalance();
        ac.depositFund(50000);
        System.out.println( ac.getCustomerName()+ "'s Balance is "+ ac.getBalance());
        System.out.println("Email: "+ac.getEmail());
        System.out.println("Phone : "+ac.getPhoneNumber());
        ac.withdrawFund(9000000);
        System.out.println( ac.getCustomerName()+ "'s Balance is "+ ac.getBalance());
        ac.withdrawFund(30000);
        System.out.println( ac.getCustomerName()+ "'s Balance is "+ ac.getBalance());
        ac.withdrawFund(5000);
        System.out.println( ac.getCustomerName()+ "'s Balance is "+ ac.getBalance());
        ac.depositFund(100000);
        System.out.println("BaLANCE: "+ac.getBalance());
        ac.withdrawFund(560000000);


    }
}
