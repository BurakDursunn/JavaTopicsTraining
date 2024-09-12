package DependencyInjection;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with message: " + message);
    }
}
