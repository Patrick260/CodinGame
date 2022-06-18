/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int n = input.nextInt();
        final int m = input.nextInt();

        System.out.println(Math.min(n, m));

    }

}
