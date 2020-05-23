package com.example.fivespace.heap;

import java.util.ArrayList;
import java.util.List;

public class JavaVMHeapOOM {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try {
            while (true){
                list.add(1);
            }
        }catch (Throwable throwable){
            System.out.println(list.size());
            System.out.println(throwable);
        }
    }

}
