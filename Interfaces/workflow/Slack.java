public class Slack implements NotificationChannel {
    
    @Override
    public void notify(Message message) {
        System.err.printf("[SLACK] {%s} - %s", message.getMessageType(), message.getText());
    }    
}