public class Main {
    public static void main(String[] args) {
        // Задача: Дан массив пар названий книг и авторов, необходимо привести каждую пару
        // в строку вида: «Название книги» И.О.Автора.

        String[] books = {"Война и мир", "Евгений Онегин", "Идиот"};
        String[] authors = {"Л.Н.Толстой", "А.С.Пушкин", "Ф.М.Достоевский"};

        for (int i = 0; i < books.length && i < authors.length; i++) {
            String book = "«" + books[i] + "» " + authors[i];
            System.out.println(book);
        }
    }
}