/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.eureka.app.layer.dao.espec;

import java.util.List;
import java.util.Map;
import pe.egcc.eureka.app.domain.Empleado;

/**
 *
 * @author AntOniO
 */
public interface BooksDao extends CrudDao<Empleado>{
    
    List<Map<String, Object>> listarLibros();

    List<Map<String, Object>> listarLibrosLiteratura();
    
    List<Map<String, Object>> listarLibrosInformatica();
    
    List<Map<String, Object>> listarArticulos();
}
