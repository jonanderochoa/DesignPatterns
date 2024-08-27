El patrón Abstract Factory es una extensión del patrón Factory Method y se utiliza
cuando necesitas crear familias de objetos relacionados o dependientes entre sí sin especificar sus
clases concretas. En un contexto de videojuegos, este patrón es útil cuando tienes varios tipos de
objetos que pertenecen a la misma familia o tema, como enemigos, armas, y escenarios que deben
coincidir entre sí.

Ventajas de usar Abstract Factory en este contexto
Familias de Productos Relacionados: El patrón Abstract Factory es ideal para crear familias de
objetos relacionados entre sí, como unidades, estructuras y recursos que pertenecen a un mismo tema
o facción.

- Consistencia en el Juego: Asegura que los objetos creados pertenezcan a la misma temática, evitando
mezclas no deseadas (por ejemplo, creando un Caballero medieval con una Base Militar futurista).

- Extensibilidad: Puedes agregar nuevos temas o facciones al juego simplemente creando nuevas fábricas
concretas y sus correspondientes implementaciones de productos, sin tener que modificar el código
del cliente.

- Desacoplamiento: El código del juego (Game) no necesita conocer las clases concretas que está
utilizando. Solo trabaja con las interfaces definidas por la Abstract Factory, lo que reduce el
acoplamiento y facilita el mantenimiento y la evolución del código.

Este patrón es muy útil en videojuegos cuando tienes que gestionar múltiples objetos que pertenecen
a un mismo "ecosistema" o tema, garantizando que todo el contenido generado es coherente y mantiene
una estética o funcionalidad común.