class Servidor {

    Jugador jugadores[] = new Jugador[10];
    int cantidad = 0;

    void agregarJugador(String nombre, int diamantes) {

        if (cantidad < 10) {

            jugadores[cantidad] = new Jugador(nombre, diamantes);
            cantidad++;

        } else {

            System.out.println("Servidor lleno");

        }

    }

    void verStacks() {

        for (int i = 0; i < cantidad; i++) {

            int stacks = jugadores[i].diamantes / 64;

            System.out.println(
            jugadores[i].nombre + " tiene " + stacks + " stacks");

        }

    }

    void jugadorMasDiamantes() {

        int mayor = jugadores[0].diamantes;
        String nombre = jugadores[0].nombre;

        for (int i = 1; i < cantidad; i++) {

            if (jugadores[i].diamantes > mayor) {

                mayor = jugadores[i].diamantes;
                nombre = jugadores[i].nombre;

            }

        }

        System.out.println("Jugador con más diamantes: " + nombre);

    }

    void totalDiamantes() {

        int total = 0;

        for (int i = 0; i < cantidad; i++) {

            total = total + jugadores[i].diamantes;

        }

        System.out.println("Total diamantes: " + total);

    }

}