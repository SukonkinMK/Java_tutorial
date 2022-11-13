import java.util.Objects;

public class Dog implements Nameable{
    private static int dogCount = 0;

    private String name;
    private int id;

    public Dog(String name) {
        this.name = name;
        id = ++dogCount;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return id == dog.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String getName() {
        return this.toString();
    }
}
