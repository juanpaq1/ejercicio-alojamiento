/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class ImpMap implements ICrudResgistroAlojamiento {
    
    private Map<Integer,Alojamiento> mapAlojamiento;

    public ImpMap() {
        this.mapAlojamiento = new HashMap<>();
    }

    public Map<Integer,Alojamiento> getMapAlojamiento() {
        return mapAlojamiento;
    }

    public void setMapAlojamiento(Map<Integer,Alojamiento> mapAlojamiento) {
        this.mapAlojamiento = mapAlojamiento;
    }
    
    
    
    @Override
    public boolean agregarAlojamiento(Alojamiento a) {
        this.mapAlojamiento.put(a.getCodigo(), a);
        return true;
    }

    @Override
    public Alojamiento buscar(int codigo) {
        return this.mapAlojamiento.get(codigo);
    }

    @Override
    public boolean eliminar(Alojamiento a) {
    return this.mapAlojamiento.remove(a.codigo, a);
    }

    @Override
    public ArrayList<Alojamiento> obtenerAlojamientos() {
        return new ArrayList<>(mapAlojamiento.values());
    }    
    
}
