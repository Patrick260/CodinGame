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

            String nearestZombieToHuman = "0 0";
            double distanceNearestZombieToHuman = Double.MAX_VALUE;

            final int x = input.nextInt();
            final int y = input.nextInt();

            final int humanCount = input.nextInt();

            for (int i = 0; i < humanCount; i++) {

                final int humanId = input.nextInt();
                final int humanX = input.nextInt();
                final int humanY = input.nextInt();

                humans.put(humanId, humanX + " " + humanY);

            }

            final int zombieCount = input.nextInt();

            for (int i = 0; i < zombieCount; i++) {

                final int zombieId = input.nextInt();
                final int zombieX = input.nextInt();
                final int zombieY = input.nextInt();
                final int zombieNextX = input.nextInt();
                final int zombieNextY = input.nextInt();

                zombies.put(zombieId, zombieX + " " + zombieY);

            }

            for (final String zombiePosition : zombies.values()) {

                for (final String humanPosition : humans.values()) {

                    final double distance = Math.hypot(Math.abs(Integer.parseInt(zombiePosition.split(" ")[0]) -
                                                                    Integer.parseInt(humanPosition.split(" ")[0])),
                                                        Math.abs(Integer.parseInt(zombiePosition.split(" ")[1]) -
                                                                    Integer.parseInt(humanPosition.split(" ")[1])));

                    if (distance < distanceNearestZombieToHuman) {

                        if (isPossibleToSaveHuman(distance, zombiePosition, x + " " + y)) {

                            nearestZombieToHuman = zombiePosition;
                            distanceNearestZombieToHuman = distance;

                        }

                    }

                }

            }

            System.out.println(nearestZombieToHuman);

        }

    }


    private static boolean isPossibleToSaveHuman(double distanceZombieToHuman, final String zombiePosition, final String playerPosition) {

        double distancePlayerToZombie = Math.hypot(Math.abs(Integer.parseInt(playerPosition.split(" ")[0]) -
                                                                    Integer.parseInt(zombiePosition.split(" ")[0])),
                                                        Math.abs(Integer.parseInt(playerPosition.split(" ")[1]) -
                                                                    Integer.parseInt(zombiePosition.split(" ")[1])));

        while (distanceZombieToHuman >= 0) {

            distanceZombieToHuman -= 400;
            distancePlayerToZombie -= 1000;

            if (distancePlayerToZombie <= 2000) {

                return true;

            } else if (distanceZombieToHuman <= 400) {

                return false;

            }

        }

        return false;

    }

}
