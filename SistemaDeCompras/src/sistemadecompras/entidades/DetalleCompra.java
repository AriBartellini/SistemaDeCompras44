package sistemadecompras.entidades;

public class DetalleCompra {
    private int idDetalle;
    private int cantidad;
    private double precioCosto;
    private Compra compra;
    private Producto producto;
    private int idCompra;
    private int idProducto;

   
    public DetalleCompra() {
    }

    public DetalleCompra(int cantidad, double precioCosto, Compra compra, Producto producto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }

    
    public DetalleCompra(int idDetalle, int cantidad, double precioCosto, int idProducto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idProducto= idProducto;
    }
    
 public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

//    @Override
//    public String toString() {
//        return (compra.getFecha().toString() + producto.getIdProducto() + producto.getNombreProducto() + producto.getPrecio() + compra.getIdCompra());
//    }
            @Override
    public String toString() {
        return ( getIdCompra()+" "+ getIdProducto() +" "+ getCantidad()+" "+ getPrecioCosto());
    }
    
}
