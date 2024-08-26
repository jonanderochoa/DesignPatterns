package creacionales.singleton;

/*
SINGLETON

Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga
una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.

El patrón Singleton resuelve dos problemas al mismo tiempo, vulnerando el Principio de
responsabilidad única:

Garantizar que una clase tenga una única instancia. ¿Por qué querría alguien controlar cuántas
instancias tiene una clase? El motivo más habitual es controlar el acceso a algún recurso
compartido, por ejemplo, una base de datos o un archivo.

Funciona así: imagina que has creado un objeto y al cabo de un tiempo decides crear otro nuevo.
En lugar de recibir un objeto nuevo, obtendrás el que ya habías creado.

Ten en cuenta que este comportamiento es imposible de implementar con un constructor normal, ya
que una llamada al constructor siempre debe devolver un nuevo objeto por diseño.

EJEMPLOS DE USO:

- Configuración de la aplicación (AppConfig)
- Logger (Registro de eventos)
- Conexión a base de datos (DatabaseConnection)
- Caché de datos (DataCache)
- Pool de conexiones (ConnectionPool)
- Gestor de recursos compartidos (ResourceManager)
- Controlador de impresoras (PrinterController)
- Gestor de hilos (ThreadManager)
- Gestor de configuraciones (ConfigurationManager)
- Controlador de notificaciones (NotificationManager)
...

 */
public class SingletonMain {

  public static void main(String[] args) {

    // Creamos una instancia de la conexion
    ConnectionDB connectionDB = ConnectionDB.getInstance();
    System.out.println(connectionDB);

    // Si volvemos a ejecutar el metodo recuperariamos la instancia anterior
    connectionDB = ConnectionDB.getInstance();
    System.out.println(connectionDB);
  }
}