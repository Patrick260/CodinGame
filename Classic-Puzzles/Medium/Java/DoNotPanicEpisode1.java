/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.HashMap;
import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        final int amountFloors = input.nextInt();
        final int width = input.nextInt();
        final int amountRounds = input.nextInt();
        final int exitFloor = input.nextInt();
        final int exitPosition = input.nextInt();
        final int amountClones = input.nextInt();
        final int amountAdditionalElevators = input.nextInt();
        final int amountElevators = input.nextInt();

        final HashMap<Integer, Integer> elevators = new HashMap<>();

        for (int i = 0; i < amountElevators; i++) {

            final int elevatorFloor = input.nextInt();
            final int elevatorPosition = input.nextInt();

            elevators.put(elevatorFloor, elevatorPosition);

        }

        elevators.put(exitFloor, exitPosition);

        while (true) {

            final int cloneFloor = input.nextInt();
            final int clonePosition = input.nextInt();
            final String direction = input.next();

            if (direction.equals("LEFT")) {

                if (clonePosition >= elevators.get(cloneFloor)) {

                    System.out.println("WAIT");

                } else {

                    System.out.println("BLOCK");

                }

            } else if (direction.equals("RIGHT")) {

                if (clonePosition <= elevators.get(cloneFloor)) {

                    System.out.println("WAIT");

                } else {

                    System.out.println("BLOCK");

                }

            } else {

                System.out.println("WAIT");

            }

        }

    }
    
}
