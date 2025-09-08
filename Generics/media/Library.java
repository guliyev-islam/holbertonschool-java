import java.util.ArrayList;

public class Library<T extends Media> {

    ArrayList<T> mediaList;
    
    public ArrayList<T> getMediaList() {
        return mediaList;
    }

    public void setMediaList(ArrayList<T> mediaList) {
        this.mediaList = mediaList;
    }

    public Library() {
        setMediaList(new ArrayList<T>());
    }

    public void addMedia(T media) {
        getMediaList().add(media);
    }
}