package Assignment1.Q3;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(10,3);
        Point p2 = new Point(p1);
        System.out.println("Initial Details ---");
        System.out.println("Point 1 = (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Point 2 = (" + p2.getX() + "," + p2.getY() + ")");
        p1.setX(20);
        p1.setY(25);
        System.out.println("Updated Details ---");
        System.out.println("Point 1 = (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Point 2 = (" + p2.getX() + "," + p2.getY() + ")");
    }
}
