import java.util.*;

public class Main {
    public static void main(String[] args) {
        task3();
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

    /**
     * Реализовать алгоритм сортировки слиянием
     */
    static void task3(){
        List<Integer> list = ArrayListGenerator(20);
        System.out.println(list);
        System.out.println(MergeSort(list,0,list.size() - 1));
    }
    static List<Integer> MergeSort(List<Integer> list, int start, int end){
        if(start < end){
            if(end - start == 1){
                if(list.get(start) > list.get(end)){
                    int tmp = list.get(start);
                    list.set(start, list.get(end));
                    list.set(end, tmp);
                }
            } else{
                int mid = (start + end) / 2;
                MergeSort(list,start,mid);
                MergeSort(list, mid +1, end);
                var left = start;
                var right = mid + 1;
                var tempArray = new int[end - start + 1];
                var index = 0;
                while ((left <= mid) && (right <= end))
                {
                    if (list.get(left) < list.get(right))
                    {
                        tempArray[index] = list.get(left);
                        left++;
                    }
                    else
                    {
                        tempArray[index] = list.get(right);
                        right++;
                    }
                    index++;
                }
                for (var i = left; i <= mid; i++)
                {
                    tempArray[index] = list.get(i);
                    index++;
                }
                for (var i = right; i <= end; i++)
                {
                    tempArray[index] = list.get(i);
                    index++;
                }
                for (var i = 0; i < tempArray.length; i++)
                {
                    list.set(start + i,tempArray[i]);
                }
            }
        }
        return list;
    }
}