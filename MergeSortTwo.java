package com.telran.prof.org.algoritms.homeworkfive;

import java.util.Arrays;

public class MergeSortTwo {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };

        mergeSort(people);

        System.out.println("Sorted by age : ");
        System.out.println(Arrays.toString(people));
    }

    private static void mergeSort(Person[] people) {
        if (people.length < 2) {
            return;
        }

        int mid = people.length / 2;
        Person[] left = Arrays.copyOfRange(people, 0, mid);
        Person[] right = Arrays.copyOfRange(people, mid, people.length);

        mergeSort(left);
        mergeSort(right);

        merge(people, left, right);
    }

    private static void merge(Person[] people, Person[] left, Person[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].age >= right[j].age) {
                people[k++] = left[i++];
            } else {
                people[k++] = right[j++];
            }
        }

        while (i < left.length) {
            people[k++] = left[i++];
        }

        while (j < right.length) {
            people[k++] = right[j++];
        }
    }
}

