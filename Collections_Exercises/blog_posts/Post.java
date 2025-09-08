import java.util.Objects;

public class Post implements Comparable<Post> {

    private Author author;
    private String title;
    private String body;
    private Categories category;

    public Post(Author author,
                String title,
                String body,
                Categories category) {
                    setAuthor(author);
                    setTitle(title);
                    setBody(body);
                    setCategory(category);
                }

    public Author getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public Categories getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String string = getTitle();
        return string;
    }

    @Override
    public int compareTo(Post arg0) {
        
        return getTitle().compareTo(arg0.getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Post post = (Post)obj;

        return getAuthor().equals(post.getAuthor()) && getTitle().equals(post.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getTitle());
    }
}