import java.util.List;

/**
 * PRODUCTO
 * Es el objeto final que se quiere construir. Es inmutable: todos sus
 * atributos son final y no tiene setters. Su constructor no es público,
 * así que solo el Builder (mismo paquete) puede crearlo.
 */
public class Viaje {
    private final String destino;
    private final int dias;
    private final long costoPorDia;
    private final List<String> extras;

    Viaje(String destino, int dias, long costoPorDia, List<String> extras) {
        this.destino = destino;
        this.dias = dias;
        this.costoPorDia = costoPorDia;
        this.extras = List.copyOf(extras);
    }

    public long getTotal() {
        return dias * costoPorDia;
    }

    @Override
    public String toString() {
        return "Viaje a " + destino + "\n"
                + "Días: " + dias + " | Costo por día: $" + costoPorDia + "\n"
                + "Extras: " + (extras.isEmpty() ? "ninguno" : String.join(", ", extras)) + "\n"
                + "Total: $" + getTotal();
    }
}
