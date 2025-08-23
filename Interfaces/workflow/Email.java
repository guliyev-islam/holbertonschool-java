public class Email implements NotificationChannel {
    
    @Override
    public void notify(Message message) {
        System.out.printf("[EMAIL] {%s} - %s", message.getMessageType(), message.getText());
    }    
}