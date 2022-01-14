package data_structure;

import java.util.ArrayList;

public class array_1 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList();
        ArrayList<String> b=new ArrayList();
        a.add("apple");
        a.add("grapes");
        a.add("orange");
        a.add("mango");
        a.remove("mango");
        b.add("saurabh");
        b.add("raju");
        a.addAll(b);
        System.out.println(a);
        System.out.println(a.get(3));
        System.out.println(a.size());
        ArrayList<String> fruits= new ArrayList<>();

    }
}
