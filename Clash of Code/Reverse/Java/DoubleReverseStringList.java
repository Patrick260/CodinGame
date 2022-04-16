/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.ArrayList;
import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int x = input.nextInt();

        if (input.hasNextLine()) {

            input.nextLine();

        }

        final ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < x; i++) {

            final String row = input.nextLine();
            list.add(row + new StringBuilder(row).reverse());

        }

        for (final String s : list) {

            System.out.println(s);

        }

        for (int i = list.size(); i > 0; i--) {

            System.out.println(list.get(i - 1));

        }

    }

}
