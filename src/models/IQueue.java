package models;

/**
 * An IQueue is an interface for a queue data structure. Queues follow the FIFO (First In, First Out)
 * principle, meaning that the first element added will be the first one removed.
 *
 * All queues must support adding elements to the back with enqueue, removing elements from the front
 * with dequeue, and viewing the front element with element (at a minimum).
 *
 * @initialization_ensures: self will be initialized as an empty queue.
 *
 * @defines:
 * self: The queue
 * size: The number of elements currently in the queue
 * front: The first element in the queue
 * back: The last element added to the queue
 *
 * @constraints:
 * size >= 0
 * The next item to be removed from self is the first item that was added
 */

public interface IQueue<E>
{
    /**
     * Add element to the end of the queue by calling the relevant data structure's add/insert/append method
     *
     * @param element element to add
     *
     * @pre element != null
     *
     * @post self = #self with element added to the end of the queue AND size = #size + 1
     */
    public void enqueue(E element);

    E dequeue(E element);

    /**
     * Return the first element of the queue without removing it, returning null if the queue is empty.
     *
     * @return the first element of the queue
     *
     * @pre None
     *
     * @post element = the item from the front of the queue AND self = #self
     */
    public E element();

    /**
     * Check if the queue is empty by checking if the first element is null.
     *
     * @return true if the queue is empty, false otherwise
     *
     * @pre None
     *
     * @post isEmpty = true if size == 0, false otherwise AND self = #self
     */
    public boolean isEmpty();

    /**
     * Add all elements from another queue to the end of this queue by dequeueing all elements from the other queue and
     * enqueueing them to this queue. This method should ideally not modify the parameter queue.
     *
     * @param queue the queue to copy the elements from and add to the end of this queue
     *
     * @pre queue != null AND queue.size() > 0
     *
     * @post self = #self with all elements from queue added to the end of the queue AND size = #size + queue.size()
     */
    public void addAll(IQueue<E> queue);


    /**
     * Remove and return the first element of the queue by calling the relevant data structure's remove/delete method.
     *
     * @return the first element of the queue
     *
     * @pre size > 0
     *
     * @post dequeue = the item from the front of the queue AND self = #self with the first element removed AND size = #size - 1
     */
    public E dequeue();

    /**
     * Return the number of elements in the queue. In order to maintain some level of efficiency, this method should not
     * require iterating through all elements in the queue and instead refer to the relevant data structure's size/length
     * field.
     *
     * @return the number of elements in the queue
     *
     * @pre None
     *
     * @post size = the number of elements in the queue AND self = #self
     */
    public int size();
}
