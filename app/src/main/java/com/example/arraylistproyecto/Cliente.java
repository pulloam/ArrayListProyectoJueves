package com.example.arraylistproyecto;

import android.util.Log;

public class Cliente {
    private String rut;
    private String nombre;
    private String correo;
    private int edad;
    private float estatura;

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

    private boolean rutOK(String rut){
        return !rut.isEmpty();
    }


    //region get, set

    public String getRut(){
        return rut;
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
