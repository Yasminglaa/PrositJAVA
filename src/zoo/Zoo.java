package zoo;
public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        if (name == null || name.isEmpty()) {
            System.out.println("Le nom du zoo est vide");
            this.name = "Sans nom";
        } else {
            this.name = name;
        }
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein");
            return false;
        }

        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("L'animal existe deja");
                return false;
            }
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayAnimals() {
        if (nbrAnimals == 0) {
            System.out.println("Aucun animal dans le zoo");
            return;
        }
        System.out.println("Liste des animaux :");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println("- " + animals[i].getName());
        }
    }

    public int searchAnimal(String animalName) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animalName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int position = searchAnimal(animal.getName());

        if (position == -1) {
            System.out.println("Animal introuvable");
            return false;
        }

        for (int i = position; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;

        return true;
    }

    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.getNbrAnimals() > zoo2.getNbrAnimals()) {
            return zoo1;
        }
        return zoo2;
    }

    public void displayZoo() {
        System.out.println("Zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre d'animaux : " + nbrAnimals + "/" + nbrCages);
    }

    @Override
    public String toString() {
        return name + " - " + city;
    }
}