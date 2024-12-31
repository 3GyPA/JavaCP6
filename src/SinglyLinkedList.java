import java.util.*;
/**
 * Клас, що реалізує однозв'язний список, який зберігає елементи типу T.
 * Реалізує інтерфейс MyList.
 *
 * @param <T> Тип елементів, що зберігаються в списку
 */
public class SinglyLinkedList<T> implements MyList<T> {
    private Node<T> head;  // Голова списку
    private int size;  // Розмір списку

    /**
     * Внутрішній клас для представлення вузла списку.
     *
     * @param <T> Тип елемента, що зберігається в вузлі
     */
    private static class Node<T> {
        T data;  // Дані вузла
        Node<T> next;  // Посилання на наступний вузол

        /**
         * Конструктор для створення вузла.
         *
         * @param data дані, що зберігаються в вузлі
         */
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Порожній конструктор, ініціалізує порожній список.
     */
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Конструктор, який ініціалізує список з одним елементом.
     *
     * @param data дані, що зберігаються в єдиному елементі списку
     */
    public SinglyLinkedList(T data) {
        this.head = new Node<>(data);
        this.size = 1;
    }

    /**
     * Конструктор, який ініціалізує список з іншої колекції.
     *
     * @param c колекція, з якої додаються елементи
     */
    public SinglyLinkedList(Collection<? extends T> c) {
        this();
        for (T item : c) {
            add(item);
        }
    }

    /**
     * Додає елемент до колекції.
     *
     * @param e елемент, який додається до списку
     */
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

    /**
     * Отримує елемент за вказаним індексом.
     *
     * @param index індекс елемента
     * @return елемент, що знаходиться за вказаним індексом
     * @throws IndexOutOfBoundsException якщо індекс знаходиться за межами списку
     */
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

    /**
     * Повертає кількість елементів у списку.
     *
     * @return кількість елементів у списку
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Видаляє перший зустрінутий елемент з колекції.
     *
     * @param e елемент, який необхідно видалити
     * @return true, якщо елемент був знайдений та видалений, false - якщо елемент не знайдений
     */
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

    /**
     * Виводить всі елементи списку на консоль.
     */
    @Override
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
