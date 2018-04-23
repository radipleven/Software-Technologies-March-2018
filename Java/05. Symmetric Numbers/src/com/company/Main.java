package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 1; i <=n ; i++) {
            boolean check = isSemetric(i);
                if (check){
                  nums.add(i);
            }
        }
        System.out.println(nums);
    }

    public static boolean isSemetric (long number) {
        if (number == 0) return true;
        else if (number < 0) return false;
        long DEG_10 = (long)(Math.pow(10, (int)Math.log10(number)));

        while (number > 0){
            long dStart = number / DEG_10;
            long dEnd = number % 10;
            if (dStart != dEnd) return false;
            number = (number - dStart * DEG_10 - dEnd) / 10;
            DEG_10 /= 100;
        }

        return true;
    }
}
