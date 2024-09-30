class Continent {
    String name;

    Continent(String name) {
        this.name = name;
    }
}

class Country extends Continent {
    Country(String c, String n) {
        super(c);
        name = n;
    }
}

class State extends Country {
    State(String c, String n, String s) {
        super(c, n);
        name = s;
    }

    void display() {
        System.out.printf("Continent: %s, Country: %s, State: %s%n", super.name, name, name);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        new State("Asia", "India", "Maharashtra").display();
    }
}
