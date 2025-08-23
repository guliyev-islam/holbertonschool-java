import java.util.ArrayList; 

public class VideoProcessor {

    private ArrayList<NotificationChannel> channels = new ArrayList<NotificationChannel>();

    public ArrayList<NotificationChannel> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<NotificationChannel> channels) {
        this.channels = channels;
    }
    
    public void registerChannel(NotificationChannel channel) {
        getChannels().add(channel);
    }

    public void process(Video video) {
        Message message = new Message(video.getFile(), MessageType.LOG);
        
        for (NotificationChannel channel : getChannels()) {
            channel.notify(message);
            System.err.printf(" - %s\n", video.getFormat());
        }
    }
}
