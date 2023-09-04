import java.util.List;

public record Zoo(List<Animal> allAnimals) {
    double amountFoodNeeded(){
        double amountFood = 0;
        for (Animal allAnimal : allAnimals) {
            amountFood = amountFood + allAnimal.species().dailyFoodRequirementInGrams();
        }
        return amountFood;
    }
}
