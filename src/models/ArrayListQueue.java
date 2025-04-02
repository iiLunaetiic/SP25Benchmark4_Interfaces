package models;

import java.util.ArrayList;
import java.util.NoSuchElementException;

//NOTE: This file does NOT need a class contract, and it doesn't need method contract either. Just define and implement the
//primary methods
public class ArrayListQueue<E> implements IQueue<E> {

    private final ArrayList<E> list = new ArrayList<>();

    @Override
    public void enqueue(E element) {
        list.add(element);
    }

    @Override
    public E dequeue(E element) {
        return null;
    }

    @Override
    public E dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        return list.remove(0);
    }

    @Override
    public E element() {
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void addAll(IQueue<E> queue) {

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
