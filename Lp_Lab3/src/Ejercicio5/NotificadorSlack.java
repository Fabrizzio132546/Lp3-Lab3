package Ejercicio5;

public class NotificadorSlack implements CanalNotificacion {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[Slack] Publicando en canal Slack: " + mensaje);
    }
}
