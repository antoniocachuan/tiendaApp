/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.controller;

import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pe.egcc.eureka.app.domain.Orders;
import pe.egcc.eureka.app.layer.service.VentaService;

/**
 *
 * @author AntOniO
 */
@Component()
@ManagedBean
@RequestScoped
@ComponentScan("pe.egcc.eureka.app.layer.service")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    private int cantidad;

    private Orders orders;

    private Map<String, Object> libroCompra;

    @PostConstruct
    public void init() {
        cantidad = 1;
    }

    public Map<String, Object> getLibroCompra() {
        return libroCompra;
    }

    public void setLibroCompra(Map<String, Object> libroCompra) {
        this.libroCompra = libroCompra;
    }

    public Orders getOrders() {
        if (orders == null) {
            orders = new Orders();
        }
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public VentaController() {

    }

    public String procesarVenta() {
        String destino;
        destino = "boletaVenta";
        ventaService.procesarVenta(orders, libroCompra, cantidad);
        return destino;
    }

    public String registroVenta() {
        String destino;
        destino = "paginaVenta";
        return destino;
    }
}
