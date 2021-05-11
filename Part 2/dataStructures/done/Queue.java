package dataStructures;

public interface Queue<E> {
    boolean isEmpty();

    int size();

    E front();

    void enqueue(E info);

    E dequeue();
}
