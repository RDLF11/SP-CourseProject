package dataStructures;

public interface Queue<E> {
    
    //friendly values (implicit visibility)

    //check if queue even exists
    boolean isEmpty();

    //Length of teh queue
    int size();

    //first Node
    E front();

    //input info value inside the queue
    void enqueue(E info);

    //Extract the E info value from the queue
    E dequeue();

}
