/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.egcc.eureka.app.domain.Order_details;
import pe.egcc.eureka.app.domain.Orders;
import pe.egcc.eureka.app.layer.dao.espec.OrderDao;

/**
 *
 * @author AntOniO
 */
@Repository
public class OrderDaoImpl extends AbstractDao implements OrderDao {

    @Override
    public Orders leerPorCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orders> leerPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Orders obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Orders obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void procesarVenta(Orders order, Order_details order_detail) {
        String sql = "INSERT INTO shop.orders (delivery_name, delivery_address, cc_number) VALUES (?,?,?)";
        Object[] parms = {order.getDelivery_name(), order.getDelivery_address(), order.getCc_number()};
        jdbcTemplate.update(sql, parms);

        sql = "INSERT INTO shop.order_details (book_id, title, author, quantity, price, order_id) VALUES (?,?,?,?,?,?)";
        Object[] parms2 = {order_detail.getBook_id(), order_detail.getTitle(), order_detail.getAuthor(), order_detail.getQuantity(), order_detail.getPrice(), order_detail.getOrder_id()};
        jdbcTemplate.update(sql, parms2);
    }

}
