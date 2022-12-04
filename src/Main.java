import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        try {
            task4();
        }
        catch (Exception e){
            System.out.println("Пустые строки вводить нельзя");
        }
    }
    public static void printSum(int a, int b) {
        System.out.println(a + b);
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
    public static void task2(){
        int[] intArray = new int[5];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
    public static void task4() throws Exception{
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();
        if(ans.isEmpty()){
            throw new Exception();
        }
    }
}