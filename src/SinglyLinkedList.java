import java.util.*;

/**
 * Клас, що реалізує однозв'язний список, який зберігає елементи типу MusicComposition.
 * Реалізує інтерфейс MyList.
 */
public class SinglyLinkedList<T> implements MyList<T> {
    private Node<T> head;  // Голова списку
    private int size;  // Розмір списку

    // Внутрішній клас для представлення вузла списку
    private static class Node<T> {
        T data;  // Дані вузла
        Node<T> next;  // Посилання на наступний вузол

        // Конструктор вузла
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Порожній конструктор
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Конструктор, що приймає один об'єкт
    public SinglyLinkedList(T data) {
        this.head = new Node<>(data);
        this.size = 1;
    }

    // Конструктор, що приймає стандартну колекцію об'єктів
    public SinglyLinkedList(Collection<? extends T> c) {
        this();
        for (T item : c) {
            add(item);
        }
    }

    @Override
    public void add(T e) {
        Node<T> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(T e) {
        if (head == null) return false;
        if (head.data.equals(e)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(e)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
