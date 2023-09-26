package ToyBoxGeneric;

public class Food {

    @Override
    public String toString() {
        return "Food";
    }
}

class Rice extends Food {
    @Override
    public String toString() {
        return "Rice"; 
    }
}

class Pizza extends Food {
    @Override
    public String toString() {
        return "Pizza";
    }
}

class Pasta extends Food {
    @Override
    public String toString() {
        return "Pasta"; 
    }
}
