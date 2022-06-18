/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);

        final int m = in.nextInt();
        final int n = in.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += in.nextInt() % m;

        }

        System.out.println(sum);

    }

}
