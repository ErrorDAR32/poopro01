package app;

public class Point {

    private int id;
    private int color;

    public Point(int pId, int pColor) {
        this.id = pId;
        this.color = pColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
