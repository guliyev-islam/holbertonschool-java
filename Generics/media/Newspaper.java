public class Newspaper extends Media {

    private int articleCount;

    public Newspaper(String name, int articleCount) {
        super(name);
        setArticleCount(articleCount);
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }
}