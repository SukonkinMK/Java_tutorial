import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(task1());
    }
    public static float task1(){
        float result;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите дробное число");
            String ans = scanner.nextLine();
            try {
                result = Float.parseFloat(ans);
                return result;
            }
            catch (NumberFormatException | NullPointerException exception){
                System.out.println("Ошибка ввода");
            }
        }
    }
}