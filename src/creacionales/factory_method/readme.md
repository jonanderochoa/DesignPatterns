¿Qué es el patrón Factory Method?
El Factory Method es un patrón de diseño creacional que define un método en una clase base o
interfaz para crear objetos, pero deja que las subclases decidan qué clase concreta instanciar. Esto
es útil cuando no sabes de antemano la clase exacta de los objetos que tu código necesita crear.

Propósito
El propósito principal del Factory Method es delegar la responsabilidad de la creación de objetos a
las subclases. De esta manera, el código que utiliza estos objetos no necesita saber qué tipo exacto
de objeto está creando, sino que simplemente utiliza la interfaz o clase abstracta que define el
método de creación.

¿Cuándo usar el Factory Method?
Cuando no sabes de antemano qué tipo de objetos se van a crear.
Cuando quieres que las subclases decidan qué clase concreta instanciar.
Cuando quieres reducir el acoplamiento entre el código que utiliza los objetos y las clases
concretas de estos objetos.

VENTAJAS:
- Desacoplamiento
- Extensibilidad
- Centralizacion de la logica de creacion
- 

¿Porque no usar la interfaz Transporte directamente?
- Alto acoplamiento
- Dificil de extender
- Mantenimiento complicado

Usar la interfaz Transporte directamente puede funcionar en casos simples, pero cuando tu aplicación
crece y necesitas mayor flexibilidad, extensibilidad y un bajo acoplamiento entre las partes del
sistema, el Factory Method se convierte en una solución mucho más robusta y mantenible. Este patrón
te permite encapsular la lógica de creación de objetos, facilitando la adición de nuevos tipos de
productos y la centralización de la lógica asociada a su creación.