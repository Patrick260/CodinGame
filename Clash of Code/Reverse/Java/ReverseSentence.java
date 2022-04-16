/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final String s = input.nextLine();
        final String[] split = s.split(" ");

        for (int i = split.length; i > 0; i--) {

            System.out.print(split[i - 1]);

            if (i != 1) {

                System.out.print(" ");
                
            }

        }

    }

}
