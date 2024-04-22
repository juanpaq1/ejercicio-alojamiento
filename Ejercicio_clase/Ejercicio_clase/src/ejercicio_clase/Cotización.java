/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Usuario
 */
public class Cotización {
    private LocalDate I;
    private LocalDate F;
    private Alojamiento alojamiento;
    private int Dias;
    private double tarifaPorDia;
    private double subtotal;
    private double descuento;
    private double total;

    public Cotización() {
    }

    public Cotización(LocalDate I, LocalDate F, Alojamiento alojamiento) {
        this.I = I;
        this.F = F;
        this.alojamiento = alojamiento;
        this.Dias = this.calcularDias(I, F);
        this.tarifaPorDia = this.alojamiento.calcularPrecioDia();
        this.subtotal = this.tarifaPorDia*this.Dias;
        this.descuento = this.subtotal*this.alojamiento.calcularDes(Dias);
        this.total = this.subtotal-this.descuento;
    }

    public LocalDate getI() {
        return I;
    }

    public void setI(LocalDate I) {
        this.I = I;
    }

    public LocalDate getF() {
        return F;
    }

    public void setF(LocalDate F) {
        this.F = F;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    public double getTarifaPorDia() {
        return tarifaPorDia;
    }

    public void setTarifaPorDia(double tarifaPorDia) {
        this.tarifaPorDia = tarifaPorDia;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public int calcularDias(LocalDate FI, LocalDate FF){
        Period duracion = Period.between(FI, FF);
        return duracion.getDays();
    }

    @Override
    public String toString() {
        return "Cotizaci\u00f3n{" + "\n" +
               "\tI = " + I + "\n" +
               "\tF = " + F + "\n" +
               "\talojamiento = " + alojamiento + "\n" +
               "\tDias = " + Dias + "\n" +
               "\ttarifaPorDia = " + tarifaPorDia + "\n" +
               "\tsubtotal=" + subtotal + "\n" +
               "\tdescuento=" + descuento + "\n" +
               "\ttotal=" + total + '}';
    }
    
    
    
}
