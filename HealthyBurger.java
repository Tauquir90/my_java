public class HealthyBurger extends Hamburger {
    private String burgerName;
    String ADDITIONAL_ITEM1="coke";
    String ADDITIONAL_ITEM2="ice cream";

    public String getADDITIONAL_ITEM2() {
        return ADDITIONAL_ITEM2;
    }

    public String getADDITIONAL_ITEM1() {
        return ADDITIONAL_ITEM1;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public HealthyBurger(String meatType) {
        super("brown rye", meatType);
        this.burgerName="Healthy Burger";
    }
    public int addItem(String item)
    {
        if(item==ADDITIONAL_ITEM1)
        {
            bill+=50;
            return bill;
        }
        if(item==ADDITIONAL_ITEM2){
            bill+=100;
            return bill;
        }
        return -1;
    }
}
