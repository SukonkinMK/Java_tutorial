import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        Integer[] arr = new Integer[] {123,21,12,34,10};
        printArr(arr);
        Arrays.sort(arr, new MyComparator());
        printArr(arr);
    }
    public static void printArr(Integer[] arr){
        for (Integer item: arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


}
