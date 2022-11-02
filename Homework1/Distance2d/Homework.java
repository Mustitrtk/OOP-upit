package Homework1.Distance2d;

import java.util.*;

public class Homework {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How much distance result do you want to calculate: ");
        int results = sc.nextInt();

        int[][] coordinats = new int[results*2][2];

        for(int i =0; i<results*2;i+=2){
            System.out.println("Enter x and y (first dot on coordinate system): ");
            coordinats[i][0] = sc.nextInt();
            coordinats[i][1] = sc.nextInt();

            System.out.println("Enter x and y (second dot on coordinate system): ");
            coordinats[i+1][0] = sc.nextInt();
            coordinats[i+1][1] = sc.nextInt();

            Point p = new Point();
            Point p1 = new Point();

            p.set(coordinats[i][0], coordinats[i][1]);
            p1.set(coordinats[i+1][0], coordinats[i+1][1]);
            
            System.out.println("Distance : "+p.distance(p, p1));
        }

        sc.close();
    }
}