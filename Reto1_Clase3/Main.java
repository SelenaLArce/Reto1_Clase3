package Reto1_Clase3;

public class Principal {
    public static void main(String[] args) {
        // Pasajero
        Pasajero pasajero = new Pasajero("Selena López", "A150520");

        // Vuelo
        Vuelo vuelo = new Vuelo("AB456", "Berlím", "09:30");

        // Asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println ("Reserva realizada con éxito");
        } else {
            System.out.println ("No se pudo realizar la reserva");
        }

        // Itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println ("Cancelando reserva...");
        vuelo.cancelarReserva();

        // Itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Nueva reserva
        vuelo.reservarAsiento("María Arce", "A141263");
        System.out.println(vuelo.obtenerItinerario());
    }
}