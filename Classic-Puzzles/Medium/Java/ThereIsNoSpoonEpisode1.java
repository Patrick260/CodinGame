/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int width = input.nextInt();
        final int height = input.nextInt();

        if (input.hasNextLine()) {

            input.nextLine();

        }

        final Character[][] cells = new Character[height][width];

        for (int y = 0; y < height; y++) {

            final String line = input.nextLine();

            for (int x = 0; x < width; x++) {

                cells[y][x] = line.charAt(x);

            }

        }

        for (int y1 = 0; y1 < cells.length; y1++) {

            for (int x1 = 0; x1 < cells[y1].length; x1++) {

                if (cells[y1][x1] == '0') {

                    int y2 = -1;
                    int x2 = -1;
                    int y3 = -1;
                    int x3 = -1;

                    for (int x = x1 + 1; x < cells[y1].length; x++) {

                        if (cells[y1][x] == '0') {

                            y2 = y1;
                            x2 = x;

                            break;

                        }

                    }

                    for (int y = y1 + 1; y < cells.length; y++) {

                        if (cells[y][x1] == '0') {

                            y3 = y;
                            x3 = x1;

                            break;

                        }

                    }

                    System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);

                }

            }

        }

    }

}
