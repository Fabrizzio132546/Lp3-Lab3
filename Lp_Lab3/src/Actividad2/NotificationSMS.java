package Actividad2;

public class NotificationSMS implements NotificationManager {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
