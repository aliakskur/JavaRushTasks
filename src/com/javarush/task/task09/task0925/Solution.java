package com.javarush.task.task09.task0925;

/* 
Статики не на своем месте
*/

public class Solution {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        //room.A = 10;

        Solution.D = 5;

        System.out.println(A);
     //   System.out.println(room.A);
        System.out.println(Solution.A);
    }

    public int getA() {
        return A;
    }

}
