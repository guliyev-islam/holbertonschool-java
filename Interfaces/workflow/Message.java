public class Message {

    private String text;
    private MessageType messageType;

    Message(String text, MessageType messageType) {
        setText(text);
        setMessageType(messageType);
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

}