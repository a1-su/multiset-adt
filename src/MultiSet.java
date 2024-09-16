/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);

    /**
     * Remove the given item from this multiset.
     *
     * @param item the item to remove
     */
    abstract void remove(Integer item);

    /**
     * Check if the given item is in this multiset.
     *
     * @param item the item to check
     */
    abstract boolean contains(Integer item);

    /**
     * Check if the multiset is empty.
     */
    abstract boolean is_empty();

    /**
     * Counts the number of times the given item is in this multiset.
     *
     * @param item the item to count
     */
    abstract int count(Integer item);

    /**
     * Return the size of this multiset.
     */
    abstract int size();
}
