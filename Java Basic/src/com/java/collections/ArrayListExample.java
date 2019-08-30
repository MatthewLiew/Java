package com.java.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

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
        a.initializeArrayList();
        a.initializeArrayList2();
        a.sortStringArrayList();
        a.sortInDescendingOrder();
        a.appendCollectionElementstoArrayList();
        a.synchronizeArrayListByCollections();
        a.synchronizeArrayListByCopyOnWriteArrayList();
    }

    public void iteratingArrayList(){

        ArrayList<String> alist=new ArrayList<>();
        alist.add("Gregor Clegane");
        alist.add("Khal Drogo");
        alist.add("Cersei Lannister");
        alist.add("Sandor Clegane");
        alist.add("Tyrion Lannister");

        System.out.println("\n**Iterating ArrayList**");
        for(String a:alist){
            System.out.println(a);
        }
    }

    public void initializeArrayList(){
        ArrayList<String> obj = new ArrayList<>(
                Arrays.asList("Pratap", "Peter", "Harsh")
        );

        System.out.println("\n**Initialization using Arrays.asList**");
        System.out.println("Elements are: " + obj);
    }

    public void initializeArrayList2() {
        ArrayList<String> cities = new ArrayList<String>() {{
            add("Delhi");
            add("Agra");
            add("Chennai");
        }};

        System.out.println("\n**Initialization using anonymous inner class method**");
        System.out.println("Elements are: " + cities);
    }

    public void sortStringArrayList(){
        ArrayList<String> listofcountries = new ArrayList<>();
        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");

        System.out.println("\n**Sorting of Arraylist<String>**");
        System.out.println("\nBefore Sorting");
        for(String counter: listofcountries){
            System.out.println(counter);
        }

        Collections.sort(listofcountries);

        System.out.println("\nAfter Sorting");
        for(String counter: listofcountries){
            System.out.println(counter);
        }
    }

    public void sortInDescendingOrder(){
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("\n**Sorting in Descending Order**");
        System.out.println("\nBefore Sorting:");
        for(String str: arraylist){
            System.out.println(str);
        }

        /* Sorting in decreasing order*/
//        Collections.sort(arraylist, Collections.reverseOrder());
        Collections.reverse(arraylist);

        /* Sorted List in reverse order*/
        System.out.println("\nArrayList in descending order:");
        for(String str: arraylist){
            System.out.println(str);
        }
    }

    public void appendCollectionElementstoArrayList(){
        ArrayList<String> al = new ArrayList<>();

        al.add("Hi");
        al.add("hello");
        al.add("String");
        al.add("Test");
        System.out.println("ArrayList1 before addAll:"+al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Text1");
        al2.add("Text2");
        al2.add("Text3");
        al2.add("Text4");

        al.addAll(al2);
        System.out.println("ArrayList1 after addAll: "+ al);
    }

    public void synchronizeArrayListByCollections(){

        List<String> syncAL = Collections.synchronizedList(new ArrayList<>());

        syncAL.add("Pen");
        syncAL.add("NoteBook");
        syncAL.add("Ink");

        System.out.println("Iterating synchronized ArrayList: ");
        synchronized (syncAL){
            Iterator<String> iterator = syncAL.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

    public void synchronizeArrayListByCopyOnWriteArrayList(){
        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();

        al.add("Pen");
        al.add("NoteBook");
        al.add("Ink");

        System.out.println("Displaying synchronized ArrayList Elements:");
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
