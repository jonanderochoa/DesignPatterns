# BUILDER

Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso.
El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo
código de construcción.

Supongamos que estamos desarrollando un juego de plataformas donde cada nivel tiene una
configuración particular, como la dificultad, la cantidad de enemigos, el tipo de terreno, y la
música de fondo. Utilizaremos el patrón Builder para permitir la creación flexible de niveles, de
manera que se puedan combinar diferentes elementos para generar distintos tipos de niveles.

# CUANDO USARLO

Utiliza el patrón Builder para evitar un “constructor telescópico”.

class Pizza {
Pizza(int size) { ... }
Pizza(int size, boolean cheese) { ... }
Pizza(int size, boolean cheese, boolean pepperoni) { ... }
// ...

El patrón Builder permite construir objetos paso a paso, utilizando tan solo aquellos pasos que
realmente necesitamos. Una vez implementado el patrón, ya no hará falta apiñar decenas de parámetros
dentro de los constructores.

Utiliza el patrón Builder cuando quieras que el código sea capaz de crear distintas representaciones
de ciertos productos (por ejemplo, casas de piedra y madera).

Utiliza el patrón Builder para construir árboles con el patrón Composite u otros objetos complejos.

# Ventajas del uso del patrón Builder en este contexto

- Flexibilidad: Puedes construir niveles personalizados con diferentes combinaciones de atributos
  sin
  tener que preocuparte por la complejidad del constructor. Ademas si un nivel no tiene musica no
  hay que poner null

- Claridad y Mantenibilidad: El código del cliente es más claro porque no necesitas pasar todos los
  parámetros al constructor de una sola vez. En su lugar, puedes configurar solo los atributos que
  te interesan, lo que hace que el código sea más fácil de mantener.

- Inmutabilidad: Una vez que se construye un nivel, no se puede modificar, lo que evita errores
  relacionados con el estado del objeto.

- Extensibilidad: Si decides agregar nuevos atributos al nivel en el futuro (por ejemplo,
  condiciones climáticas), puedes extender el LevelBuilder sin romper el código existente.