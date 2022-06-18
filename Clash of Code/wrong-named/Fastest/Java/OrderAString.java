/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int n = input.nextInt();

        if (input.hasNextLine()) { input.nextLine(); }

        final String line = input.nextLine();

        for (int i = 0; i < n; i++) {

            final int index = input.nextInt();

            System.out.print(line.charAt(index - 1));

        }

    }

}
