## Pasosy expliaciones:
Método Estático: DriverManager.getConnection(url, user, password) es una llamada a un método estático. **Un método estático pertenece a la clase, no a una instancia de la clase, por lo que no necesitas crear una instancia de DriverManager para llamarlo.** ya que contiene el Static 
Retorno de un Objeto: El método getConnection de DriverManager devuelve un objeto de tipo Connection. Este objeto representa una conexión establecida a la base de datos.

Asignación: **El objeto Connection devuelto por getConnection se asigna a la variable connection**.

- public: La clase puede ser instanciada desde cualquier paquete.
- protected: La clase puede ser instanciada desde el mismo paquete y por subclases en otros paquetes.
- Sin modificador (package-private): La clase solo puede ser instanciada desde el mismo paquete.
- private: La clase no puede ser instanciada desde fuera de la misma clase

 ## **METODO EXECUTE**
 - booleanexecute(Stringsql): ejecuta cualquier tipo de SQL. Si es una consulta se debe recuperar el resultado mediante el método **(ResultSet getResultSet())**; 

