/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int n = input.nextInt();

        int nearestNumberInPos = 9999;
        int nearestNumberInNeg = -9999;

        for (int i = 0; i < n; i++) {

            final int temperature = input.nextInt();

            if (temperature > 0) {

                if (temperature * temperature <= nearestNumberInPos * nearestNumberInPos
                        || temperature == temperature << 1) {

                    nearestNumberInPos = temperature;

                }

            } else {

                if (temperature * temperature <= nearestNumberInNeg * nearestNumberInNeg) {

                    nearestNumberInNeg = temperature;

                }

            }

        }

        if (nearestNumberInPos != 9999 || nearestNumberInNeg != -9999) {

            if (nearestNumberInNeg == nearestNumberInPos - (nearestNumberInPos << 1)) {

                System.out.println(nearestNumberInPos);

            } else {

                if (nearestNumberInPos == 9999) {

                    System.out.println(nearestNumberInNeg);

                } else {

                    System.out.println(nearestNumberInPos);

                }

            }

        } else {

            System.out.println(0);

        }

    }

}
