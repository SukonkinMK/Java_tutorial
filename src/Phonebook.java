import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> map;

    public Phonebook(){
        map = new HashMap<>();
    }

    public void add(String name, String phone){
        if(map.containsKey(name)){
            List<String> list = map.get(name);
            list.add(phone);
        }
        else {
            List<String> list = new LinkedList<>();
            list.add(phone);
            map.put(name,list);
        }
    }

    public void printPhonebook(){
        for (String key:map.keySet()) {
            System.out.print(key);
            List<String> list = map.get(key);
            for (String s : list) {
                System.out.print(" " + s);
            }
            System.out.println();
        }
    }
}
