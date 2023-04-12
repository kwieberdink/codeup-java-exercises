package rpg;

public class AnimalRPG {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setName("Bear");
        animal1.setSound("ROAR");
        animal1.printStats();

        Animal animal2 = new Animal();
        animal2.setName("Chicks");
        animal2.setSound("cheep");
        animal2.printStats();

        Animal animal3 = new Animal("Chupacabra", "hwgqdsfqg");
        animal3.printStats();

        Animal animal4 = new Animal("Bee", "buzz");
        animal4.printStats();

    }

}
