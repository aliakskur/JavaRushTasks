package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static StackTraceElement[] element = null;

    public static void main(String[] args) {
        method1();

    }

    public static String method1() {
        method2();
        element = Thread.currentThread().getStackTrace();

        String methodName = element[2].getMethodName();

        System.out.println(methodName);
        return methodName;

        //напишите тут ваш код
    }

   public static String method2() {
        method3();
        //напишите тут ваш код

       element = Thread.currentThread().getStackTrace();
       String methodName = element[2].getMethodName();
       System.out.println(methodName);
       return methodName;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        element = Thread.currentThread().getStackTrace();
        String methodName = element[2].getMethodName();
        System.out.println(methodName);
        return methodName;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        element = Thread.currentThread().getStackTrace();
        String methodName = element[2].getMethodName();
        System.out.println(methodName);
        return methodName;
    }

    public static String method5() {
        //напишите тут ваш код
        element = Thread.currentThread().getStackTrace();
        String methodName  = element[2].getMethodName();
        System.out.println(methodName);
        return methodName;
    }
}
