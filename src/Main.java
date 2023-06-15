import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> flowers = new HashSet<>();
        flowers.add("Роза");
        flowers.add("Ромашка");
        flowers.add("Гвоздика");

        System.out.println(flowers);

        boolean isRomashkaExist = flowers.add("Ромашка");
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