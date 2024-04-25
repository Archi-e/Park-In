import controller.BillController;
import controller.InitController;
import controller.TicketController;
import model.*;
import model.enums.VehicleType;
import repository.*;
import service.BillService;
import service.InitService;
import service.TicketService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;


public class ParkingLotMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        InitService initService = new InitService(gateRepository, parkingLotRepository, parkingFloorRepository, parkingSpotRepository);

        TicketService ticketService = new TicketService(ticketRepository, gateRepository, parkingLotRepository, new VehicleRepository());
        TicketController ticketController = new TicketController(ticketService);

        BillService billService = new BillService();
        BillController billController = new BillController(billService);

        InitController initController = new InitController(initService);
        System.out.println("************** PARKING LOT DATA INITIALISATION - START **************");
        initController.init();
        System.out.println("************** PARKING LOT DATA INITIALISATION - END **************");
        System.out.println();
        System.out.println();
        System.out.println("Hey, Welcome to Park-In");



        while(true){
            System.out.println("Please enter the option:");
            System.out.println("1: Enter Parking Lot");
            System.out.println("2: Exit Parking Lot");
            System.out.println("3: Exit");

            int option = sc.nextInt();


            if(option == 1){
                Vehicle vehicle = new Vehicle();
                System.out.println("Please enter the vehicle number:");
                sc.nextLine();
                String vehicleNumber = sc.nextLine();
                vehicle.setVehicle_number(vehicleNumber);
                System.out.println("Please enter the vehicle color:");
                String vehicleColor = sc.nextLine();
                vehicle.setColor(vehicleColor);
                System.out.println("Please choose the vehicle type: 1.Four Wheeler 2.Two_Wheeler 3. EV");
                int input = sc.nextInt();
                if(input == 1){
                    vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
                }
                if(input == 2){
                    vehicle.setVehicleType(VehicleType.TWO_WHEELER);
                }
                if(input == 3){
                    vehicle.setVehicleType(VehicleType.EV);
                }

                System.out.println("Please enter the Parking Lot Id:");
                int parkingLotId = sc.nextInt();

                System.out.println("Please enter the Gate Id:");
                int gateId = sc.nextInt();

                Ticket ticket = ticketController.generateTicket(parkingLotId, gateId, vehicle);
                System.out.println(ticket.toString());

            }
            else if(option == 2){
                System.out.println("Please enter Ticket Id: ");
                int ticketId = sc.nextInt();
                System.out.println("Please enter exit gate number: ");
                int gateNumber = sc.nextInt();
                Bill bill = billController.getBill(ticketRepository.get(ticketId), gateRepository.get(gateNumber));
                System.out.println("Bill Details: "+bill.toString());
                System.out.println();
            }
            else if(option == 3){
                System.out.println("Exiting the system");
                break;
            }
        }





    }
}
