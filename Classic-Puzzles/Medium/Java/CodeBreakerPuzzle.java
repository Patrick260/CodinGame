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

                for (int mapFrom = 0; mapFrom < alphabet.length(); mapFrom++) {

                    final int mapTo = ((mapFrom + shift) * multiply) % alphabet.length();

                    for (int i = 0; i < message.length(); i++) {

                        if (message.charAt(i) == alphabet.charAt(mapFrom)) {

                            decode[i] = alphabet.charAt(mapTo);

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
