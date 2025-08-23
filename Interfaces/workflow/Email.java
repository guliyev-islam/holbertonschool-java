public class Email implements NotificationChannel {
    
    @Override
    public void notify(Message message) {
        System.err.printf("[EMAIL] {%s} - %s", message.getMessageType(), message.getText());
    }    
}