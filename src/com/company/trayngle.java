package com.company;
import java.util.Scanner;
public class trayngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите число 9: " );
        int n = scanner.nextInt();
        int s = 9;
        for (int i = 1; i <= s; i++) {
            System.out.println();
            for (int j = 1; j <= s; j++) {
                if (i == 1 || i == s || j == i || j == s - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}