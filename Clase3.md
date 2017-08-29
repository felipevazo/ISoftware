# Realizacion en POO
- Relacion entre dos entidades
- No familia (INTERFACES)
- Usar interface-> Firmar contrato
 
 - Usar una o la otra
    - Herencia : cosas familias
    - Interface : Utilizacion de metodos 
    
- Caracteristicas de interface
  - No Instanciar
  - PUBLICO
  - para implementar -> triangulo con linea punteada
  
  - Interface i1=new Motor()
     - Permite "disfrazar la clase a travès de la interfaz"
     - Desde afuera no se ve el motor, solo la interface
     - SE DEFINE COMO POLIMORFISMO POR ASIGNACION
     
  - POLIMORFISMO PURO
    - Se da como parametro una interface para un metodo
    - Ahì se puede ocultar cualquiera de los niveles que implementen esta interface
    
    
# Patrones de diseño

- Corresponde a soluciones grales de problemas que se encuentran en desarrollo de software
- Beneficios:
  - Existe documentacion formal (ppt)
  - Proporcionan vocabulario comun en equipo de desarrollo
  - integracion con otros patrones de diseño
  - Reutilizacion
- Aportes
  - PPT
- Categorias
  - Orientado a creacion
  - Manejo de flujo (comportamiento)
    - Observador: Dividir en lo que se hace, es decir:
      - Como represento observadores
      - Como represento lo Observado
        - Okay?
  - Estructurales ( desarmar codigo/ Generar Particiones)
    - Puente: Desacopla abstraccion nde su implementacion, de manera que ambas puedan ser modificadas sin necesidad de alterar el resto
      - Interface funciona mas como "paso" entre 2 cosas
      - Recordar ejemplo clase
      - Valido ejemplo clase para generar documentous
      - Basicamente se trabaja llamando interface (polimorfismo Puro)
      
      
  # NO USAR PATRONCES EXCESIVAMENTE LA PUTA MADRE 
  
