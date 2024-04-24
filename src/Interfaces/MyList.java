package Interfaces;

public interface MyList<T> {
    void addElement(T data);
    void setElement(int index, T element);
    void addElement(int index, T element);
    void addFirst(T element);
    void addLast(T element);
    T getElement(int index);
    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort();
    int indexOf(Object object);
    boolean exists(Object object);
    public T[] toArray();
    void clear();
    int size();
}
