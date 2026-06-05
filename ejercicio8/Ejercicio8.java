import java.util.Scanner;

class SueldoInvalidoException extends Exception {
    public SueldoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class CargoInvalidoException extends Exception {
    public CargoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class Empleado {
    String nombre;
    String cargo;
    double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo: " + sueldo + " Bs");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        String cargo;

        while (true) {
            try {
                System.out.print("Cargo: ");
                cargo = sc.nextLine();

                if (cargo.matches(".*\\d.*")) {
                    throw new CargoInvalidoException(
                        "El cargo no puede contener números."
                    );
                }
                break;

            } catch (CargoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }

        double sueldo;

        try {
            System.out.print("Sueldo: ");
            sueldo = sc.nextDouble();

            if (sueldo < 2500) {
                throw new SueldoInvalidoException(
                    "El sueldo no puede ser menor a 2500 Bs."
                );
            }

        } catch (SueldoInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("Se asignará automáticamente 2500 Bs.");
            sueldo = 2500;
        }

        Empleado emp = new Empleado(nombre, cargo, sueldo);

        System.out.println("\nDATOS DEL EMPLEADO");
        emp.mostrar();
    }
}