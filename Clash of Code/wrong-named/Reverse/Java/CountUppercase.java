/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        System.out.println(new Scanner(System.in).nextLine().chars().filter(Character::isUpperCase).count());

    }

}
