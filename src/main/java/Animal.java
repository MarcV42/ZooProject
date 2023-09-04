public record Animal(int id, String name, Species species, int age, Owner owner) {

    Animal withId(int Id){
        return new Animal(Id, this.name, this.species, this.age, this.owner);
    }

    Animal withName(String name){
        return new Animal(this.id, name, this.species, this.age, this.owner);
    }

    Animal withSpecies(Species species){
        return new Animal(this.id, this.name, species, this.age, this.owner);
    }

    Animal withAge(int age){
        return new Animal(this.id, this.name, this.species, age, this.owner);
    }

    Animal withOwner(Owner owner){
        return new Animal(this.id, this.name, this.species, this.age, owner);
    }

}
