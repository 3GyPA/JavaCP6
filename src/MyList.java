/**
 * Інтерфейс для реалізації колекції з однозв'язним списком.
 * Описує основні операції для роботи з колекцією.
 *
 * @param <T> Тип елементів, що зберігаються в колекції
 */
public interface MyList<T> {
    /**
     * Додає елемент до колекції.
     *
     * @param element елемент, який додається до колекції
     */
    void add(T element);

    /**
     * Отримує елемент за вказаним індексом.
     *
     * @param index індекс елемента
     * @return елемент колекції, що знаходиться за вказаним індексом
     * @throws IndexOutOfBoundsException якщо індекс знаходиться за межами колекції
     */
    T get(int index);

    /**
     * Повертає кількість елементів у колекції.
     *
     * @return кількість елементів у колекції
     */
    int size();

    /**
     * Видаляє елемент з колекції.
     *
     * @param element елемент, який необхідно видалити
     * @return true, якщо елемент був успішно видалений, false - якщо елемент не знайдений
     */
    boolean remove(T element);

    /**
     * Виводить всі елементи колекції на консоль.
     */
    void printList();
}
