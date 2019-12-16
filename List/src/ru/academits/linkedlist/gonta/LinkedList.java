package ru.academits.linkedlist.gonta;

import ru.academits.listelement.gonta.ListElement;

import java.util.Objects;

public class LinkedList<T> {
    private ListElement<T> head;
    private int count;

    public int getCount() {
        return count;
    }

    public T getFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("список пуст");
        }

        return head.getData();
    }

    private ListElement<T> searchElementByIndex(int index) {
        if (index < 0 || index >= getCount()) {
            throw new IndexOutOfBoundsException("Index должен равнятся от 0 до " + (getCount() - 1));
        }

        ListElement<T> p = head;

        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        return p;
    }

    public T getElementByIndex(int index) {
        return searchElementByIndex(index).getData();
    }

    public T setElementByIndex(T data, int index) {
        ListElement<T> p = searchElementByIndex(index);
        T oldElement = p.getData();
        p.setData(data);

        return oldElement;
    }

    public void addBegin(T data) {
        ListElement<T> p = new ListElement<>(data);
        p.setNext(head);
        head = p;
        count++;
    }

    public void addByIndex(T data, int index) {
        if (index < 0 || index > getCount()) {
            throw new IndexOutOfBoundsException("Index должен равнятся от 0 до " + (getCount()));
        }

        if (index == 0) {
            addBegin(data);
        } else {
            ListElement<T> p = searchElementByIndex(index - 1);
            ListElement<T> q = new ListElement<>(data);

            if (index == getCount()) {
                p.setNext(q);
                count++;
            } else {
                q.setNext(p.getNext());
                p.setNext(q);
                count++;
            }
        }
    }

    public T deleteElementByIndex(int index) {
        T deletedElement = searchElementByIndex(index).getData();

        if (getCount() == 1) {
            head = null;
            count--;
        } else if (index == 0) {
            deleteFirstElement();
        } else {
            ListElement<T> p = searchElementByIndex(index - 1);
            p.setNext(p.getNext().getNext());
            count--;
        }
        return deletedElement;
    }

    public T deleteFirstElement() {
        if (getCount() == 0) {
            throw new IndexOutOfBoundsException("Список пуст");
        }

        ListElement<T> oldElement = head;
        head = head.getNext();
        count--;
        return oldElement.getData();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkedList<?> that = (LinkedList<?>) o;
        return Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }

    public boolean deleteByValue(T value) {
        if (value == head.getData()) {
            deleteFirstElement();
            return true;
        }
        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {

            if (p.getData() == value) {
                assert prev != null;
                prev.setNext(p.getNext());
                count--;
                return true;
            }
        }
        return false;
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

    public LinkedList<T> copy(LinkedList<T> t) {
        reverseList();
        ListElement<T> p = head;

        while (p != null) {
            t.addBegin(p.getData());
            p = p.getNext();
        }
        return t;
    }

    @Override
    public String toString() {
        if (getCount() == 0) {
            throw new IndexOutOfBoundsException("Список пуст");
        }

        ListElement p = head;
        StringBuilder s = new StringBuilder();

        while (p != null) {
            s.append(p.getData());
            if (p.getNext() != null) {
                s.append(", ");
            }
            p = p.getNext();
        }
        return "List: " + s;
    }
}
