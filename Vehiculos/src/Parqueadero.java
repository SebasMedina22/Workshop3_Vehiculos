public class Parqueadero {
    private Carro[][] espacios;
    private double tarifaPorHora;

    public Parqueadero() {
        espacios = new Carro[5][10]; // Matriz de 5 filas y 10 columnas
        tarifaPorHora = 5.0; // Tarifa por hora fija
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= espacios.length || columna < 0 || columna >= espacios[0].length) {
            return false;  // Fuera de límites de la matriz
        }

        if (espacios[fila][columna] == null) {
            espacios[fila][columna] = carro;
            return true;
        } else {
            return false;  // Espacio ocupado
        }
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return tarifaPorHora * horas;
    }

    public void mostrarEstadoParqueadero() {
        for (int fila = 0; fila < espacios.length; fila++) {
            for (int columna = 0; columna < espacios[0].length; columna++) {
                if (espacios[fila][columna] == null) {
                    System.out.print("-");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}