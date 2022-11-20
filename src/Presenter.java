public class Presenter<T extends Model> {
    private UsersDB<T> users;
    private View view;
    private Creator<T> creator;

    public Presenter(View view, UsersDB<T> users, Creator<T> creator) {
        this.users = users;
        this.view = view;
        this.creator = creator;
    }

    public void start() {
        while (true) {
            view.print("Для регистарции введите - 1. Для авторизации введите -  2. Для выхода введите - 0");
            String s = view.scan();
            if (s != null && !s.isEmpty()) {
                if (s.equals("0")) {
                    view.print("Завершение работы");
                    return;
                } else if(s.equals("1") || s.equals("2")) {
                    view.print("Введите Имя пользователя");
                    String name = view.scan();
                    view.print("Введите Пароль");
                    String password = view.scan();
                    if (s.equals("1")) {
                        registration(name, password);
                    } else  {
                        authorization(name, password);
                    }
                } else {
                view.print("Ошибка ввода");
            }
            }
        }
    }
    private void registration(String name, String password){
        if (users.searchUser(name) == null){
            users.add(creator.create(name,password));
        }
        else{
            view.print("Пользователь с этим именем уже существует");
        }
    }

    private void authorization(String name, String password){
        Model user = users.searchUser(name);
        if (user != null){
            if (user.verifyPassword(password)){
                view.print("Авторизация пройдена");
            }
            else {
                view.print("Отказано в доступе. Не верный пароль");
            }
        }
        else{
            view.print("Пользователь с этим именем не существует");
        }
    }
}
