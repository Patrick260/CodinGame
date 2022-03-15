/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int n = input.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += input.nextInt();

        }

        final double average = (double) sum / n;

        if ((int) average == average) {

            System.out.println((int) average);

        } else {

            System.out.println(average);

        }

    }

}
