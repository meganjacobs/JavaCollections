package com.meganj.controller;

import com.meganj.domain.Feline;
import com.meganj.factory.*;
import java.util.*;

public class Zoo {

    public static void main(String[] args) {
        Feline tiger, lion, panther;
        tiger= new Tiger();
        tiger.setSound("Growl");
        lion = new Lion();
        lion.setSound("Roar");
        panther = new Panther();
        panther.setSound("Purr");

        //Example of Collection type List (List is an ordered collection and maintain insertion order)
        ArrayList <Feline> felines = new ArrayList<>();
        felines.add(tiger);
        felines.add(lion);
        felines.add(panther);
        System.out.println("LIST IMPLEMENTATION (Ordered by insertion)");
        System.out.println(felines);

        //Example of Set (Set implementation creates a collection of unique elements, without any duplications
        HashSet<String> setFelines = new HashSet<>();
        setFelines.add("One");
        setFelines.add("Two");
        setFelines.add("Three");
        setFelines.add("Four");
        setFelines.add("Five");
        Iterator<String> i=setFelines.iterator();
        System.out.println("SET IMPLEMENTATION (Unique but unsyncronised)");

        while(i.hasNext())
        {
            System.out.print(i.next() + " , ");
        }
        //Example of Map (Maps are unsynchronised with unique keys and can accept at most 1 null)
        Map<Feline, Integer> mapFelines = new HashMap<>();
        mapFelines.put(tiger,2222);
        mapFelines.put(lion,3333);
        mapFelines.put(panther,4444);
        mapFelines.put(null,1111);
        System.out.println("\nMAP IMPLEMENTATION Stores unique keys plus their values");
        System.out.println(mapFelines +"\n");









    }


}
