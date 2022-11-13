import java.util.Objects;

public class Human implements Nameable {
    private static int humanCount = 0;

    private String firstName;
    private String lastName;
    private int id;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        id = ++humanCount;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return id == human.id;
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
