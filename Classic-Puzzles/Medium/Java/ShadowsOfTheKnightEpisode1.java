/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);
        final int W = in.nextInt();
        final int H = in.nextInt();
        final int N = in.nextInt();

        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int L = 0;
        int R = W - 1;
        int T = 0;
        int B = H - 1;

        while (true) {

            final String bombDir = in.next();

            if (bombDir.contains("U")) { B = Y0 - 1; }
            if (bombDir.contains("R")) { L = X0 + 1; }
            if (bombDir.contains("D")) { T = Y0 + 1; }
            if (bombDir.contains("L")) { R = X0 - 1; }

            X0 = (R + L) / 2;
            Y0 = (T + B) / 2;

            System.out.println(X0 + " " + Y0);

        }

    }

}
