package collection.list;

import java.util.ArrayList;

public class arrayIntro {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("saurabh");
        name.add("garg");
        name.add("raju");
        name.add("gupta");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        name.addAll(fruits);
        name.remove("gupta");
        name.removeAll(fruits);
        name.set(1,"gupta");
        System.out.println(name.contains("saurabh"));
        System.out.println(name.size());
        System.out.println(name.get(1));
        System.out.println(name);
    }
}
