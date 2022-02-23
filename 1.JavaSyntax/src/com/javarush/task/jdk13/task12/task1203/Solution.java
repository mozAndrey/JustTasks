package com.javarush.task.jdk13.task12.task1203;

/* 
Сознательный выбор
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println(getNok(in.nextInt(), in.nextInt()));

    }

    public static int getNok(int number1, int number2) {
        int result = 0;
        int max = 0;
        int min = 0;
        if (number1 > number2) {
            max = number1;
            min = number2;
        } else {
            max = number2;
            min = number1;
        }
        if (number1%number2==0) {
            result = number1;
            return result;
        }
        if (number2%number1==0) {
            result = number2;
            return  result;
        }
        for (int i = min; i > 1; i--) {
            if (min % i == 0 && max % i == 0) {
                result = (number2*number1)/i;
                return result;
            }
        }
        return number1 * number2;
    }
}
