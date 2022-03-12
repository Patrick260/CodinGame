/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final String alphabet = input.nextLine();
        final String message = input.nextLine();
        final String word = input.nextLine();

        for (int multiply = 0; multiply < alphabet.length(); multiply++) {

            for (int shift = 0; shift < alphabet.length(); shift++) {

                final Character[] decode = new Character[message.length()];

                for (int map_from = 0; map_from < alphabet.length(); map_from++) {

                    final int map_to = ((map_from + shift) * multiply) % alphabet.length();

                    for (int i = 0; i < message.length(); i++) {

                        if (message.charAt(i) == alphabet.charAt(map_from)) {

                            decode[i] = alphabet.charAt(map_to);

                        }

                    }

                }

                final StringBuilder msg = new StringBuilder();

                for (final Character character : decode) {

                    msg.append(character);

                }

                if (msg.toString().contains(word)) {

                    System.out.println(msg);

                }

            }

        }

    }

}
