/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int a = input.nextInt();
        final int b = input.nextInt();
        final int c = input.nextInt();

        if (a * 120 - c > b) {

            System.out.println("true");

        } else {

            System.out.println("false");

        }

    }

}
