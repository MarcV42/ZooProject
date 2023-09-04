import java.util.Objects;

public record Owner(String name, int age, String address) {
}

public class Animal {
    private int id;
    private String name;
    private String species;
    private int age;
    private Owner owner; // Record als Attribut

    public Animal(int id, String name, String species, int age, Owner owner) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && age == animal.age && Objects.equals(name, animal.name) && Objects.equals(species, animal.species) && Objects.equals(owner, animal.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, species, age, owner);
    }
}
