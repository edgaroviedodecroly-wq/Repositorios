import java.util.Objects;

public class Producto {
    private String nombre;
    private double precio;
    private String color;
    private String talla;


    public Producto(String nombre, double precio, String color, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto ");
        sb.append("nombre= ").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", color='").append(color).append('\'');
        sb.append(", talla='").append(talla).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(precio, producto.precio) == 0 && Objects.equals(nombre, producto.nombre) && Objects.equals(color, producto.color) && Objects.equals(talla, producto.talla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, color, talla);
    }
}


