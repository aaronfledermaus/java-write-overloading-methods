package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public int add(int ... arg) {
        int sum = 0;
        for (int a : arg) {
            sum += a;
        }
        return sum;
    }

    public String add(String a, String b, String c) {
        return a + b + c;
    }
}
