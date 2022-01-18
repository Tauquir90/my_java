public class Hamburger {
    private String name;

    public String getName() {
        return name;
    }

    public void setName() {
        if(price>=150 && price<=175){
            name="basic";
        }
        if(price>175 && price<=220)
        {
            name="premium";
        }
        if(price>220 && price<=300)
        {
            name="deluxe";
        }

    }


    int bill;

    private int price;
    private String rollType;
    private String meatType;
    int count;
    public Hamburger( String rollType, String meatType)
    {
        this.rollType=rollType;
        this.meatType=meatType;
        if(rollType=="plain" && meatType=="chicken")
        {
            price=150;
        }
        if(rollType=="special" && meatType=="chicken")
        {
            price=175;
        }
        if(rollType=="special" && meatType=="paneer")
        {
            price=220;
        }
        if(rollType=="plain" && meatType=="paneer")
        {
            price=190;
        }
        if(rollType=="special" && meatType=="mutton")
        {
            price=300;
        }
        if(rollType=="plain" && meatType=="mutton")
        {
            price=250;
        }
        else{
            price=140;
        }
    }

    public int getBill(String burger,String...x)
    {
        bill = bill + getPrice();
        if(burger!="Deluxe"){
            for(String x1:x)
            {
                if (x1=="tomato")
                {
                    bill+=15;
                }
                if(x1 =="lettuce")
                {
                    bill+=20;
                }
                if(x1=="carrot")
                {
                    bill+=20;
                }
                if(x1=="onion")
                {
                    bill+=10;
                }
            }



            return bill;
        }
          return 500;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getRollType() {
        return rollType;
    }

    public int getPrice() {
        return price;
    }
}
