# examenBackend

Pasos para levantar el Proyecto:

1) Clonar el proyecto: git clone https://github.com/maxiPompilio/examenBackend/blob/master/README.md
2) Abrir el proyecto con un IDE Jave (Recomendado Intellij)
3) Tener instalado SQL Server (Creando database con password root)
4) Utilizar un administrador de bases de datos (Recomendado DBeaver)
5) Conectarse mediante:
   1) host: localhost
   2) port: 1433
   3) Database/Schema: master
   4) SQL Server Authentication
   5) username: sa
   6) Password: root
6) Dirijirse a la carpeta src/main/resources/sqlScript 
7) Abrir el script Carga Inicial Datos.ql con en DBeaver
8) Ejecutar en orden todas las query
9) En el proyecto dirijirse a la clase ExamenBackkendApplication, click derecho Run ExamenBackendApplication.main()
10) El proyecto ya se encuentra levantado para utilizar los endpoind mediante postman