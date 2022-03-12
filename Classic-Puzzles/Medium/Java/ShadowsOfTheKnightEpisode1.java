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

        int l = 0;
        int r = w - 1;
        int t = 0;
        int b = h - 1;

        while (true) {

            final String bombDir = input.next();

            if (bombDir.contains("U")) { b = y0 - 1; }
            if (bombDir.contains("R")) { l = x0 + 1; }
            if (bombDir.contains("D")) { t = y0 + 1; }
            if (bombDir.contains("L")) { r = x0 - 1; }

            x0 = (r + l) / 2;
            y0 = (t + b) / 2;

            System.out.println(x0 + " " + y0);

        }

    }

}
