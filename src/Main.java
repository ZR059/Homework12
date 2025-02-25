public class Main {
    public static void main(String[] args) {
        Book dracula = new Book("Dracula", "Bram Stoker", 1897);
        Book forrest = new Book("Forrest Gump", "Winston Groom", 1986);

        Author lev = new Author("Lev", "Tolstoy");
        Author aleksandr = new Author("Aleksandr", "Pushkin");

        forrest.setYearOfPublication(2008);

    }
}