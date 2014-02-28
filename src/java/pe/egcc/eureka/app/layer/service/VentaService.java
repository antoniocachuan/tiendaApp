/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.service;

import java.util.Iterator;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import pe.egcc.eureka.app.domain.Order_details;
import pe.egcc.eureka.app.domain.Orders;
import pe.egcc.eureka.app.layer.dao.espec.OrderDao;

/**
 *
 * @author AntOniO
 */
@Service
@ComponentScan("pe.egcc.eureka.app.layer.dao")
public class VentaService {

    @Autowired
    private OrderDao orderDao;

    public void procesarVenta(Orders order, Map<String, Object> libroCompra, int cantidad) {
        Order_details order_detail = new Order_details();
        order_detail.setPrice((double) libroCompra.get("price"));
        order_detail.setTitle(libroCompra.get("title").toString());
        order_detail.setBook_id((int) libroCompra.get("book_id"));
        order_detail.setQuantity(cantidad);
        order_detail.setOrder_id(2.0);
        order_detail.setAuthor(libroCompra.get("author").toString());
        orderDao.procesarVenta(order, order_detail);
    }
}
