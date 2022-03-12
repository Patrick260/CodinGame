/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final String message = input.nextLine();

        final StringBuilder encodedString = new StringBuilder();

        Character previous = '2';

        for(final Character c : message.toCharArray()) {

            final StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(c));

            while (binaryString.length() < 7) {

                binaryString.insert(0, "0");

            }

            for (final Character cc : binaryString.toString().toCharArray()) {

                if (cc != previous) {

                    if (cc == '0') {

                        encodedString.append(" 00 ");

                    } else {

                        encodedString.append(" 0 ");

                    }

                }

                encodedString.append(0);

                previous = cc;

            }

        }

        System.out.println(encodedString.toString().replaceFirst(" ", ""));

    }

}
