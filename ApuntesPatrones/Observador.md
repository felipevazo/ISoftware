# Compuesto de:
- Interfaces : Observador, Sujeto Observable
  - Observador: Metodo update, es decir, que hacer cuando se le avisa lo que esta observando (motor -> Acelerar)
  - SujetoObservable : Metodo notificar, es decir, avisar al observador que ocurrió lo que el quería que ocurriese.
- Si implementa interfaz sujetoObservable, debe contener arraylist de Observadores(Agregacion)
Main llama observable y agrega observadorees :3

# Ejemplo Motor-Acelerador
- Motor Observador
- Acelerador Observable
- Observable debe tener arreglo de observadores (motores en este caso especifico)
- Acelerador activa notificar cuando tenga que hacerlo (metodo apretarAcelerador llamaría al notificar)
- Metodo notificar llamaría a metodo update de los observadores
  
