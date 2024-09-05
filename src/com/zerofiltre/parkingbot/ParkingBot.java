package com.zerofiltre.parkingbot;

public class ParkingBot {

    /**
     * Ceci est la  fonction principale d'un programme JAVA
     * @param args representent les données passées en parametre lors du lancement du programme
     */
    public static void main(String[] args) {
        sayHello(args);
    }

    /**
     * Permet d'accueillir et de presenter les services à l'utilisateur  du Parking
     * @param args represente le nom de l'utilisateur
     */
    private static void sayHello(String[] args) {
        String welcomeMessage = "Hello "+ args[0] + ", bienvenue au Parking Zerofiltre";
        String services = "Nous offrons les services suivantes: Gardiennage, Blanchisserie ... ";
        String warning = "Dépechez-vous d'entrer car  il n'y aura bientôt plus de places ";

        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
    }
}