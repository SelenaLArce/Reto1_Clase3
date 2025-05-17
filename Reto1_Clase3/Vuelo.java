package Reto1_Clase3;

public class Vuelo {
    final String codigoVuelo;   
    String destino;
    String horaSalida;
    Pasajero asientoReservado;   
    
    // Asignar una instancia o null
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Parámetro y valor de 
    public boolean reservarAsiento(Pasajero p) 
    {
        if (asientoReservado == null) 
        {
            asientoReservado = p;
            return true;
        } else 
        {
            return false;
        }
    }

    // Permitir reservación
    public boolean reservarAsiento(String nombre, String pasaporte) 
    {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    // Método sin retorno
    public void cancelarReserva() 
    {
        asientoReservado = null;
    }

    // Método que retorna un String
    public String obtenerItinerario() 
    {
        String info = "Itinerario del vuelo: ";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}