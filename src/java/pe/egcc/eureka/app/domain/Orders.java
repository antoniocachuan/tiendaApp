/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.eureka.app.domain;

/**
 *
 * @author AntOniO
 */

public class Orders {
    private double order_id;
    private String delivery_name;
    private String delivery_address;
    private String cc_name;
    private String cc_number;
    private String cc_expiry;

    public Orders() {
    }

    public double getOrder_id() {
        return order_id;
    }

    public void setOrder_id(double order_id) {
        this.order_id = order_id;
    }

    public String getDelivery_name() {
        return delivery_name;
    }

    public void setDelivery_name(String delivery_name) {
        this.delivery_name = delivery_name;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public String getCc_name() {
        return cc_name;
    }

    public void setCc_name(String cc_name) {
        this.cc_name = cc_name;
    }

    public String getCc_number() {
        return cc_number;
    }

    public void setCc_number(String cc_number) {
        this.cc_number = cc_number;
    }

    public String getCc_expiry() {
        return cc_expiry;
    }

    public void setCc_expiry(String cc_expiry) {
        this.cc_expiry = cc_expiry;
    }
}
