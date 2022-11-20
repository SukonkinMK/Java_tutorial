import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public String scan() {
        return scanner.nextLine();
    }
}
