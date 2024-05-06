package _2024_06_03;

public interface QueueV<T> {
    void add(T t);
    T remove();
    boolean isEmpty();
}

