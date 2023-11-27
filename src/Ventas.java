public class Ventas {
    private String nombre_producto;
    private int cantidad_unidades;
    private float precio_venta;
    private float precio_coste;
    private String nombre_vendedor;

    public float getBeneficio_venta() {
        return beneficio_venta;
    }

    private float beneficio_venta;

    public Ventas(String nombre_producto, int cantidad_unidades, float precio_venta, float precio_coste, String nombre_vendedor) {
        this.nombre_producto = nombre_producto;
        this.cantidad_unidades = cantidad_unidades;
        this.precio_venta = precio_venta;
        this.precio_coste = precio_coste;
        this.nombre_vendedor = nombre_vendedor;
        this.beneficio_venta = beneficio_unitario() * this.cantidad_unidades;

    }

    public float beneficio_unitario(){
        return this.precio_venta - this.precio_coste;
    }

    @Override
    public String toString() {
        return    "producto='" + nombre_producto + '\'' +
                ", unidades=" + cantidad_unidades +
                ", precio venta=" + precio_venta +
                ", precio coste=" + precio_coste +
                ", vendedor='" + nombre_vendedor + '\'' +
                '}';
    }








    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public int getCantidad_unidades() {
        return cantidad_unidades;
    }



}
