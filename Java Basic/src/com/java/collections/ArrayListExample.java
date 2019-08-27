package com.java.collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Steve");
        arrayList.add("Tim");
        arrayList.add("Lucy");
        arrayList.add("Pat");
        arrayList.add("Angela");
        arrayList.add("Tom");

        System.out.println(arrayList);

        arrayList.add(3,"Steve");

        System.out.println(arrayList.indexOf("Steve"));
        System.out.println(arrayList);

        arrayList.remove("Steve");
        arrayList.remove("Angela");

        System.out.println(arrayList);

        arrayList.remove(2);

        System.out.println(arrayList);

        System.out.println(arrayList.get(1));

        ArrayListExample a = new ArrayListExample();
        a.iteratingArrayList();
    }

    public void iteratingArrayList(){

        ArrayList<String> alist=new ArrayList<>();
        alist.add("Gregor Clegane");
        alist.add("Khal Drogo");
        alist.add("Cersei Lannister");
        alist.add("Sandor Clegane");
        alist.add("Tyrion Lannister");

        for(String a:alist){
            System.out.println(a);
        }
    }
}
