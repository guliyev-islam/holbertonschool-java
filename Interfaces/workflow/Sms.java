public class Sms implements NotificationChannel {
    
    @Override
    public void notify(Message message) {
        System.out.printf("[SMS] {%s} - %s", message.getMessageType(), message.getText());
    }    
}