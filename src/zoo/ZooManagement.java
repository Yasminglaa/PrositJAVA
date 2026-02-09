package zoo;
public class ZooManagement {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Park", "Tunis");

        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal tigre = new Animal("Félin", "Tigre", 3, true);
        Animal aigle = new Animal("Oiseau", "Canari", 2, false);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);
        myZoo.addAnimal(aigle);

        myZoo.displayAnimals();

        myZoo.removeAnimal(tigre);
        myZoo.displayAnimals();
    }
}