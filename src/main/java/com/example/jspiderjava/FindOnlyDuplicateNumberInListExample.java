package com.example.jspiderjava;
import java.util.ArrayList;
import java.util.List;

public class FindOnlyDuplicateNumberInListExample {

    public static void main(String...a){
        List<Integer> list = new ArrayList<Integer>();
        int highestNumberInList=6;
        for(int i=1;i<=highestNumberInList;i++){
            list.add(i);
        }
        list.add(5);
        System.out.println("list is: "+list);
        System.out.println("Only duplicate number in list is: "+findOnlyDuplicateNumberInList(list,highestNumberInList));
    }
    public static int findOnlyDuplicateNumberInList(List<Integer> list, int highestNumberInList){

        int sumOfNumbersList = 0;
        for(int n:list){
            sumOfNumbersList =sumOfNumbersList+n;
        }

        int onlyDuplicateNumberInList = sumOfNumbersList - ((highestNumberInList)*(highestNumberInList+1)/2);
        return onlyDuplicateNumberInList;
    }

}