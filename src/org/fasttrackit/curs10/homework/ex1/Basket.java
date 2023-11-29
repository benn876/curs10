package org.fasttrackit.curs10.homework.ex1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<String> fruits = new ArrayList<>();

//    public Basket(List<String> fruits){
//        List<String> newList = new ArrayList<>();
//        newList.addAll(fruits);
//        this.fruits = newList;
//    }

    public Basket(List<String> fruits){
        this.fruits.addAll(fruits);
    }

    public List<String> getFruits() {
        return fruits;
    }

    public boolean find(String fruit){
        if(fruit == null || fruit.isBlank()){
            return false;
        }

//        for(String value : fruits){
//            if(fruit.equals(value)){
//                return true;
//            }
//        }
//        return  false;

        return fruits.contains(fruit);
    }

    public void add(String fruit){
        if(fruit != null && !fruit.isBlank()){
            fruits.add(fruit);
        }
    }
}
