package com.company;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       // Scanner scanner = new Scanner (System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = Arrays.stream(reader.readLine()
                .split(" ")
                .mapToInt(Integer::parseInt)
                .toArray());

        System.out.println(numbers);
    }
}
