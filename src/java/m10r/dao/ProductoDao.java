
package m10r.dao;

import java.util.List;
import m10r.model.Producto;
import org.hibernate.Session;

/**
 *
 * @author CSR
 */
public interface ProductoDao {
    
    public List<Producto> mostrarProductos();
    public void ingresarProducto(Producto producto); 
    public void actualizarProducto(Producto producto);
    public void eliminarProducto(Producto producto);
    
    public Producto obtenerProductoPorId(Session sessionProductoPorId, Integer idProducto) throws Exception;
    
    public Producto obtenerProductoPorCodigo(Session sessionProductoPorCodigo, String codigoProducto) throws Exception;
            
}
