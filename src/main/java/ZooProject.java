public class ZooProject {
    public static void main(String[] args) {
        // Erstelle Animal-Objekte
        Owner Marc = new Owner("Marc", 44, "Boeblingen");
        Species Lion = new Species("Lion", 5);
        Animal lion = new Animal(1, "Leo", Lion, 5, Marc);
        Animal elephant = new Animal(2, "Ella", Lion, 10, Marc);
        Animal giraffe = new Animal(3, "Gerry", Lion, 7, Marc);

        // Rufe die equals-Methode auf
        boolean areLionAndElephantEqual = lion.equals(elephant); // false
        boolean areLionAndGiraffeEqual = lion.equals(giraffe); // true

        // Rufe die toString-Methode auf
        System.out.println(lion.toString()); // Animal[id=1, name=Leo, species=Lion, age=5]

        System.out.println(lion.age());
    }
}
