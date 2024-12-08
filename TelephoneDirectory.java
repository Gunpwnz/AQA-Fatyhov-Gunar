import java.util.*;

public class TelephoneDirectory {
    private Map<String, List<String>> directory;

    public TelephoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        TelephoneDirectory td = new TelephoneDirectory();
        td.add("Ivanov", "123456");
        td.add("Petrov", "654321");
        td.add("Ivanov", "789012");

        System.out.println("Номера телефонов для фамилии Ivanov: " + td.get("Ivanov"));
        System.out.println("Номера телефонов для фамилии Petrov: " + td.get("Petrov"));
        System.out.println("Номера телефонов для фамилии Sidorov: " + td.get("Sidorov"));
    }
}
