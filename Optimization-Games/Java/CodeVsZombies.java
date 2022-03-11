/*
    Copyright (c) 2022 Patrick260
    Distributed under the terms of the MIT License.
*/

import java.util.HashMap;
import java.util.Scanner;

final class Player {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        while (true) {

            final HashMap<Integer, String> humans = new HashMap<>();
            final HashMap<Integer, String> zombies = new HashMap<>();

            String nearest_zombie_to_human = "0 0";
            double distance_nearest_zombie_to_human = Double.MAX_VALUE;

            final int x = input.nextInt();
            final int y = input.nextInt();

            final int human_count = input.nextInt();

            for (int i = 0; i < human_count; i++) {

                final int human_id = input.nextInt();
                final int human_x = input.nextInt();
                final int human_y = input.nextInt();

                humans.put(human_id, human_x + " " + human_y);

            }

            final int zombie_count = input.nextInt();

            for (int i = 0; i < zombie_count; i++) {

                final int zombie_id = input.nextInt();
                final int zombie_x = input.nextInt();
                final int zombie_y = input.nextInt();
                final int zombie_x_next = input.nextInt();
                final int zombie_y_next = input.nextInt();

                zombies.put(zombie_id, zombie_x + " " + zombie_y);

            }

            for (final String zombie_position : zombies.values()) {

                for (final String human_position : humans.values()) {

                    final double distance = Math.hypot(Math.abs(Integer.parseInt(zombie_position.split(" ")[0]) -
                                                                    Integer.parseInt(human_position.split(" ")[0])),
                                                        Math.abs(Integer.parseInt(zombie_position.split(" ")[1]) -
                                                                    Integer.parseInt(human_position.split(" ")[1])));

                    if (distance < distance_nearest_zombie_to_human) {

                        if (isPossibleToSaveHuman(distance, zombie_position, x + " " + y)) {

                            nearest_zombie_to_human = zombie_position;
                            distance_nearest_zombie_to_human = distance;

                        }

                    }

                }

            }

            System.out.println(nearest_zombie_to_human);

        }

    }


    private static boolean isPossibleToSaveHuman(double distance_zombie_to_human, final String zombie_position, final String player_position) {

        double distance_player_to_zombie = Math.hypot(Math.abs(Integer.parseInt(player_position.split(" ")[0]) -
                                                                    Integer.parseInt(zombie_position.split(" ")[0])),
                                                        Math.abs(Integer.parseInt(player_position.split(" ")[1]) -
                                                                    Integer.parseInt(zombie_position.split(" ")[1])));

        while (distance_zombie_to_human >= 0) {

            distance_zombie_to_human -= 400;
            distance_player_to_zombie -= 1000;

            if (distance_player_to_zombie <= 2000) {

                return true;

            } else if (distance_zombie_to_human <= 400) {

                return false;

            }

        }

        return false;

    }

}
