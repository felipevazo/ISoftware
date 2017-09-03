#Compuesto de:
- Interfaces : Observador, Sujeto Observable
  - Observador: Metodo update, es decir, que hacer cuando se le avisa lo que esta observando (motor -> Acelerar)
  - SujetoObservable : Metodo notificar, es decir, avisar al observador que ocurrió lo que el quería que ocurriese.
- Si implementa interfaz sujetoObservable, debe contener arraylist de Observadores(Agregacion)
Main llama observable y agrega observadorees :3
