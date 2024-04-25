package service.billCalculationStartegy;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(BillCalculationStrategyName billCalculationStrategyName){
        switch(billCalculationStrategyName){
            case SIMPLE -> {
                return new SimpleBillCalculationStrategy();
            }
            case SURGE -> {
                return new SurgeBillCalculationStrategy();
            }
        }
        return null;
    }
}
