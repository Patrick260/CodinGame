/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.HashMap;
import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);
        
        final int amount_floors = input.nextInt();
        final int width = input.nextInt();
        final int amount_rounds = input.nextInt();
        final int exit_floor = input.nextInt();
        final int exit_position = input.nextInt();
        final int amount_clones = input.nextInt();
        final int amount_additional_elevators = input.nextInt();
        final int amount_elevators = input.nextInt();

        final HashMap<Integer, Integer> elevators = new HashMap<>();

        for (int i = 0; i < amount_elevators; i++) {

            final int elevator_floor = input.nextInt();
            final int elevator_position = input.nextInt();

            elevators.put(elevator_floor, elevator_position);

        }

        elevators.put(exit_floor, exit_position);

        while (true) {

            final int clone_floor = input.nextInt();
            final int clone_position = input.nextInt();
            final String direction = input.next();

            if (direction.equals("LEFT")) {

                if (clone_position >= elevators.get(clone_floor)) {

                    System.out.println("WAIT");

                } else {

                    System.out.println("BLOCK");

                }

            } else if (direction.equals("RIGHT")) {

                if (clone_position <= elevators.get(clone_floor)) {

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
