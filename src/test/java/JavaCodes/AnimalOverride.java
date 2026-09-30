package JavaCodes;

//Method Override
class AnimalOverride {
    public void animalSound() {
        System.out.println("Animal Sound");
    }
}

class Lion extends AnimalOverride {
    public void animalSound() {
        String animal = "Lion";
        System.out.println(animal + " roars");
    }
}

class Leopard extends AnimalOverride {
    public void animalSound() {
        String animal = "Leopard";
        System.out.println(animal + " rasps");
    }
}

class main {
    public static void main(String[] args) {
        AnimalOverride a = new AnimalOverride();
        AnimalOverride l = new Lion();
        AnimalOverride l1 = new Leopard();

        a.animalSound();
        l.animalSound();
        l1.animalSound();
    }
}