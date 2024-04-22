
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase;

import java.time.LocalDate;

/**
 *
 * @author ESTUDIANTE
 */
public class Habitación extends Alojamiento {

    private int npersonas;
    private static final double PRECIO_PERSONA = 25000;
    private static final double DESCUENTO_PERSONA = 0.05;
    private static final double DESCUENTO_POR_DIAS = 0.03;
    private static final double LIMITE_DIAS_DESCUENTO = 3;

    public Habitación() {
    }

    public Habitación(int npersonas, int codigo, String direccion, String ciudad, String pais) {
        super(codigo, direccion, ciudad, pais);
        this.npersonas = npersonas;
    }

    public int getNpersonas() {
        return npersonas;
    }

    public void setNpersonas(int npersonas) {
        this.npersonas = npersonas;
    }

    @Override
    public double calcularPrecioDia() {
        return Habitación.PRECIO_PERSONA * this.npersonas;
    }

    @Override
    public double calcularDes(int Dias){
        double pDes = (this.npersonas-1) * Habitación.DESCUENTO_PERSONA;
        if(Dias>Habitación.LIMITE_DIAS_DESCUENTO)
            pDes += Habitación.DESCUENTO_POR_DIAS;
        return pDes;
    }
    
    @Override
    public String toString() {
        return "Habitaciones"+
                super.toString() + "\n" +
                "\tnpersonas=" + npersonas ;
    }
    
    
}

