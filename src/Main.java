public class Main {
    public static void main(String[] args) {
        Presenter<UserInfo> presenter = new Presenter<>(new ConsoleUI(), new UsersDB<>(),new UserInfoCreator());
        presenter.start();
    }
}