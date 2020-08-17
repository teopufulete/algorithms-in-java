import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MinPQ<Key> implements Iterable<Key> {
    private Key[] pq;                    // store items at indices 1 to n
    private int n;                       // number of items on priority queue
    private Comparator<Key> comparator;  // optional comparator
    

    // initializes  empty priority queue with a given initial capacity
    public MinPQ(int initCapacity) {

    }

    // initialize empty priority queue
    public MinPQ() {

    }

    // initialize an empty priority queue with the given initial capacity using the given comparator.
    public MinPQ(int initCapacity, Comparator<Key> comparator) {

    }

    // initialize an empty priority queue using the given comparator.
    public MinPQ(Comparator<Key> comparator) {

    }

    // initialize priority queue from the array of keys
    public MinPQ(Key[] keys) {
    
    }


    // check if pq is empty
    public boolean isEmpty() {

    }

    // return number of keys on priority queue
    public int size() {

    }

    // return smallest key on this priority queue

    public Key min() {

    }

    // helper function to double the size of the heap array
    private void resize(int capacity) {
        
    }

    // insert new key to this priority queue
    public void insert(Key x) {
        
    }

    // remove and return smallest key on this priority queue
    public Key delMin() {

    }


   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/

    private void swim(int k) {

    }

    private void sink(int k) {

    }

   /***************************************************************************
    * Helper functions for compares and swaps.
    ***************************************************************************/
    private boolean greater(int i, int j) {

    }

    private void exch(int i, int j) {
        
    }

    // is pq[1..n] a min heap?
    private boolean isMinHeap() {
        
    }

    // is subtree of pq[1..n] rooted at k a min heap?
    private boolean isMinHeapOrdered(int k) {
        
    }


    public Iterator<Key> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<Key> {
        
    }

    // unit test
    public static void main(String[] args) {

    }
}
