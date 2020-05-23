package com.example.fivespace.methodarea;

import java.util.ArrayList;
import java.util.List;

/***
 * 常量池
 */
public class ChangliangchiOOm {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try {
            for (long i = 0; true; i++) {
                list.add(String.valueOf(i).intern());
            }
        }catch (Exception throwable){
            System.out.println(list.size());
            System.out.println(throwable);
        }
    }
}
