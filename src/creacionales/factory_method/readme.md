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