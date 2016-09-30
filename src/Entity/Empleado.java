/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Patty
 */
public class Empleado {
    private static int count = 0;
    private int id;
    private String nombre;
    private int cargoId;
    private double sueldo;
    private double dscto;
    private double bonificacion[];

    public Empleado(String nombre, int cargoId, double sueldo, double dscto, double[] bonificacion) {
        this.id = ++count;
        this.nombre = nombre;
        this.cargoId = cargoId;
        this.sueldo = sueldo;
        this.dscto = dscto;
        this.bonificacion = bonificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDscto() {
        return dscto;
    }

    public void setDscto(double dscto) {
        this.dscto = dscto;
    }

    public double[] getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double[] bonificacion) {
        this.bonificacion = bonificacion;
    }

    
    
    
}
