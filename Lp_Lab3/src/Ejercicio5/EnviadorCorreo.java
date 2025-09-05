package Ejercicio5;

public class EnviadorCorreo implements CanalNotificacion {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[Correo] Enviando correo: " + mensaje);
    }
}
