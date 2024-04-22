/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Alojamiento {

    protected int codigo;
    protected String direccion;
    protected String ciudad;
    protected String pais;

    public Alojamiento() {
    }

    public Alojamiento(int codigo, String direccion, String ciudad, String pais) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    

    public abstract double calcularDes(int Dias);
    public abstract double calcularPrecioDia();

    @Override
    public String toString() {
        return "Alojamiento" + "\n" +
                "\tcodigo=" + codigo + "\n"+
                "\tdireccion=" + direccion + "\n"+
                "\tciudad=" + ciudad + "\n"+
                "\tpais=" + pais + '}';
    }


}
