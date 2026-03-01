package zoo;

public class ZooManagement {
    public static void main(String[] args) {

        System.out.println("Test age negatif :");
        Animal a1 = new Animal("Felin", "Simba", -3, true);
        System.out.println("Age de Simba : " + a1.getAge());
        System.out.println();

        System.out.println("Test nom vide :");
        Zoo z1 = new Zoo("", "Tunis");
        System.out.println("Nom du zoo : " + z1.getName());
        System.out.println();

        System.out.println();

        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis");
        Animal lion     = new Animal("Felin", "Simba", 5, true);
        Animal elephant = new Animal("Elephantide", "Dumbo", 10, true);
        Animal aigle    = new Animal("Rapace", "Aigle", 3, false);
        Animal girafe   = new Animal("Giraffide", "Zarafa", 7, true);

        System.out.println("Ajout des animaux :");
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(aigle);
        myZoo.addAnimal(girafe);
        System.out.println();

        myZoo.displayZoo();
        System.out.println();
        myZoo.displayAnimals();
        System.out.println();

        System.out.println("Test doublon :");
        myZoo.addAnimal(lion);
        System.out.println();

        System.out.println("Recherche d'animaux :");
        int idx = myZoo.searchAnimal("Simba");
        if (idx != -1) {
            System.out.println("Simba trouve a l'indice " + idx);
        } else {
            System.out.println("Simba non trouve");
        }
        System.out.println();

        System.out.println("Suppression de Dumbo :");
        myZoo.removeAnimal(elephant);
        myZoo.displayAnimals();
        System.out.println();

        Zoo zoo2 = new Zoo("Zoo de Sousse", "Sousse");
        zoo2.addAnimal(new Animal("Tigre", "Raja", 4, true));
        Zoo leGrand = Zoo.comparerZoo(myZoo, zoo2);
        System.out.println("Le plus grand zoo est : " + leGrand.getName());
        System.out.println();
        System.out.println("Le zoo est plein ? " + myZoo.isZooFull());

        System.out.println();

        Aquatic aquatic         = new Aquatic("Poisson", "Nemo", 3, false, "océan");
        Terrestrial terrestrial = new Terrestrial("Félin", "Rex", 5, true, 4);
        Dolphin dolphin         = new Dolphin("Cétacé", "Flipper", 7, true, "mer", 45.5f);
        Penguin penguin         = new Penguin("Oiseau", "Tux", 2, false, "bassin", 30.0f);

        System.out.println("=== toString() ===");
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println();


        System.out.println("swim()");
        aquatic.swim();
        dolphin.swim();
        penguin.swim();

        System.out.println();
        System.out.println("Ajout des animaux Prosit 5 dans le zoo ");
        myZoo.addAnimal(aquatic);
        myZoo.addAnimal(dolphin);
        myZoo.addAnimal(penguin);
        myZoo.addAnimal(terrestrial);
        myZoo.displayAnimals();
    }
}