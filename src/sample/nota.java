package sample;

/**
 * Created by Usuario on 25/04/2016.
 */
public class nota {
    String nombre = "oscar";
    String descripcion = "puto amorl";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "nota{" +
                "nombre2='" + nombre + '\'' +
                ", descripcion2='" + descripcion + '\'' +
                '}';
    }
}
