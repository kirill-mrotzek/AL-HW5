package com.telran.prof.org.algoritms.homeworkfive;

import java.util.Arrays;
//У вас есть список из n элементов, которые представляют собой оценки студентов по математике.
//Вам нужно отсортировать этот список в порядке убывания оценок с использованием алгоритма сортировки Merge sort.
//Для решения этой задачи напишите функцию, которая принимает на вход список оценок и возвращает новый список, отсортированный в порядке убывания.
//{3, 8, 1, 9, 4, 2, 7, 6, 5 };
public class MergeSortOne {

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 9, 4, 2, 7, 6, 5 };

        mergeSort(arr);

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }

        private static void mergeSort(int[] arr) {
        int lengthArr = arr.length;

        if (lengthArr < 2) {
        return;
        }

        // Делим массив пополам
        int mid = lengthArr / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[lengthArr - mid];

        // Копируем элементы в левую и правую половины
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int j = 0; j < lengthArr - mid; j++) {
            rightArr[j] = arr[j + mid];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;

        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;

        while (leftIndex < leftArrLength && rightIndex < rightArrLength) {
            if (leftArr[leftIndex] >= rightArr[rightIndex]) {
                arr[arrIndex++] = leftArr[leftIndex++];
            } else {
                arr[arrIndex++] = rightArr[rightIndex++];
            }
        }

        while (leftIndex < leftArrLength) {
            arr[arrIndex++] = leftArr[leftIndex++];
        }

        while (rightIndex < rightArrLength) {
            arr[arrIndex++] = rightArr[rightIndex++];
        }
    }
}

