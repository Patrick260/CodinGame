/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Player {

    public static void main(final String args[]) {

        final Scanner input = new Scanner(System.in);

        while (true) {

            int highest_mountain = 0;
            int index = 0;

            for (int i = 0; i < 8; i++) {

                int mountain_height = input.nextInt();
                
                if (mountain_height > highest_mountain) {

                    highest_mountain = mountain_height;
                    index = i;

                }

            }

            System.out.println(index);

        }

    }
}
