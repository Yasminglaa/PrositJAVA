package zoo;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 10, true);
        Animal eagle = new Animal("Rapace", "Aigle Royal", 3, false);
        Animal giraffe = new Animal("Giraffidé", "Zarafa", 7, true);
        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 25);
        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = eagle;
        myZoo.animals[3] = giraffe;
        myZoo.displayZoo();
        System.out.println("\nAFFICHAGE AVEC toString()");
        System.out.println(myZoo);
        System.out.println("\nLISTE DES ANIMAUX ");
        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(eagle);
        System.out.println(giraffe);


    }
}
