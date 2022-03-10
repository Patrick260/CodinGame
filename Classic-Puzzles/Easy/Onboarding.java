/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        while (true) {

            final String enemy1 = input.next();
            final int dist1 = input.nextInt();
            final String enemy2 = input.next();
            final int dist2 = input.nextInt();

            System.out.println(dist1 < dist2 ? enemy1 : enemy2);

        }

    }
  
}
