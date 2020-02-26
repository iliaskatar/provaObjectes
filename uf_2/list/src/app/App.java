package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        HashMap<Integer, ArrayList<Object>> map = new HashMap<>();
        ArrayList<Object> al2 = new ArrayList<>();
        al2.add("hola");
        al2.add(4);
        // map.put(1, al);// si fem un get 1 ens sortira tot laray put clau
        int x = (int) map.get(1).get(1);
        map.replace(1, al2);// modificar
    }

    public static void printmapa(map<Integer, ArrayList<Object>> x){
         x.forEach(k,v) -> {
            System.out.println("clau"+k);
            for (object o : v) {
                System.out.println(0);
            }
            
        };

    }
}