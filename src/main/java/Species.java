public record Species(String name, int dailyFoodRequirementInGrams) {
}

public class Animal {
    private int id;
    private String name;
    private Species species; // Record als Attribut
    private int age;
    private Owner owner;

    public Animal(int id, String name, Species species, int age, Owner owner) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.owner = owner;
    }

    // Weitere Methoden und Getter
}

public class ZooProject {
    public static void main(String[] args) {
        Species lionSpecies = new Species("Lion", 3000);
        Species elephantSpecies = new Species("Elephant", 6000);

        Animal lion = new Animal(1, "Leo", lionSpecies, 5, null);
        Animal elephant = new Animal(2, "Ella", elephantSpecies, 10, null);
    }
}
