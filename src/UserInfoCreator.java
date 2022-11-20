public class UserInfoCreator implements Creator<UserInfo> {

    @Override
    public UserInfo create(String name, String password) {
        return new UserInfo(name, password);
    }
}
