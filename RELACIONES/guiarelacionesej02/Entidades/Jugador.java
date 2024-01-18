/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesej02.Entidades;

/**
 *
 * @author Usuario
 */
public class Jugador {

    private Integer id;
    private String nombre;
    private Boolean mojado = false;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, Boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(Revolver gun) {
        boolean shot = gun.mojar();
        if (shot) {
            mojado = true;
            shot = true;

        }else{  gun.siguienteChorro();}
            
      
        return shot;
    }

    @Override
    public String toString() {
        String headshot;
        if (mojado) {
           headshot=" ESTA MUERTO ";
        }else{headshot= " te salvaste..... POR AHORA!! ";}
        return  nombre + id  + headshot + '}';
    }
    
 
    

}
