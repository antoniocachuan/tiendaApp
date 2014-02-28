/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.stereotype.Component;
import pe.egcc.eureka.app.domain.Movimiento;

/**
 *
 * @author Gustavo Coronel
 */
@Component()
@ManagedBean
@RequestScoped
public class ProcesosController {

	
	private Movimiento movimiento;

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}

	public Movimiento getMovimiento() {
		if(movimiento == null){
			movimiento = new Movimiento();
		}
		return movimiento;
	}
	
	
	
}
