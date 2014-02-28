/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pe.egcc.eureka.app.domain.Books;
import pe.egcc.eureka.app.layer.service.AccionesService;

/**
 *
 * @author AntOniO
 */
@Component()
@ManagedBean
@RequestScoped
@ComponentScan("pe.egcc.eureka.app.layer.service")
public class AccionesController implements Serializable {

    @Autowired
    private AccionesService accionesService;

    private List<Map<String, Object>> lista;
    
    private String tipo;
    
    private Books libroseleccionado;
    
    private Map<String, Object> libroelegido;

    public Map<String, Object> getLibroelegido() {
        return libroelegido;
    }

    public void setLibroelegido(Map<String, Object> libroelegido) {
        this.libroelegido = libroelegido;
    }

    public void setLibroseleccionado(Books libroseleccionado) {
        this.libroseleccionado = libroseleccionado;
    }

    public Books getLibroseleccionado() {
        return libroseleccionado;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Map<String, Object>> getLista() {
        if (lista == null) {
            lista = new ArrayList<Map<String, Object>>();
        }
        return lista;
    }

    public String consultarLibros() {
        String destino;
        lista = accionesService.listarLibros();
        tipo="Todos los Libros";
        destino = "listarLibros";
        return destino;
    }

    public String consultarLibrosLiteratura() {
        String destino;
        tipo="Libros de Literatura";
        lista = accionesService.listarLibrosLiteratura();
        destino = "listarLibros";
        return destino;
    }
    
    public String consultarLibrosInformatica() {
        String destino;
        tipo="Libros de Informática";
        lista = accionesService.listarLibrosInformatica();
        destino = "listarLibros";
        return destino;
    }
    public String consultarArticulos() {
        String destino;
        tipo="Artículos Diversos";
        lista = accionesService.listarArticulos();
        destino = "listarLibros";
        return destino;
    }
    
}
