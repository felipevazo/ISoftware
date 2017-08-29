package com.mycompany.pruebapuente;

public interface Dispositivo {

	public void encender();

	public void apagar();

	public void setVolumen(int porcentaje);

	public int getVolumen();

	public void setCanal(int canal);

	public int getCanal();

	public void imprimirEstado();
}