/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int w = input.nextInt();
        final int h = input.nextInt();
        final int n = input.nextInt();

        int x0 = input.nextInt();
        int y0 = input.nextInt();

        int left = 0;
        int right = w - 1;
        int top = 0;
        int bottom = h - 1;

        while (true) {

            final String bombDir = input.next();

            if (bombDir.contains("U")) { bottom = y0 - 1; }
            if (bombDir.contains("R")) { left = x0 + 1; }
            if (bombDir.contains("D")) { top = y0 + 1; }
            if (bombDir.contains("L")) { right = x0 - 1; }

            x0 = (right + left) / 2;
            y0 = (top + bottom) / 2;

            System.out.println(x0 + " " + y0);

        }

    }

}
