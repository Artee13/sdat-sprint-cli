package com.keyin.sdat;

import com.keyin.sdat.cli.ApiClient;
import com.keyin.sdat.cli.ReportService;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // API base URL
        ApiClient api = new ApiClient("http://localhost:8080");
        ReportService reports = new ReportService(api);

        while (true) {
            System.out.println("\n=== SDAT Sprint CLI ===");
            System.out.println("1) What airports are there in each city?");
            System.out.println("2) What aircraft has each passenger flown on?");
            System.out.println("3) What airports do aircraft take off from and land at?");
            System.out.println("4) What airports have passengers used?");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            try {
                if (choice.equals("1")) {
                    System.out.println(reports.airportsByCity());
                } else if (choice.equals("2")) {
                    System.out.println(reports.aircraftByPassenger());
                } else if (choice.equals("3")) {
                    System.out.println(reports.airportsByAircraft());
                } else if (choice.equals("4")) {
                    System.out.println(reports.airportsUsedByPassenger());
                } else if (choice.equals("0")) {
                    System.out.println("Bye!");
                    break;
                } else {
                    System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error calling API: " + e.getMessage());
            }
        }

        // silence the warning
        scanner.close();
    }
}
