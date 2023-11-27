public class Ventas {

    private Producto producto;
    private int cantidad_unidades;
    private float precio_venta;
    private float precio_coste;
    private String nombre_vendedor;
    private float beneficio_venta;
    public float subtotalBeneficio;

    public Ventas(Producto producto,
                  int cantidad_unidades,
                  float precio_venta,
                  float precio_coste,
                  String nombre_vendedor
    ) {
        this.producto = producto;
        this.cantidad_unidades = cantidad_unidades;
        this.precio_venta = precio_venta;
        this.precio_coste = precio_coste;
        this.nombre_vendedor = nombre_vendedor;
        this.beneficio_venta = beneficio_unitario() * this.cantidad_unidades;

    }
    public float getBeneficio_venta() {
        return beneficio_venta;
    }
    public void setSubtotal_beneficio(float subtotal_beneficio) {
        this.subtotal_beneficio = subtotal_beneficio;
    }

    public float getSubtotal_beneficio() {
        return subtotal_beneficio;
    }

    private float subtotal_beneficio;

    public float getPrecio_venta() {
        return precio_venta;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public int getCantidad_unidades() {
        return cantidad_unidades;
    }

    public float beneficio_unitario(){
        return this.precio_venta - this.precio_coste;
    }


    @Override
    public String toString() {
        return  "  producto='" + this.nombreProducto + '\'' +
                ", unidades=" + this.cantidad_unidades +
                ", precio venta=" + this.precio_venta +
                ", precio coste=" + this.precio_coste +
                ", vendedor='" + this.nombre_vendedor + '\'' +
                ", beneficio venta= " + this.beneficio_venta +
                '}';
    }





}
