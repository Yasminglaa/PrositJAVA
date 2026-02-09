package zoo;
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int nbrAnimals = 0;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public boolean addAnimal(Animal animal) {
        if (nbrAnimals >= nbrCages) {
            System.out.println("Le zoo est plein !");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà !");
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.name + " ajouté.");
        return true;
    }

    public void displayAnimals() {
        System.out.println("=== Animaux du zoo " + name + " ===");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
        System.out.println("Total : " + nbrAnimals + "/" + nbrCages);
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal non trouvé !");
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        System.out.println(animal.name + " supprimé.");
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }

    public String toString() {
        return "Zoo: " + name + ", Ville: " + city +
                ", Animaux: " + nbrAnimals + "/" + nbrCages;
    }
}