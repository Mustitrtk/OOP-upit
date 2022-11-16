package Homework2.GrowingOrder;
import java.util.*;
public class GrowingOrder{
    public static void main(String[] args) {

        GrowingEnter g = new GrowingEnter();

        ArrayList lista = new ArrayList();

        Scanner sc = new Scanner(System.in);

        int ent=0;

        while(ent!=-1){

            System.out.print("nr: ");
            ent = sc.nextInt();


            lista.add(ent);

        }

        lista.remove(lista.size()-1);

        g.set(lista);

        Collections.sort(lista);
        
        System.out.println(g.compare(lista)?"Yes, they are in a growing order.":"No, they are not in a growing order.");

        sc.close();
    }
}