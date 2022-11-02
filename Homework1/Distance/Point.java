package Homework1.Distance;

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
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x, 2)+ Math.pow(this.y, 2));
    }
}
