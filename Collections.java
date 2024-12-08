import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // Создаем массив слов
        String[] wordsArray = { "apple", "banana", "apple", "orange", "banana", "grape", "apple", "melon", "banana",
                "grape" };

        // Создаем список для хранения уникальных слов
        List<String> uniqueWords = new ArrayList<>();

        // Создаем мапу для подсчета количества вхождений каждого слова
        Map<String, Integer> wordCount = new HashMap<>();

        // Обрабатываем массив слов
        for (String word : wordsArray) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова
        System.out.println("Уникальные слова: " + uniqueWords);

        // Выводим количество вхождений каждого слова
        System.out.println("Количество вхождений каждого слова: " + wordCount);
    }
}
