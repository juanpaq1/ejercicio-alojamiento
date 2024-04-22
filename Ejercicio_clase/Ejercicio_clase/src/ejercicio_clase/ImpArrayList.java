/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ImpArrayList implements ICrudResgistroAlojamiento {
    
    private ArrayList<Alojamiento> listAlojamiento;

    
    public ImpArrayList() {
    this.listAlojamiento = new ArrayList();
    }
    
    public ArrayList<Alojamiento> getListAlojamiento() {
        return listAlojamiento;
    }
    
    
    public void setListAlojamiento(ArrayList<Alojamiento> listAlojamiento) {
        this.listAlojamiento = listAlojamiento;
    }
    
    @Override
    public boolean agregarAlojamiento(Alojamiento a){
        return this.listAlojamiento.add(a);
    }
    
    @Override
    public Alojamiento buscar(int codigo){
        for(Alojamiento a: this.listAlojamiento){
            if(a.getCodigo()==codigo){
                return a;
            }
        }
        return null;
    }
    
    @Override
    public boolean eliminar(Alojamiento a){
        return this.listAlojamiento.remove(a);
    }
    
    @Override
    public ArrayList<Alojamiento> obtenerAlojamientos(){
        return this.listAlojamiento;
    }
    

    
}
