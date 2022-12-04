import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner in;

    public ConsoleUI() {
        in = new Scanner(System.in);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public String read() {
        return in.nextLine();
    }
}
