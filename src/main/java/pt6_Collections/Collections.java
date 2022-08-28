package pt6_Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        hashMapDemo();

    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("orange");

        System.out.println(fruit.size());
        System.out.println(fruit);

        System.out.println("Demo looping through Sets");
        for (String item: fruit){
            System.out.println(item);
        }

    }

    public static void listDemo(){
        List fruit = new ArrayList<Integer>();
        fruit.add("apple");
        fruit.add("orange");

        System.out.println(fruit.get(1));
    }

    public static void hashMapDemo(){
        Map<String, Double> dict = new HashMap();
        dict.put("a", 2.3);
        dict.put("b", 0.7);
        dict.put("c", 1.1);

        System.out.println(dict.get("c"));

        System.out.println("Demo hashMaps");
        for (var entry: dict.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
