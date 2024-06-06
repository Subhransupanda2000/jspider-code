package com.example.jspiderjava;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutDuplicates {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            ls.add(i);
        }
        ls.add(5);
        ls.add(4);
        List<Integer> duplicateFreeList = new ArrayList<>();
        for (int j : ls) {
            if (duplicateFreeList.contains(j)
            ) {
            } else {
                duplicateFreeList.add(j);
            }
        }
        System.out.println(duplicateFreeList);
    }
}
