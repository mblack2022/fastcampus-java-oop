package fastcampus;

import fastcampus.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> bubbleSort = new BubbleSort<>();

        System.out.println("[bubbleSort result] " + bubbleSort.sort(Arrays.asList(args)));
    }
}