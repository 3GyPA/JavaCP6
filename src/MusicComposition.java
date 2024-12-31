/**
 * Абстрактний клас для музичних композицій.
 */
abstract class MusicComposition {
    private String title;  // Назва композиції
    private double duration;  // Тривалість композиції

    public MusicComposition(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Duration: " + duration + " min";
    }

    public abstract String getStyle();
}
/**
 * Клас для рок-композиції.
 */
class RockComposition extends MusicComposition {
    public RockComposition(String title, double duration) {
        super(title, duration);
    }

    @Override
    public String getStyle() {
        return "Rock";
    }
}
/**
 * Клас для класичної композиції.
 */
class ClassicalComposition extends MusicComposition {
    public ClassicalComposition(String title, double duration) {
        super(title, duration);
    }

    @Override
    public String getStyle() {
        return "Classical";
    }
}
