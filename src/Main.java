import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
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


}