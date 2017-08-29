package com.mycompany.pruebapuente;

public class ControlRemoto {

    /**
     *
     */
    public Dispositivo dispositivo;
    
        

	public void subirCanal() {
            this.dispositivo.setCanal(this.dispositivo.getCanal()+1);
	}

	public void bajarCanal() {
            this.dispositivo.setCanal(this.dispositivo.getCanal()-1);
	}

	public void subirVolumen() {
            this.dispositivo.setVolumen(this.dispositivo.getVolumen()+1);
	}

	public void bajarVolumen() {
            this.dispositivo.setVolumen(this.dispositivo.getVolumen()-1);
	}

	public void power() {
            this.dispositivo.encender();
        }

	public ControlRemoto(Dispositivo dispositivo) {
            this.dispositivo=dispositivo;
	}
        
}