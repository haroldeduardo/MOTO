package m10r.model;
// Generated Jun 27, 2018 9:14:37 PM by Hibernate Tools 4.3.1



/**
 * DetalleCompra generated by hbm2java
 */
public class DetalleCompra  implements java.io.Serializable {


     private Integer idDetalleCompra;
     private int idCompra;
     private int idProducto;
     private float valorCompraProducto;
     private float valorVentaProducto;
     private int unidadesCompradas;

    public DetalleCompra() {
    }

    public DetalleCompra(int idCompra, int idProducto, float valorCompraProducto, float valorVentaProducto, int unidadesCompradas) {
       this.idCompra = idCompra;
       this.idProducto = idProducto;
       this.valorCompraProducto = valorCompraProducto;
       this.valorVentaProducto = valorVentaProducto;
       this.unidadesCompradas = unidadesCompradas;
    }
   
    public Integer getIdDetalleCompra() {
        return this.idDetalleCompra;
    }
    
    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }
    public int getIdCompra() {
        return this.idCompra;
    }
    
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public float getValorCompraProducto() {
        return this.valorCompraProducto;
    }
    
    public void setValorCompraProducto(float valorCompraProducto) {
        this.valorCompraProducto = valorCompraProducto;
    }
    public float getValorVentaProducto() {
        return this.valorVentaProducto;
    }
    
    public void setValorVentaProducto(float valorVentaProducto) {
        this.valorVentaProducto = valorVentaProducto;
    }
    public int getUnidadesCompradas() {
        return this.unidadesCompradas;
    }
    
    public void setUnidadesCompradas(int unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }




}


