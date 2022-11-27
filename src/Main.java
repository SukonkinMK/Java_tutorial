public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2};
        int[] arr2 = new int[] {2, 1};
        int[] arr3 = new int[] {2, 1, 4};
        try{
            PrintArr(task4(arr1,arr2));
            System.out.println();
            PrintArr(task4(arr1,arr3));
        }
        catch (RuntimeException exception){
            System.out.println(exception);
        }
    }

    public static void task1(){
        System.out.println(1 / 0);
    }
    public static void task2(){
        int[] arr = new int[] {1, 2};
        System.out.println(arr[3]);
    }
    public static void task3(){
        throw new RuntimeException();
    }

    public static int[] task4(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new RuntimeException("Длина массивов должна быть одинакова");
        }
        else{
            int[] res = new int[arr1.length];
            for(int i = 0; i < arr1.length; i++){
                res[i] = arr1[i] - arr2[i];
            }
            return res;
        }
    }
    public static void PrintArr(int[] arr){
        System.out.print("{ ");
        for (int item:
             arr) {
            System.out.print(item+ " ");
        }
        System.out.print("}");
    }
}