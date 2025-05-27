public class Main {
    public static void main(String[] args) {
        // Instanciar objetos
        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 34, 700, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Pep", "Guardiola", 50, "FED123");
        Masajista masajista = new Masajista(3, "Juan", "Perez", 40, "Fisioterapia", 10);

        // Probar métodos heredados y específicos
        futbolista.concentrarse();  // Método heredado
        futbolista.jugarPartido();  // Método específico

        entrenador.viajar();        // Método heredado
        entrenador.dirigirPartido();// Método específico

        masajista.concentrarse();   // Método heredado
        masajista.darMasaje();      // Método específico
    }
}