import java.util.*;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    static void task1(){
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivan","1234567");
        phonebook.add("Ivan","7654321");
        phonebook.add("Ivan","333222111");
        phonebook.add("Dima","1234567");
        phonebook.add("Dima","2452");
        phonebook.add("Dima","1233445");
        phonebook.printPhonebook();
    }
    static void task2(){
        String[] arr = new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"};
        Map<String,Integer> map = new HashMap<>();
        for (String s : arr) {
            String name = s.split(" ")[0];
            if(map.containsKey(name)){
                int tmp = map.get(name);
                tmp++;
                map.put(name,tmp);
            }
            else {
                map.put(name,1);
            }
        }
        Map<Integer,List<String>> treemap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer key1, Integer key2) {
                return Integer.compare(key2, key1);
            }
        });
        for (String key : map.keySet()) {
            int tmp = map.get(key);
            if(treemap.containsKey(tmp)){
                List<String> list = treemap.get(tmp);
                list.add(key);
            }
            else {
                List<String> list = new LinkedList<>();
                list.add(key);
                treemap.put(tmp,list);
            }
        }
        System.out.println(treemap);
    }
}