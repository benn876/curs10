package org.fasttrackit.curs10.homework.ex2;

public abstract class Person {
    private final String name;
    private final String position;
    private final Integer age;

    public Person(String name, String position, Integer age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person with position: %s, name:%s, age:%s".formatted(position, name, age);
    }
}
