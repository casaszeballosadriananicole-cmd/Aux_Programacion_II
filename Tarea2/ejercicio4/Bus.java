class Bus {

    int capacidad;
    int pasajeros;
    double dinero;

    Bus(int capacidad) {
        this.capacidad = capacidad;
        pasajeros = 0;
        dinero = 0;
    }

    void subirPasajeros(int x) {

        if (pasajeros + x <= capacidad) {
            pasajeros = pasajeros + x;
        } else {
            System.out.println("No hay suficientes asientos");
        }

    }

    void cobrarPasaje() {

        dinero = pasajeros * 1.50;

    }

    int asientosLibres() {

        return capacidad - pasajeros;

    }

    void mostrarDatos() {

        System.out.println("Pasajeros: " + pasajeros);
        System.out.println("Dinero recaudado: " + dinero);
        System.out.println("Asientos libres: " + asientosLibres());

    }

}