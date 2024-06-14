package Hojas;

public class NotificacionLog implements notificacion {
    public void send(String message) {
        System.out.println("registrando en log: " + message);
    }

}
