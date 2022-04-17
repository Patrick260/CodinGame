/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int charCount = input.nextInt();

        for (int i = 0; i < charCount; i++) {

            System.out.print(Character.toChars(input.nextInt()));

        }

    }

}
