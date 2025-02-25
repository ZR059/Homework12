public class Main {
    public static void main(String[] args) {
        Book dracula = new Book("Dracula", new Author("Bram", "Stoker"), 1897);
        Book forrest = new Book("Forrest Gump", new Author("Winston", "Groom"), 1986);

        Author lev = new Author("Lev", "Tolstoy");
        Author aleksandr = new Author("Aleksandr", "Pushkin");

        forrest.setYearOfPublication(2008);

    }
}