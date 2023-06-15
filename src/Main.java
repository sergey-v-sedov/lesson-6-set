import java.util.*;

public class Main {
    public static void main(String[] args) {
        example3();
    }

    static void example3() {
        Document doc1 = new Document(1, "Документ 1");
        Document doc2 = new Document(2, "Документ 2");
        Document doc3 = new Document(3, "Документ 3");

        NavigableSet<Document> set = new TreeSet<>();
        set.add(doc1);
        set.add(doc3);
        set.add(doc2);

        Document firstDoc = set.first();
        Document lastDoc = set.last();

        System.out.println(firstDoc);
        System.out.println(lastDoc);

        Iterator<Document> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterator<Document> descIt = set.descendingIterator();
        while (descIt.hasNext()) {
            System.out.println(descIt.next());
        }
    }

    static void example2() {
        Document doc1 = new Document(1, "Документ 1");
        Document doc2 = new Document(2, "Документ 2");
        Document doc3 = new Document(3, "Документ 3");
        Document doc4 = new Document(3, "Документ 3");

        Set<Document> documents = new HashSet<>();
        documents.add(doc1);
        documents.add(doc2);
        documents.add(doc2);
        documents.add(doc3);
        documents.add(doc4);
        documents.add(new Document(3, "Документ 3"));
        documents.add(new Document(3, "Документ 3"));
        documents.add(new Document(3, "Документ 3"));
        documents.add(new Document(3, "Документ 3"));
        documents.add(new Document(3, "Документ 3"));
        documents.add(new Document(3, "Документ 3"));
        documents.add(new Document(3, "Документ 3"));
        documents.add(new Document(3, "Документ 3"));

        System.out.println(doc3.equals(doc4));

        System.out.println(documents);

    }

    static void example1() {
        Set<String> flowers = new HashSet<>();
        flowers.add("Роза");
        String romOne = new String("Ромашка");
        flowers.add(romOne);
        flowers.add(romOne);
        flowers.add("Гвоздика");

        System.out.println(flowers);

        String romTwo = new String("Ромашка");

        System.out.println( romOne == romTwo );
        System.out.println( romOne.equals(romTwo) );

        boolean isRomashkaExist = flowers.add(romTwo);
        System.out.println("Добавилась ли Ромашка? " + isRomashkaExist);

        System.out.println(flowers);

        boolean isRosaExist = flowers.contains("Роза");
        System.out.println("Присутствует ли РОза? " + isRosaExist);
        boolean isKolokolchikExist = flowers.contains("Колокольчик");
        System.out.println("Присутствует ли Колокольчик? " + isKolokolchikExist);

        flowers.remove("Роза");
        flowers.remove("Колокольчик");

        flowers.add(null);

        System.out.println(flowers);

        Iterator<String> it = flowers.iterator();
        while (it.hasNext()) {
            String flower = it.next();
            System.out.println(flower);
            it.remove();
            System.out.println(flowers);
        }
    }
}