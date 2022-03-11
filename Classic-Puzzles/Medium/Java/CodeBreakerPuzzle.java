/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);
        final String ALPHABET = in.nextLine();
        final String MESSAGE = in.nextLine();
        final String WORD = in.nextLine();

        for (int multiply = 0; multiply < ALPHABET.length(); multiply++) {

            for (int shift = 0; shift < ALPHABET.length(); shift++) {

                final Character[] decode = new Character[MESSAGE.length()];

                for (int map_from = 0; map_from < ALPHABET.length(); map_from++) {

                    final int map_to = ((map_from + shift) * multiply) % ALPHABET.length();

                    for (int i = 0; i < MESSAGE.length(); i++) {

                        if (MESSAGE.charAt(i) == ALPHABET.charAt(map_from)) {

                            decode[i] = ALPHABET.charAt(map_to);

                        }

                    }

                }

                final StringBuilder msg = new StringBuilder();

                for (final Character character : decode) {

                    msg.append(character);

                }

                if (msg.toString().contains(WORD)) {

                    System.out.println(msg);

                }

            }

        }

    }

}
