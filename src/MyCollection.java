import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection implements Iterable<String>{
    private List<String> list;

    public MyCollection() {
        this.list = new ArrayList<>();
    }

    public void add(String s){
        list.add(s);
    }

    public String get(int index){
        if(index < list.size()){
            return list.get(index);
        }
        return "";
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }
}
