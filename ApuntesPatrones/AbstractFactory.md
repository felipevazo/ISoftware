# Existencia de
  - CLases fabricas
    - Clases fabricas generan productos de cierto tipo
      - Servicios de diseño entregados por fabricas de diseño
      - De software entregados por fabricas de software
 - Partiendo desde la premisa de una intefaz que especifica el metodo que generara el producto abstracto (Servicio informatico en ejemplo es el generico)
 - Generico corresponde a otra interfaz
 
 # Las Factorias concretas implementan interfaz de factoria abstracta
 # Los productos concretos implementan interfaz de producto abstracto
 
 
 # Ejemplo 
  - Programa que cree personajes
  - Personajes de tipo Mago, Guerrero o Orco
  - Factoria abstracta tiene metodo que retorna objetos de tipo personaje
  - personaje interface que representa producto abstracto
  - Factorias concretas fabricarían magos, orcos o guerreros (factoria de cada uno)
