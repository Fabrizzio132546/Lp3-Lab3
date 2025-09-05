package Ejercicio6;


public class EnviadorSMS implements CanalNotificacion {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[SMS] Enviando SMS: " + mensaje);
    }
}
