package service.spotAllocationStrategy;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy(SpotAllocationStrategyName spotAllocationStrategyName){
        switch (spotAllocationStrategyName){
            case ORDERED -> {
                return new OrderedSpotAllocation();
            }
        }
        return null;
    }
}
