package com.example.arraylistproyecto;

import android.util.Log;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String rut;
    private String nombre;
    private String correo;
    private int edad;
    private float estatura;

    //region  constructores

    public Cliente(String rut,String nombre, int edad){
       this(rut, edad);
       this.nombre = nombre;
    }

    public Cliente(String rut, int edad){
        setEdad(edad);
        if(rutOK(rut)) {
            this.rut = rut;
        }
    }
    public Cliente(String rut){
        if(rutOK(rut)) {
            this.rut = rut;
        }
    }

    //endregion

    private boolean rutOK(String rut){
        return !rut.isEmpty();
    }


    //region get, set

    public String getRut(){
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEdad(int edad){
        //Operadores lógicos And -> &&, Or -> ||, Not -> !
        if(edad > 0 && edad <= 130) {
            this.edad = edad;
        }
    }

    public void setNombre(String nombre) {
       /* if(nombre.length() > 3)
            this.nombre = nombre;
        else
            this.nombre = "";
        */
        this.nombre = nombre.length() > 3 ? nombre : "";

    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    //endregion
}
