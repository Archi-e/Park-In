package service;

import model.Bill;
import model.Gate;
import model.Ticket;
import service.billCalculationStartegy.BillCalculationStrategy;
import service.billCalculationStartegy.BillCalculationStrategyFactory;
import service.billCalculationStartegy.BillCalculationStrategyName;

public class BillService {
    public Bill generateBill(Ticket ticket, Gate gate){

        BillCalculationStrategy billCalculationStrategy = BillCalculationStrategyFactory.getBillCalculationStrategy(BillCalculationStrategyName.SIMPLE);
        return billCalculationStrategy.generateBill(ticket, gate);
    }
}
