public class Floor {
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Floor(int width, int height)
    {
        this.width=width;
        this.height= height;
    }
    public int getArea()
    {
        return getWidth()*getHeight();
    }
}
