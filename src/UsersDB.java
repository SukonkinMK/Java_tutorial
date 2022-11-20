import java.util.LinkedList;
import java.util.List;

public class UsersDB<T extends Model> {
    private List<T> users;

    public UsersDB() {
        this.users = new LinkedList<>();
    }

    public void add(T user){
        users.add(user);
    }

    public T searchUser(String name){
        for (T user : users) {
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
}
