package com.telran.prof.org.algoritms.homeworkfive;

//Дан массив объектов типа Person, который содержит поля name (тип String) и age (тип int).
//Необходимо отсортировать этот массив по возрасту в порядке убывания, используя алгоритм Merge sort.

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}