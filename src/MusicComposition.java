/**
 * Абстрактний клас для музичних композицій.
 * Містить загальні властивості композиції та метод для отримання стилю.
 */
abstract class MusicComposition {
    private String title;  // Назва композиції
    private double duration;  // Тривалість композиції в хвилинах

    /**
     * Конструктор для ініціалізації композиції.
     *
     * @param title назва композиції
     * @param duration тривалість композиції в хвилинах
     */
    public MusicComposition(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    /**
     * Отримує назву композиції.
     *
     * @return назва композиції
     */
    public String getTitle() {
        return title;
    }

    /**
     * Отримує тривалість композиції.
     *
     * @return тривалість композиції в хвилинах
     */
    public double getDuration() {
        return duration;
    }

    /**
     * Повертає рядкове представлення композиції.
     *
     * @return рядкове представлення композиції
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Duration: " + duration + " min";
    }

    /**
     * Абстрактний метод для отримання стилю композиції.
     *
     * @return стиль композиції
     */
    public abstract String getStyle();
}
/**
 * Клас для рок-композиції.
 * Реалізує метод getStyle для стилю "Rock".
 */
class RockComposition extends MusicComposition {
    /**
     * Конструктор для створення рок-композиції.
     *
     * @param title назва композиції
     * @param duration тривалість композиції в хвилинах
     */
    public RockComposition(String title, double duration) {
        super(title, duration);
    }

    /**
     * Повертає стиль композиції.
     *
     * @return стиль композиції: "Rock"
     */
    @Override
    public String getStyle() {
        return "Rock";
    }
}
/**
 * Клас для класичної композиції.
 * Реалізує метод getStyle для стилю "Classical".
 */
class ClassicalComposition extends MusicComposition {
    /**
     * Конструктор для створення класичної композиції.
     *
     * @param title назва композиції
     * @param duration тривалість композиції в хвилинах
     */
    public ClassicalComposition(String title, double duration) {
        super(title, duration);
    }

    /**
     * Повертає стиль композиції.
     *
     * @return стиль композиції: "Classical"
     */
    @Override
    public String getStyle() {
        return "Classical";
    }
}
