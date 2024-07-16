### Descripcion
Este proyecto tiene como finalidad desarrollar una aplicación de foro empleando Spring Boot y JWT (JSON Web Token) para la autenticación. La aplicación permite a los usuarios realizar operaciones como crear, listar, actualizar, eliminar y obtener tópicos por su ID, además de ofrecer una funcionalidad de inicio de sesión.

### Funcionalidades
- Crear Tópicos: Los usuarios pueden agregar nuevos tópicos en el foro proporcionando un título y contenido.
- Listar Tópicos: La aplicación permite a los usuarios visualizar un listado de todos los tópicos creados.
- Obtener Tópico por ID: Los usuarios pueden ver los detalles de un tópico específico proporcionando su ID.
- Actualizar Tópico: Los usuarios pueden modificar un tópico existente proporcionando su ID y la nueva información.
- Borrar Tópico: Los usuarios pueden eliminar un tópico proporcionando su ID.
- Inicio de Sesión: Los usuarios pueden autenticarse proporcionando sus credenciales y recibiendo un token JWT para acceder a las funcionalidades protegidas.

### Tecnologías
- Java: Versión 21.
- Maven: Gestión de dependencias y construcción del proyecto.
- Spring Boot: Framework para desarrollar la aplicación. Versión 3.
- PostgreSQL: Sistema de gestión de bases de datos. Versión 16.
- Flyway: Migraciones de base de datos
- Spring Security: Seguridad y autenticación de usuarios
