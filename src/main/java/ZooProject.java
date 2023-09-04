public class ZooProject {
    public static void main(String[] args) {
        // Erstelle Animal-Objekte
        Animal lion = new Animal(1, "Leo", "Lion", 5);
        Animal elephant = new Animal(2, "Ella", "Elephant", 10);
        Animal giraffe = new Animal(3, "Gerry", "Giraffe", 7);

        // Rufe die equals-Methode auf
        boolean areLionAndElephantEqual = lion.equals(elephant); // false
        boolean areLionAndLionEqual = lion.equals(lion); // true

        // Rufe die toString-Methode auf
        System.out.println(lion.toString()); // Animal[id=1, name=Leo, species=Lion, age=5]
    }
}
