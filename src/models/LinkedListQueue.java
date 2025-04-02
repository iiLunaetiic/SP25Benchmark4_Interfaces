package models;

import java.util.LinkedList;
import java.util.NoSuchElementException;

//NOTE: This file does NOT need a class contract, and it doesn't need method contract either. Just define and implement the
//primary methods
public class LinkedListQueue<E> implements IQueue<E>
{
    private final LinkedList<E> list = new LinkedList<>();

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E dequeue(E element) {
        if(list.isEmpty()){
            throw new NoSuchElementException("Queue is empty.");
        }
        return list.removeFirst();
    }

    @Override
    public E element(){
        return list.isEmpty() ? null : list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void addAll(IQueue<E> queue) {
        LinkedListQueue<E> tempQueue = new LinkedListQueue<>();
        while (!queue.isEmpty()) {
            E element = queue.dequeue();
            this.enqueue(element);
            tempQueue.enqueue(element);
        }
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
    }

    @Override
    public E dequeue() {
        return null;
    }


    @Override
    public int size() {
        return list.size();
    }

    //Ignore this, I need it for writing your autograder tests
    public String toString() {
        return list.toString();
    }
}
