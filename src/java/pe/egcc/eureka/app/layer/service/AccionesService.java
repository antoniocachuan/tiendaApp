/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import pe.egcc.eureka.app.layer.dao.espec.BooksDao;

/**
 *
 * @author AntOniO
 */
@Service
@ComponentScan("pe.egcc.eureka.app.layer.dao")
public class AccionesService {

    @Autowired
    private BooksDao booksDao;

    public List<Map<String, Object>> listarLibros() {
        return booksDao.listarLibros();
    }
    
    public List<Map<String, Object>> listarLibrosLiteratura() {
        return booksDao.listarLibrosLiteratura();
    }
    
    public List<Map<String, Object>> listarLibrosInformatica() {
        return booksDao.listarLibrosInformatica();
    }
    
    public List<Map<String, Object>> listarArticulos() {
        return booksDao.listarArticulos();
    }

}
