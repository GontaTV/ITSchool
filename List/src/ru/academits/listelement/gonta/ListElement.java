package ru.academits.listelement.gonta;

public class ListElement<T> {
    private ListElement<T> next;
    private T data;

    public ListElement(T data) {
        this.data = data;
    }

    public ListElement(T data, ListElement<T> next) {
        this.data = data;
        this.next = next;
    }

    public ListElement<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}
