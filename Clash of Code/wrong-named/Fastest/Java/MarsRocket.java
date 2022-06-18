/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.Scanner;

final class Solution {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int distance = input.nextInt();
        final int time = input.nextInt();
        final int velocity = input.nextInt();
        final int fuel = input.nextInt();
        final int fuelConsumption = input.nextInt();

        if (velocity * time < distance) {

            System.out.println("Failure, Not enough time");

        } else if (fuel * fuelConsumption < distance) {

            System.out.println("Failure, Not enough fuel");

        } else {

            System.out.println("Welcome to Mars");

        }

    }

}
