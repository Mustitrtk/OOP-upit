package Homework1.Distance;
import java.util.*;
public class HomeworkDistance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How much distance result do you want to calculate: ");
        int results = sc.nextInt();

        int[][] coordinats = new int[results][2];

        for(int i =0; i<results;i++){
            System.out.println("Enter x and y : ");
            coordinats[i][0] = sc.nextInt();
            coordinats[i][1] = sc.nextInt();
        }

        for(int j =0; j<results;j++){
            Point p = new Point();

            p.set(coordinats[j][0], coordinats[j][1]);
            
            System.out.println("Distance from origin : "+p.distance(p));
        }

        sc.close();
    }
}
