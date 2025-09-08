import java.util.ArrayList;
import java.util.HashMap;
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

    public void addPost(Post post) throws Exception {
        
        if (getPosts().contains(post)) {
            throw new Exception("Post already exists");
        }
        
        getPosts().add(post);
    }

    public TreeSet<Author> getAllAuthors() {
        TreeSet<Author> authors = new TreeSet<Author>();
        Author author;

        for (Post post: getPosts()) {
            author = post.getAuthor();
            authors.add(author);
        }

        return authors;
    }

    public TreeMap<Categories, Integer> getCountByCategory() {
        TreeMap<Categories, Integer> countByCategory = new TreeMap<Categories, Integer>();
        Categories category;
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


    public TreeSet<Post> getPostsByAuthor(Author author) {
        TreeSet<Post> posts = new TreeSet<Post>();

        for (Post post: getPosts()) {
            if (post.getAuthor().equals(author)) {
                posts.add(post);
            }
        }

        return posts;
    }

    public TreeSet<Post> getPostsByCategory(Categories category) {
        TreeSet<Post> posts = new TreeSet<Post>();

        for (Post post: getPosts()) {
            if (post.getCategory().equals(category)) {
                posts.add(post);
            }
        }

        return posts;
    }

    public HashMap<Categories, TreeSet<Post>> getAllPostsByCategories() {
        HashMap<Categories, TreeSet<Post>> postsByCategories = new HashMap<Categories, TreeSet<Post>>();
        Categories category;

        for (Post post: getPosts()) {
            category = post.getCategory();
            postsByCategories.put(category, getPostsByCategory(category));
        }
        
        return postsByCategories;
    }

    public TreeMap<Author, TreeSet<Post>> getAllPostsByAuthor() {
        TreeMap<Author, TreeSet<Post>> postsByCategories = new TreeMap<Author, TreeSet<Post>>();
        Author author;

        for (Post post: getPosts()) {
            author = post.getAuthor();
            postsByCategories.put(author, getPostsByAuthor(author));
        }

        return postsByCategories;
    }
}