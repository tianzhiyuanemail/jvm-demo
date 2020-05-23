package com.example.fivespace.stack;

public class JavaVMStackOOM {

    public static void main(String[] args) {
        b();
    }

    /***
     *  不断的创建线程
     */
    public static void b() {
        while (true){
            new Thread(() -> {
                // 使用死循环 避免线程被回收
                while (true){}
            }).start();
        }
    }

}
