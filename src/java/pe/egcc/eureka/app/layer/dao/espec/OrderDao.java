/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.eureka.app.layer.dao.espec;

import java.util.Map;
import pe.egcc.eureka.app.domain.Order_details;
import pe.egcc.eureka.app.domain.Orders;



/**
 *
 * @author AntOniO
 */
public interface OrderDao extends CrudDao<Orders>{
    void procesarVenta(Orders order, Order_details order_detail);
}
