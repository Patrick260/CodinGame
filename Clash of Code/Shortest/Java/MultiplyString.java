/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final String s = new Scanner(System.in).next();

        int p = Integer.parseInt("" + s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            p *= Integer.parseInt("" + s.charAt(i));

        }

        System.out.println(p);

    }

}
