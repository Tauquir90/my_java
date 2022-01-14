public class Tester {
    public static void main(String...args){
        Floor f = new Floor(40,98);
        Carpet c = new Carpet(23);
        Calculator calc = new Calculator(f,c);
        System.out.println("Total carpet area cost: "+calc.getCost());
    }
}
