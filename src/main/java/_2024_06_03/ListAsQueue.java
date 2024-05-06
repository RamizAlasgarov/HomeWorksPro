package _2024_06_03;

import java.util.ArrayList;
import java.util.List;

public class ListAsQueue<T> implements QueueV<T> {
    List<T> list = new ArrayList<>();
    @Override
    public void add(T t) {

        list.add(0,t);
    }

    @Override
    public T remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
class Example{
    public static void main(String[] args) {
        ListAsQueue<String> list = new ListAsQueue<>();
        list.add("hello");
        list.add("how are you");
        list.add("bye");
        System.out.println(list);
        System.out.println(list.remove());
    }


}
