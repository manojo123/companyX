/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.Empleado;
/**
 *
 * @author Patty
 */
public class ModelEmp {
    public double getDescuento(Empleado e){
        return (e.getSueldo()*e.getDscto());
    }
    public double getBonificacion(Empleado e){
        double sumaBonif = 0;
        for(double i : e.getBonificacion())
          sumaBonif+= i;  
        return (e.getSueldo()*sumaBonif);
    }
    public double getNeto(Empleado e){
        return e.getSueldo()+getBonificacion(e)-getDescuento(e);
    }
}
