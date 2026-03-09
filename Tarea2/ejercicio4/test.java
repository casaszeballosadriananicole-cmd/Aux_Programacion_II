public class PrincipalBus {

    public static void main(String[] args) {

        Bus b = new Bus(20);

        b.subirPasajeros(8);
        b.cobrarPasaje();
        b.mostrarDatos();

    }

}