package com.zerofiltre.parkingbot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ParkingDatabase {
    public static void main(String[] args) {
        // URL de la base de données H2 (en mémoire)
        String jdbcUrl = "jdbc:h2:mem:testdb";
        String username = "sa";
        String password = "";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Créer une table pour stocker les tickets
            String createTableSQL = "CREATE TABLE Ticket ("
                    + "id IDENTITY PRIMARY KEY,"
                    + "vehicle_type VARCHAR(255),"
                    + "entering_time TIMESTAMP,"
                    + "exit_time TIMESTAMP,"
                    + "amount DOUBLE)";

            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Table Ticket créée avec succès.");

            // Ici, tu peux insérer des données ou interagir avec la base de données

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
