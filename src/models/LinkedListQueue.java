package models;

import java.util.LinkedList;

//NOTE: This file does NOT need a class contract, and it doesn't need method contract either. Just define and implement the
//primary methods
public class LinkedListQueue<E> implements IQueue<E>
{
    private LinkedList<E> list = new LinkedList<>();






    //Ignore this, I need it for writing your autograder tests
    public String toString() {
        return list.toString();
    }
}
