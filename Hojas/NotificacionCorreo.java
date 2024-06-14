package Hojas;

public class NotificacionCorreo implements notificacion {
    @Override
    public void send(String mensaje) {
        System.out.println("notificacion por correo: " + mensaje);
    }
}
