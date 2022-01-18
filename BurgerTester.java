public class BurgerTester {
    public static void main(String...args)
    {
        Hamburger ham = new Hamburger("pla","chicken");
        int my_bill=ham.getBill("basic","tomato","lettuce");
        System.out.println("Ur bill is "+my_bill);
        HealthyBurger h = new HealthyBurger("chicken");
        System.out.println(h.getPrice());
       int your= h.getBill("something","tomato","carrot","lettuce");
        System.out.println("Ur bill is "+your);
        int z =h.addItem("coke");
        int z1 = h.addItem("ice cream");
        System.out.println("ur bill is "+z1);
        DeluxeBurger d = new DeluxeBurger("abc","xyz");
        int deluxe =d.getBill("Deluxe","","","","");
        System.out.println("Ur bill for deluxe burger: "+deluxe);

    }
}
