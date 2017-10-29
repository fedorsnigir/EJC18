package generic;

import java.util.HashSet;
import java.util.Set;

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "this cat has name = " + name;
    }

    public static void main(String[] args) {
        Set<Cat> catSet = new HashSet<Cat>();
        catSet.add(new Cat("snezhok"));
        catSet.add(new Cat("chernish"));

        System.out.println(catSet.toString());
    }
}
