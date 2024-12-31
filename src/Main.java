import java.util.*;

/**
 * Головний клас для демонстрації роботи з колекцією.
 */
public class Main {
    public static void main(String[] args) {
        // Створення колекції з одним елементом
        MusicComposition rockSong = new RockComposition("We Will Rock You", 3.5);
        SinglyLinkedList<MusicComposition> album = new SinglyLinkedList<>(rockSong);

        // Додавання інших композицій до колекції
        album.add(new ClassicalComposition("Für Elise", 2.5));
        album.add(new RockComposition("Bohemian Rhapsody", 5.9));

        // Виведення композицій альбому
        System.out.println("Album Compositions:");
        album.printList();

        // Виведення загальної кількості композицій
        System.out.println("\nTotal compositions: " + album.size());

        // Отримання композиції за індексом
        System.out.println("\nComposition at index 1: " + album.get(1));
    }
}
