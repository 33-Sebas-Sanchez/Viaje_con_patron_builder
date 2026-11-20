/**
 * BUILDER (interfaz)
 * Define los pasos para construir un Viaje, pero no dice cómo se hacen.
 * Cada método devuelve ViajeBuilder para poder encadenar las llamadas.
 */
public interface ViajeBuilder {
    ViajeBuilder destino(String destino);
    ViajeBuilder dias(int dias);
    ViajeBuilder costoPorDia(long costo);
    ViajeBuilder extra(String extra);

    Viaje build();
}
