package Homework2.GrowingOrder;

import java.util.ArrayList;

public class GrowingEnter {
    public ArrayList list = new ArrayList();

    public void set(ArrayList l){
        list.addAll(l);
    }

    public void get(){
        for (Object object : list) {
           System.out.println(object); 
        }
    }

    public boolean compare(ArrayList l){
        boolean b = true;
        for(int i =0; i<l.size();i++){
            if(l.get(i)!=this.list.get(i)){
                return false;
            }
        }
        return b;
    }
}
