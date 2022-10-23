import java.util.Objects;

public class Cat implements Nameable{
    private static int catCount = 0;
    private String name;
    private int id;

    public Cat(String name) {
        this.name = name;
        this.id = ++catCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getName();
    }
}
