import java.util.Objects;
import java.util.Random;

public class Document {
    int number;
    String title;

    public Document(int number, String title) {
        this.number = number;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return number == document.number && Objects.equals(title, document.title);
    }

    @Override
    public int hashCode() {
        Random r = new Random();
        return r.nextInt();//Objects.hash(number, title);
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", title='" + title + '\'' +
                '}';
    }
}