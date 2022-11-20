public class UserInfo implements Model{
    private String name;
    private String password;

    public UserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean verifyPassword(String password) {
        return password.equals(this.password);
    }
}
