import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
    
    private ArrayList<Post> posts;

    public Blog() {
        setPosts(new ArrayList<Post>());
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void addPost(Post post) {
        getPosts().add(post);
    }

    public TreeSet<String> getAllAuthors() {
        TreeSet<String> authors = new TreeSet<String>();
        String author;

        for (Post post: getPosts()) {
            author = post.getAuthor();
            authors.add(author);
        }

        return authors;
    }

    public TreeMap<String, Integer> getCountByCategory() {
        TreeMap<String, Integer> countByCategory = new TreeMap<String, Integer>();
        String category;
        Integer count;

        for (Post post: getPosts()) {
            category = post.getCategory();
            if (!countByCategory.containsKey(category)) {
                countByCategory.put(category, 0);
            }
            count = countByCategory.get(category);
            countByCategory.put(category, count + 1);
        }

        return countByCategory;
    }
}