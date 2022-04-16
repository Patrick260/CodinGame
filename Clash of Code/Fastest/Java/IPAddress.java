/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final String s = input.nextLine();

        int sum = 0;

        for (final Character c : s.toCharArray()) {

            sum += c;

        }

        System.out.println(sum % 256 + "." + sum * 2 % 256 + "." + sum * 3 % 256 + "." + sum * 4 % 256);

    }

}
