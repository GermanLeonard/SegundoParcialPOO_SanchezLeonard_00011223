package Composite;
import Hojas.notificacion;
import java.util.ArrayList;
import java.util.List;
//implementacion del composite
public class NotificacionCom implements notificacion {
    private List<notificacion> notificaciones = new ArrayList<>();

    public void agregar(notificacion Notificacion) {
        notificaciones.add(Notificacion);
    }

    public void eliminar(notificacion Notificacion) {
        notificaciones.remove(Notificacion);
    }

    @Override
    public void send(String mensaje) {
        for (notificacion Notificacion : notificaciones) {
            Notificacion.send(mensaje);
        }
    }
}
