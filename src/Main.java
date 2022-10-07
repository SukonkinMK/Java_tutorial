import java.util.*;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    /**
     * Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    static void task1(){
        List<Integer> list = ArrayListGenerator(20);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    static List<Integer> ArrayListGenerator(int n){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    /**
     * Задан целочисленный список ArrayList.
     * Найти минимальное, максимальное и среднее арифметическое из этого списка. (Collections.max())
     */
    static void task2(){
        List<Integer> list = ArrayListGenerator(20);
        System.out.println(list);
        int min_value = Collections.min(list);
        int max_value = Collections.max(list);
        int mean_value = 0;
        for (int i : list) {
            mean_value += i;
        }
        mean_value /= list.size();
        System.out.printf("Минимальное значение: %d\nСреднее значение: %d\nМаксимальное значение: %d%n", min_value, mean_value, max_value);
    }
}