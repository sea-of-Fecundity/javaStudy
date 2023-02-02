package com.example.javastudy.parallelsort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.System.nanoTime;

public class ParallelSortStudy {
    public static void main(String[] args) {
        int size = 5000;
        int[] numbers = new int[size];
        Random random = new Random();
        int sortIsFasterThenParallel= 0;
        int count = 0;
        int pallelIsFasterThenSort = 0;

        while (1000>count) {
            IntStream.range(0, size).forEach(i -> numbers[i] = random.nextInt());
            long start = nanoTime();
            Arrays.sort(numbers);
            Long sortTime = (nanoTime() - start);

            IntStream.range(0, size).forEach(i -> numbers[i] = random.nextInt());
            start = nanoTime();
            Arrays.parallelSort(numbers);
            Long parallelTime = nanoTime() - start;

            if (sortTime < parallelTime) {
                sortIsFasterThenParallel++;
            }
            else pallelIsFasterThenSort++;
            count++;

        }
        System.out.println("sort is faster then parallel = " + sortIsFasterThenParallel  +" \n"+  "parallel is faster then sort = " + pallelIsFasterThenSort);
    }
}
