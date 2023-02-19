package Article;

public class Articles {
    private String title;
    private String author;

    @Override
    public String toString() {
        return "Articles{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Articles(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

