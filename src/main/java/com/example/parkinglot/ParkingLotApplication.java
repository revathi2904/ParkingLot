package com.example.parkinglot;

import com.example.parkinglot.controllers.TicketController;
import com.example.parkinglot.repositories.GateRepository;
import com.example.parkinglot.repositories.ParkingRespository;
import com.example.parkinglot.repositories.TicketRepository;
import com.example.parkinglot.repositories.VehicleRepository;
import com.example.parkinglot.services.TicketService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingLotApplication {

    public static void main(String[] args) {

        //repositories
        //services
        //controllers

        GateRepository gateRepository = new GateRepository();
        ParkingRespository parkingRespository = new ParkingRespository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository =  new VehicleRepository();
        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingRespository, ticketRepository);
        TicketController ticketController = new TicketController(ticketService);
        SpringApplication.run(ParkingLotApplication.class, args);
    }

}
