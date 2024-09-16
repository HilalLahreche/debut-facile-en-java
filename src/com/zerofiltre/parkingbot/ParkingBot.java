package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Bicycle;
import com.zerofiltre.parkingbot.model.Car;
import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.service.ParkingService;
import com.zerofiltre.parkingbot.utile.Printer;

import java.util.ArrayList;
import java.util.List;

public class ParkingBot {

    static ParkingService parkingService = new ParkingService();
    static  Printer printer ;

    /**
     * Ceci est la méthode Main
     *
     * @param args : Tableau de données entrées lors du lancement de l'application
     */
    public static void main(String[] args) {
            printer = (o) -> {System.out.println(o);};
            //on peut aussi remplacer l'expression par une method reference ( en posant la souris sur l'expression ca donnera
        // printer = System.out::println;
            //printer = o -> System.out.println(o);si on a qu'un seul argument on peut enlever la paranthese  et si on a qu'une seule expression on peut enlever les accolades
        processVehicles();
    }

    private static void processVehicles() {
        List<Ticket> tickets = new ArrayList<>();

        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationNumber("LS-324-PM");
        Ticket vehicleTicket = parkingService.processIncomingVehicle(vehicle);
        printer.print(vehicleTicket);
        tickets.add(vehicleTicket);

        Vehicle bicycle = new Bicycle();
        bicycle.setRegistrationNumber("PM-254-OP");
        Ticket bicycleTicket = parkingService.processIncomingVehicle(bicycle);
        printer.print(bicycleTicket);
        tickets.add(bicycleTicket);

        Vehicle car = new Car();
        bicycle.setRegistrationNumber("BX-256-QX");
        Ticket carTicket = parkingService.processIncomingVehicle(car);
        printer.print(carTicket);
        tickets.add(carTicket);

        printer.print("Début du traitement de sorties en lot de " + tickets.size() + " véhicules");
        for (int i = 0; i < tickets.size(); i++) {
            try {
                printer.print(parkingService.processExitingVehicle(tickets.get(i)));
            } catch (Exception e) {
                printer.print("Une erreur est survenue lors de la sortie d'un ou plusieurs véhicules");
            }
        }
        printer.print("Fin du traitement des sorties par lot");

    }


}