package uml;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<String> authors=new ArrayList<>();
    private LocalDate date;

    public List<String> getAuthors() {
        return authors;
    }

    public LocalDate getDate() {
        return date;
    }

    public void addAuthor(String author) {
        authors.add(author);
    }
}
