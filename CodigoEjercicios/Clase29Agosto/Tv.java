package com.mycompany.pruebapuente;

public class Tv implements Dispositivo {

    private boolean on;
    private int volumen;
    private int canal;
    
    public Tv()
    {
        this.on=false;
        this.volumen=30;
        this.canal=15;
    }

    @Override
    public void encender() {
        System.out.println(" Tele encendida");
        this.on = true;
    }

    @Override
    public void apagar() {
        this.on = false;
    }

    @Override
    public void setVolumen(int porcentaje) {
        this.volumen=volumen*(porcentaje/100);
    }

    @Override
    public int getVolumen() {
    return this.volumen;
    }

    @Override
    public void setCanal(int canal) {
    this.canal=canal;
    }

    @Override
    public int getCanal() {
        return (int)this.canal;
    }

    @Override
    public void imprimirEstado() {
        System.out.println("Television encendida: "+this.on+"\n Volumen: "+this.volumen+"\n Canal: "+this.canal);
    }
}
