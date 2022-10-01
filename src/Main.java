import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(task4(4));
    }

    static void task1(){
        System.out.print("Введите имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int hour = LocalTime.now().getHour();
        if (hour >= 12 && hour < 18) {
            System.out.print("Добрый день, ");
        } else if (hour >=18 && hour < 23){
            System.out.print("Добрый вечер, ");
        } else if (hour >= 6 && hour < 12){
            System.out.print("Доброе утро, ");
        } else {
            System.out.print("Доброй ночи, ");
        }
        System.out.println( name + "!");
    }
    static  void task2(){
        var arr = new int[]{1,1,0,1,0,1,1,1,1};
        int max_score = 0;
        int current_score = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                current_score++;
            }
            else{
                if(max_score < current_score){
                    max_score = current_score;
                }
                current_score = 0;
            }
        }
        if(max_score < current_score){
            max_score = current_score;
        }
        System.out.println(max_score);
    }
    static  void task3(){
        var nums = new int[]{1,3,2,1,2,3,4};
        int val = 3;
        var arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = val;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (nums[i] != val) {
                arr[index] = nums[i];
                index++;
            }
        }
    }
    static  int task4(int n){
        return n*(n+1)/2;
    }
}