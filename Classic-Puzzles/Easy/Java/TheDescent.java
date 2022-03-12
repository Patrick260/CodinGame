/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        while (true) {

            int highestMountain = 0;
            int index = 0;

            for (int i = 0; i < 8; i++) {

                final int mountainHeight = input.nextInt();
                
                if (mountainHeight > highestMountain) {

                    highestMountain = mountainHeight;
                    index = i;

                }

            }

            System.out.println(index);

        }

    }
}
