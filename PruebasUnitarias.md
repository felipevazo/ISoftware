# Pruebas Unitarias
  - Se relaciona con una prueeba de una unidad basica  (clase)
  - Verificacion de metodos
  - hay pruebas de cajaBlanca(mecanismos) y cajaNegra(Aspecto Visual, tipo funcional)
  
# De donde surge
  - Surge de framework( Conjunto de clases) desde el libro xUnit
  - Fue creado por Ken Beck y Erich Gamma y posee licencia Open Source!
  - La logica indica que las pruebas deben estar separadas del codigo
# Instalacion, en POM
  - HamcrestCore , manejo de algo de igualdades
  
  
# Flujo de prueba unitaria
  - Anotaciones:
    - Before: Todo lo que se hace justo antes de ejecutar la prueba, (e.g: Instalar los objetos)
    - After: ''   ''    '   ' ' ' ' ' ' despues de ejecutar la prueba (e.g: Reiniciar valores cerrar el archivo, etc)
    
    - Test: identifica el metodo como un metodo de prueba
    - Test(expected=Exception.class): Falla si no da el error esperado
    - Ignore : Ignorar un test, util cuando el codigo de prueba ha sido modificado, uno suele indicar pq ignore la prueba
    
  - Orden: BeforeClass-> Before -> Test-> After -> Before -> Test -> After -> AfterClass
  - SIEMPRE en cada test hay unbefore y un after
  
  
# Al usar
  - Genera: setUp y tearDown, aparte de constructor
  -  SOLO IMPORTA COMENTARIO 
  - Fail fuerza el error
  - assert -> IF comprimido
    - equals(esperado,actual) -> iguales, enteros
    - equals(esperado,actual,delta)-> double, con tolerancia
    - true/false (condicion logica)
    - assetSame(direcciones de memoria/isntancia)(esperado,actual)
    - assertArrayEquals(esperado, actual) -> 2 arreglso iguales
    - TDD -> Partir desde las pruebas unitarias
# Forma Assets (que valor espero, que valor salió)
  - Etiqueta runwith permite hacer funcionar una clase parametrizada
  
# EasyTest

anotacion @Dataloader(ubicacion,tipoDeCargador)

en archivo: Primera columna, nombre de metodo y resto vacio
  - luego orden de datos que necesitemos
  - JasperReports es necesario para generar reportes
  
  
  -assertEquals tira problemas al comprar objetos si no tienes el equals definido
  
  
  
# Flujo de Programa
- Grafos de pasos

# Cyclo, complejidad ciclomatica
- Estructuras
- Que tan mantenible es el programa

- Calculo: Aristas-Nodos+2
- Calculo, forma2: Nodos predicado +1 
  - Nodos predicado: Nodos de desicion
- Calculo, forma3: numero regiones cerradas entre aristas
