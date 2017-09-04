Objetivo : SEparar abstraccion e implementacion
# Ventajas 
  - Desacopla interfaz e implementacion
  - Ejemplo: Dibujar figuras de colores
    - Separamos dibujar de color, la abstracción serían las figuras, y la implementación los colores
    
    
# Ejemplo 2
  - Control Remoto y dispositivo a usarse
  - Dispositivo Abstraccion (interface dispositivo, mas clases que implementen, tv , radio)
  - Control remoto padre de controles remotos mas espeficicos, controlRemoto debe recibir un parametro de tipo dispositivo , mas clases que implementen, basico u avanzado)
  - Main instancia control remoto, asignandole un tv 
