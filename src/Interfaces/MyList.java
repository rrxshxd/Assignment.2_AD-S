package Interfaces;

public interface MyList<T> {
    void addElement(T data);
    T getElement(int index);
    T remove(int index);
}
