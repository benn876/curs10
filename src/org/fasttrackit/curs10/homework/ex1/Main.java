package org.fasttrackit.curs10.homework.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> someFruits = new ArrayList<>();
        someFruits.add("apple");
        someFruits.add("banana");
        someFruits.add("orange");

        Basket basket = new Basket(someFruits);
        Basket basket2 = new Basket(someFruits);

        System.out.println(basket.find(null));
        System.out.println(basket.find("    "));
        System.out.println(basket.find("apple"));
        someFruits.add("evil fruit");
        someFruits.add(null);
        someFruits.add(null);
        basket.add("alune");
        System.out.println(basket.getFruits());
        System.out.println(basket2.getFruits());
    }
}
