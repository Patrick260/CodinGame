/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int lx = input.nextInt();
        final int ly = input.nextInt();

        int tx = input.nextInt();
        int ty = input.nextInt();

        while (true) {

            final StringBuilder direction = new StringBuilder();

            if (ly < ty) {

                direction.append("N");
                ty--;

            } else if (ly > ty) {

                direction.append("S");
                ty++;

            }

            if (lx > tx) {

                direction.append("E");
                tx--;

            } else if (lx < tx) {

                direction.append("W");
                tx++;

            }

            System.out.println(direction);

        }

    }

}
