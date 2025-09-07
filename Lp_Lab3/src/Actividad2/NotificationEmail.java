package Actividad2;

public class NotificationEmail implements NotificationManager {
    @Override
    public void send(String message) {
        System.out.println("Enviando correo: " + message);
    }
}
