/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final String message = input.nextLine();

        System.out.println(message.chars().filter(Character::isAlphabetic).count());

    }

}
