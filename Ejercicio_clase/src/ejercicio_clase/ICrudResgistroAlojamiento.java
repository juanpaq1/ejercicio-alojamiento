/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio_clase;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface ICrudResgistroAlojamiento {
    
    public boolean agregarAlojamiento(Alojamiento a);
    Alojamiento buscar(int codigo);
    boolean eliminar(Alojamiento a);
    ArrayList<Alojamiento> obtenerAlojamientos();
    
    
}
