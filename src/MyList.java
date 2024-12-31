/**
 * Інтерфейс для реалізації колекції з однозв'язним списком.
 */
public interface MyList<T> {
    void add(T element);  // Додає елемент до колекції
    T get(int index);  // Отримує елемент за індексом
    int size();  // Повертає кількість елементів
    boolean remove(T element);  // Видаляє елемент з колекції
    void printList();  // Виводить всі елементи колекції
}
