package com.example.fivespace.stack;

/***
 * 栈 测试类
 */
public class JavaVMStackSOF  {

    private static Integer count = 1;
    public static void main(String[] args) {
        a();
    }

    /***
     * 通过递归方法调用
     */
    public static void a() {
        try {
            count ++;
            a();
        }catch (Throwable e){
            System.out.println(count);
            System.out.println(e);
        }
    }
}