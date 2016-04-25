package sample;

/**
 * Created by Usuario on 25/04/2016.
 */
public class nota2 {
    String nombre2 = "oscar";
    String descripcion2 = "puto amorl";

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    @Override
    public String toString() {
        return "nota{" +
                "nombre2='" + nombre2 + '\'' +
                ", descripcion2='" + descripcion2 + '\'' +
                '}';
    }
}
