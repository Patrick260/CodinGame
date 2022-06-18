/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int profit = input.nextInt();
        final int apartmentCosts = input.nextInt();
        final int spending = input.nextInt();

        if (profit * 120 - spending > apartmentCosts) {

            System.out.println("true");

        } else {

            System.out.println("false");

        }

    }

}
