package com.mycompany.pruebapuente;

public class Radio implements Dispositivo {

    private boolean on;
    private int volumen;
    private int canal;
    
    public Radio()
    {
        this.on=false;
        this.volumen=20;
        this.canal=10;
        
    }

    @Override
    public void encender() {
        this.on = true;
    }

    @Override
    public void apagar() {
        this.on = false;
    }

    @Override
    public void setVolumen(int porcentaje) {
        this.volumen = this.volumen * (porcentaje / 100);
    }

    @Override
    public int getVolumen() {
    return this.volumen;}

    @Override
    public void setCanal(int canal) {
    this.canal=canal;}

    @Override
    public int getCanal() {
    return this.canal;}

    @Override
    public void imprimirEstado() {
        System.out.println("Television Encendida:"+this.on+"\nNivel de volumen: "+this.volumen+"\n Canal actual: "+this.canal+".");
    }
}
