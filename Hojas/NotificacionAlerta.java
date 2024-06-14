package Hojas;

public class NotificacionAlerta implements notificacion {
    @Override
    public void send(String message) {
        System.out.println("notificacion alerta"+ message);
    }
}
