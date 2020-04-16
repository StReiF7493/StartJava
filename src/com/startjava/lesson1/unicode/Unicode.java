package com.startjava.lesson1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for(char c = '\u0033'; c <= '\u0126'; c++) {
            System.out.println(c);
        }
    }
}