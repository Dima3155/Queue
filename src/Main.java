import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Person> attraction = new LinkedList<>();
        attraction.addAll(generateClients());

        while (!attraction.isEmpty()) {
            Person currentClient = attraction.poll();
            System.out.println(currentClient.getFullName() + " прокатился на аттракционе");
            currentClient.decTicket();
            if (!currentClient.noTickets()) {
                attraction.offer(currentClient);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Николай", "Завгородний", 3));
        list.add(new Person("Андрей", "Петров", 5));
        list.add(new Person("Наталья", "Сидорова", 7));
        list.add(new Person("Степан", "Кулаков", 4));
        list.add(new Person("Серафим", "Волшебный", 9));
        return list;
    }
}