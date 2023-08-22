public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("XYZ456", "Honda", "Civic");
        Carro carro3 = new Carro("DEF789", "Ford", "Focus");

        boolean parqueoExitoso = parqueadero.parquearCarro(carro1, 2, 4);
        System.out.println("Parqueo exitoso: " + parqueoExitoso);

        parqueoExitoso = parqueadero.parquearCarro(carro2, 3, 7);
        System.out.println("Parqueo exitoso: " + parqueoExitoso);

        parqueoExitoso = parqueadero.parquearCarro(carro3, 2, 4);  // Intentar en espacio ocupado
        System.out.println("Parqueo exitoso: " + parqueoExitoso);

        double costo = parqueadero.cobrarPorTiempo(carro2, 3);
        System.out.println("Costo de estacionamiento: " + costo);

        System.out.println("Estado actual del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
    }
}