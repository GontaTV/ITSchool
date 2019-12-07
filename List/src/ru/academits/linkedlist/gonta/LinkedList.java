package ru.academits.linkedlist.gonta;

import ru.academits.listelement.gonta.ListElement;

public class LinkedList<T> {
    private ListElement<T> head;
    private int count;

    public int getCount() {
        return count;
    }

    public T getFirst() {
        return head.getData();
    }

    public T getElementByIndex(int index) {
        if (index < 0 || index > getCount() - 1) {
            throw new IndexOutOfBoundsException("Index должен равнятся от 0 до " + (getCount() - 1));
        }

        ListElement<T> p = head;

        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        return p.getData();
    }

    public T setElementByIndex(T data, int index) {
        if (index < 0 || index > getCount() - 1) {
            throw new IndexOutOfBoundsException("Index должен равнятся от 0 до " + (getCount() - 1));
        }

        ListElement<T> p = head;

        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        T oldElement = p.getData();
        p.setData(data);

        return oldElement;
    }

    public void add(T data) {
        ListElement<T> p = new ListElement<>(data);
        p.setNext(head);
        head = p;
        count++;
    }

    public void addByIndex(T data, int index) {
        if (index < 0 || index > getCount() - 1) {
            throw new IndexOutOfBoundsException("Index должен равнятся от 0 до " + (getCount() - 1));
        }

        ListElement<T> p = head;

        if (index == 0) {
            add(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                p = p.getNext();
            }

            ListElement<T> q = new ListElement<>(data);

            q.setNext(p.getNext());
            p.setNext(q);
            count++;
        }
    }

    public T delElementByIndex(int index) {
        if (index < 0 || index > getCount() - 1) {
            throw new IndexOutOfBoundsException("Index должен равнятся от 0 до " + (getCount() - 1));
        }

        ListElement<T> p = head;

        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }

        T deletedElement = p.getNext().getData();
        p.setNext(p.getNext().getNext());
        count--;
        return deletedElement;
    }

    public T delFirstElement() {
        ListElement<T> oldElement = head;
        head = head.getNext();
        count--;
        return oldElement.getData();
    }

    public boolean delByValue(T value) {
        if (value == head.getData()) {
            delFirstElement();
            return true;
        } else {
            for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {
                if (p.getData() == value) {
                    assert prev != null;
                    prev.setNext(prev.getNext().getNext());
                    count--;
                    return true;
                }
            }
            return false;
        }
    }

    public void reverseList() {
        ListElement<T> next;

        for (ListElement<T> p = head, prev = null; p != null; p = next) {
            next = p.getNext();
            p.setNext(prev);
            prev = p;

            if (next == null) {
                head = p;
            }
        }
    }

    public void print() {
        ListElement p = head;

        while (p != null) {
            System.out.print(p.getData() + ", ");
            p = p.getNext();
        }
    }

    public void copy(LinkedList<T> t) {
        reverseList();
        ListElement<T> p = head;

        while (p != null) {
            t.add(p.getData());
            p = p.getNext();
        }
    }
}
