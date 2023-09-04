import java.util.ArrayList;
import java.util.List;
public class ZooProject {
    public static void main(String[] args) {
        // Erstelle Animal-Objekte
        Owner Marc = new Owner("Marc", 44, "Boeblingen");
        Species Lion = new Species("Lion", 5);
        Animal lion = new Animal(1, "Leo", Lion, 5, Marc);
        Animal elephant = new Animal(2, "Ella", Lion, 10, Marc);
        Animal giraffe = new Animal(3, "Gerry", Lion, 7, Marc);
        Owner elephantOwner = new Owner("Michael Meier", 27, "Am Waldweg 3, 09113 Chemnitz");
        Owner fishOwner = new Owner("Sandra Schmidt", 39, "Hubertushöhe 6, 01836 Dingsstadt");


        Species dolphin = new Species("dolphin", 8000);
        Species koi = new Species("koi", 20);

        // Rufe die equals-Methode auf
        boolean areLionAndElephantEqual = lion.equals(elephant); // false
        boolean areLionAndGiraffeEqual = lion.equals(giraffe); // true

        // Rufe die toString-Methode auf
        System.out.println(lion.toString()); // Animal[id=1, name=Leo, species=Lion, age=5]

        System.out.println(lion.age());
        Animal fanti = new Animal(1, "Fanti", elephant.species(), 3, elephantOwner);
        Animal anotherFanti = new Animal(1, "Fanti", elephant.species(), 3, elephantOwner);

        Animal flipper = new Animal(2, "Flipper", dolphin, 4, fishOwner);
        Animal twinkle = new Animal(3, "Twinkle", koi, 2, fishOwner);

        System.out.println(elephant);
        System.out.println("Fanti equals another Fanti: " + fanti.equals(anotherFanti));

        anotherFanti = anotherFanti.withId(4);
        System.out.println("Fanti equals another Fanti: " + fanti.equals(anotherFanti));

        List<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(fanti);
        allAnimals.add(anotherFanti);
        allAnimals.add(flipper);
        allAnimals.add(twinkle);

        Zoo zoo = new Zoo(allAnimals);
        double amountFoodNeeded = zoo.amountFoodNeeded();
        System.out.println(amountFoodNeeded);
    }
}
