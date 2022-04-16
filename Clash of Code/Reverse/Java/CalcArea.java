/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int n = input.nextInt();

        if (input.hasNextLine()) {

            input.nextLine();

        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            final String line = input.nextLine();

            if (line.contains("##")) {

                count += line.chars().filter(c -> c == '#').count();

            } else if (line.contains("#")) {

                count += line.lastIndexOf('#') - line.indexOf('#') + 1;

            }

        }

        System.out.println(count);

    }

}
