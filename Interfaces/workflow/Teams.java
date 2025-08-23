public class Teams implements NotificationChannel {
    
    @Override
    public void notify(Message message) {
        System.err.printf("[TEAMS] {%s} - %s", message.getMessageType(), message.getText());
    }    
}