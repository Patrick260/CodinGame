/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);
        final String MESSAGE = input.nextLine();

        final StringBuilder encoded_string = new StringBuilder();

        Character previous = '2';

        for(final Character c : MESSAGE.toCharArray()) {

            final StringBuilder binary_string = new StringBuilder(Integer.toBinaryString(c));

            while (binary_string.length() < 7) {

                binary_string.insert(0, "0");

            }

            for (final Character cc : binary_string.toString().toCharArray()) {

                if (cc != previous) {

                    if (cc == '0') {

                        encoded_string.append(" 00 ");

                    } else {

                        encoded_string.append(" 0 ");

                    }

                }

                encoded_string.append(0);

                previous = cc;

            }

        }

        System.out.println(encoded_string.toString().replaceFirst(" ", ""));

    }

}
