
# 📌 sistema_de_roles
### Sistema de gestión de usuarios con roles - Java + Swing + JPA

## Descripción

Este proyecto implementa un sistema de gestión de usuarios con asignación de roles (por ejemplo, Administrador y Usuario regular). Permite validar credenciales al iniciar sesión, asignar roles a nuevos usuarios y realizar operaciones básicas como creación, edición y eliminación de usuarios.

## Características

- Validación de usuarios por nombre y contraseña.
- Asociación de cada usuario con un rol único.
- Gestión de roles (nombre y descripción).
- Operaciones CRUD para usuarios (crear, leer, actualizar, eliminar).
- Arquitectura modular con separación entre lógica y persistencia.

## Requisitos

- Java SE 8 o superior.
- NetBeans IDE (recomendado para facilitar la gestión del proyecto).
- JPA/Eclipse para la persistencia (se asume conexión a base de datos configurada).
- Librerías estándar de Java EE (`javax.persistence`, etc.).

## Instalación

Clonar el repositorio:

```bash
git clone https://github.com/tu_usuario/sistema-roles.git
```

1. Abrir el proyecto con NetBeans.  
2. Configurar la conexión a base de datos en `persistence.xml`.  
3. Ejecutar el proyecto.

## Uso

1. Iniciar el sistema.  
2. Crear usuarios mediante la clase `Controladora.crearUsuario(...)`.  
3. Validar un login usando `Controladora.validarUsuario(...)`.  
4. Consultar roles y usuarios existentes.  
5. Modificar o eliminar usuarios según sea necesario.

## Contribución

1. Fork del repositorio.  
2. Crear una rama para tus cambios:

```bash
git checkout -b feature/nueva-funcionalidad
```

3. Hacer tus cambios, commitear y crear un Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT.

## Autor(es)

Matías Almeira

