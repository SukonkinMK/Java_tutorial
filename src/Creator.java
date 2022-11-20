public interface Creator<T extends Model> {
    T create(String name, String password);
}
