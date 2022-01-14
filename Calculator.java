public class Calculator {
    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor, Carpet carpet)
    {
        this.floor = floor;
        this.carpet = carpet;
    }

    public Floor getFloor() {
        return floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }
  public int getCost()
  {
      return floor.getArea()*carpet.costPerSquareMetre;
  }

}
