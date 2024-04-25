package controller;

import model.ParkingLot;
import service.InitService;

public class InitController {
    private InitService initService;

    public InitController(InitService initService) {
        this.initService = initService;
    }

    public ParkingLot init(){
        return initService.init();
    }
}
