# Dependencia en POO
 -Relacion de uso entre 2 entidades
   - Diagrama generico (raya con linea punteada) en orden A usa a B
 
# Asociacion en POO
 -Relacion que permite construir objetos complejos a travès de otros mas simples
   - Ej: Auto Compuesto por motor y neumaticos
 - Linea continua, extremo abierto
    - Flecha apunta de A a B
      - Se lee B es parte de A
 - Relacion entre la parte y el todo
 
 - Dos tipos de relaciones
    - Agregacion
      - Universidad agrupa alumnos, pero puede vivir sin ellos
      - Puedo crear lista de reproduccion sin canciones, no depende de ellas para vivir
      - Rombo apunta al TODO (contenedor)
      - Habitualmente crear arreglo para contener todo
    - Composicion
      - Relacion de vida (El todo no existe sin su parte)
      - No hay manos sin dedos (FUNCIONALMENTE)
      - ROMBO NEGRO HACIA EL TODO
      - SI NO HAY RANGO, SOLO VALOR FIJO (COMPOSICION)
      
 - Multiplicidad
    - 1,0..1,N..M,*,0..*,1..*
    
# Herencia
   - Triangulo cerrado, no pintado
   - Se identifica con (es-un)
