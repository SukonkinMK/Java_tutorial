import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        //System.out.println(task1(list));
        //System.out.println();
        //task2();

        System.out.println(task3(list));
    }

    /**
     * Метод, который вернет “перевернутый” список.
     * @param list исходный список
     * @return перевернутый список
     */
    static LinkedList<Integer> task1(LinkedList<Integer> list){
        LinkedList<Integer> result = new LinkedList<>();
        while (list.size() > 0){
            int tmp = list.pollLast();
            result.add(tmp);
        }
        return result;
    }

    static void task2(){
        MyQueue queue = new MyQueue();
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.first());
        while (queue.first() != 0){
            System.out.print(queue.dequeue() + " ");
        }


    }

    /**
     * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
     * @param list исходный список
     * @return сумма всех элементов
     */
    static int task3(LinkedList<Integer> list){
        ListIterator<Integer> iterator = list.listIterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        return sum;
    }

}