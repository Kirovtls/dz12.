package com.company;

public class Treugolnyk {
    int a;
    int b;
    int c;

    public void treugolnyk(int a, int b, int c) {
        int storoni = (a + b + c) / 2;
        System.out.println(Math.sqrt(storoni * (storoni - a) * (storoni - b) * (storoni - c)));
    }
}
