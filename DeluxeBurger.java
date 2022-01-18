public class DeluxeBurger extends  Hamburger {
    String item1="cold drinks";
    String item2 ="chips";
    public DeluxeBurger(String rollType, String meatType) {
        super(rollType, meatType);
    }

    public String getItem2() {
        return item2;
    }

    public String getItem1() {
        return item1;
    }

}
