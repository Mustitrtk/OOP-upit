package Homework1.Distance2d;

public class Point {
    private int x;
    private int y;

    public void get(){
        System.out.println(x+" "+y);
    }
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point p, Point p1){
        return Math.sqrt(Math.pow(p.x-p1.x,2)+Math.pow(p.y-p1.y,2));
    }
}
