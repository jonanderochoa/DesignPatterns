# PROTOTYPE

El patrón Prototype se utiliza para crear nuevos objetos copiando (clonando) instancias
existentes. Esto es útil:

- cuando el costo de crear un nuevo objeto desde cero es alto
- cuando un objeto tiene un número significativo de configuraciones posibles que pueden ser
  reutilizadas.

Ejemplo: Clonación de Enemigos en un Juego de Estrategia
Imagina que estás desarrollando un juego de estrategia donde hay varios tipos de enemigos, cada uno
con diferentes atributos (salud, daño, velocidad, etc.). En lugar de crear cada enemigo desde cero
cada vez que lo necesitas, puedes crear prototipos de enemigos básicos y luego clonarlos para
generar múltiples instancias.

Paso 1: Definir la interfaz Cloneable
Primero, necesitamos asegurarnos de que nuestra clase de enemigo implemente la capacidad de clonarse
a sí misma. Esto se logra usando la interfaz Cloneable y sobreescribiendo el método clone().

Paso 2: Definir la clase Enemy
Definimos una clase Enemy que representa a un enemigo en el juego. Esta clase implementa la interfaz
Cloneable para permitir la clonación.

Paso 4: Ventajas del uso del patrón Prototype en este contexto
- Eficiencia: Clonar un objeto es más rápido y menos costoso en términos de recursos que crear un
nuevo objeto desde cero, especialmente si el objeto es complejo.

- Consistencia: Al clonar un prototipo, garantizas que las instancias creadas sean consistentes con
las configuraciones predefinidas.

- Facilidad de Modificación: Puedes crear una copia de un enemigo y luego modificar atributos
específicos sin afectar el prototipo original.

- Flexibilidad: Es fácil cambiar el comportamiento de los objetos clonados sin necesidad de modificar
la lógica de creación, lo que es útil para manejar variaciones de enemigos en el juego.

Este ejemplo muestra cómo el patrón Prototype se puede usar en videojuegos para manejar la creación
de múltiples instancias de objetos similares de manera eficiente, manteniendo la flexibilidad para
personalizar las copias según sea necesario.