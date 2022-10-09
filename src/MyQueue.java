import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> list;

    public MyQueue(){
        list = new LinkedList<>();
    }

    /**
     * помещает элемент в конец очереди
     */
    public void enqueue(int value){
        list.add(value);
    }

    /**
     * возвращает первый элемент из очереди и удаляет его
     * @return первый элемент из очереди
     */
    public int dequeue(){
        if(!list.isEmpty())
            return list.pollFirst();
        else
            return 0;
    }

    /**
     * возвращает первый элемент из очереди, не удаляя
     * @return первый элемент из очереди
     */
    public int first(){
        if(!list.isEmpty())
            return list.peekFirst();
        else
            return 0;
    }
}
