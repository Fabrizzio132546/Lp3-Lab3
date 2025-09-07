package Actividad2;

public class Main {
    public static void main(String[] args) {
        NotificationManager emailNotification = new NotificationEmail();
        emailNotification.send("Mensaje por correo");

        NotificationManager smsNotification = new NotificationSMS();
        smsNotification.send("Mensaje por SMS");
    }
}
