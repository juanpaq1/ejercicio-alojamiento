/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase;

/**
 *
 * @author ESTUDIANTE
 */
public class Cabaña extends Alojamiento{

    private int Ncuartos;
    private static final double PRECIO_CUARTO = 50000;
    private static final double DESCUENTO_POR_DIAS = 0.1;
    private static final double DESCUENTO_POR_LIMITE_DIAS = 5;

    public Cabaña() {
    }

    public Cabaña(int Ncuartos, int codigo, String direccion, String ciudad, String pais) {
        super(codigo, direccion, ciudad, pais);
        this.Ncuartos = Ncuartos;
    }

    
    public int getNcuartos() {
        return Ncuartos;
    }

    public void setNcuartos(int Ncuartos) {
        this.Ncuartos = Ncuartos;
    }
    
    
    @Override
    public double calcularPrecioDia() {
      
       return (Cabaña.PRECIO_CUARTO*this.Ncuartos);
       
    }
    
    @Override
    public double calcularDes(int Dias) {
       return (Dias > 5)? Cabaña.DESCUENTO_POR_DIAS: 0;
    }

    @Override
    public String toString() {
        return """
               Cabanhas 
               """+
               "\t" + super.toString()+"\n"+
               "\tNcuartos= " + Ncuartos;
    }

   

    
}
