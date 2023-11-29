package org.fasttrackit.curs10.code.collections;

import org.fasttrackit.curs10.homework.ex2.Person;
import org.fasttrackit.curs10.homework.ex2.Welder;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                /*
                -> prioritate pentru cei tineri
                     o1.age = 22
                     o2.age = 55
                     o1- o2 = -33

                  -> prioritate pentru cei mai invarsta
                     o1.age = 22
                     o2.age = 55
                     o2 - o1 = 55 -22 = 33
                 */
                return o2.getAge() - o1.getAge();
            }
        });

        priorityQueue.add(new Welder("Georgica",12));
        priorityQueue.add(new Welder("Ionel",55));
        priorityQueue.add(new Welder("Mihai",22));

//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue);

        Stack<Person> stack = new Stack<>();
        stack.add(new Welder("Georgica",12));
        stack.add(new Welder("Ionel",55));
        stack.add(new Welder("Mihai",22));

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

        LinkedList example = new LinkedList();
        example.getFirst();
        example.getLast();
    }
}
