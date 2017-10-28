package taskException1;

import java.util.Objects;

public class Barsik {
    String name;

    public Barsik(String name) {
        this.name = name;
    }

    public boolean isBarsik() {
        return (Objects.equals(name.toLowerCase(), "barsik"));
    }
}
