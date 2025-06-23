# img01

![img01](./img01.png)

CREATE TABLE Producto(
    cod_producto PRIMARY_KEY INT NOT NULL AUTOINCREMENT,
    precio INT NOT NULL
)

CREATE TABLE Cliente(
    cod_cliente PRIMARY_KEY INT NOT NULL AUTOINCREMENT,
    nombre VARCHAR(40) NOT NULL,
    calle VARCHAR(40),
    domicilio VARCHAR(40),
    portal INT,
    piso INT
)

CREATE TABLE Empleado(
    numero PRIMARY_KEY INT NOT NULL AUTOINCREMENT,
    nombre VARCHAR (40),
    telefono (FK)
)

CREATE TABLE Departamento(
    cod_depart PRIMARY_KEY INT NOT NULL AUTOINCREMENT,
    nombre VARCHAR(40)
)

# img02

CREATE TABLE Estudiante(
    idEstudiante PRIMARY_KEY INT NOT NULL AUTOINCREMENT,
    nombre VARCHAR(40),
    apellido VARCHAR(40),
    fechaNacimiento DATE
)

CREATE TABLE Asignatura(
    idAsignatura PRIMARY_KEY INT NOT NULL AUTOINCREMENT,
    nombre VARCHAR(40)
)

CREATE TABLE Profesor(
    idProfesor PRIMARY_KEY INT NOT NULL AUTOINCREMENT,
    nombre VARCHAR(40)
)

CREATE TABLE Clase(
    idClase PRIMARY_KEY INT NOT NULL AUTOINCREMENT,
    idProfesor INT,
    idAsignatura INT,
    hora TIME,
    fecha DATE,
    FOREIGN KEY (idProfesor) REFERENCES Profesor(idProfesor),
    FOREIGN KEY (idAsignatura) REFERENCES Asignatura(idAsignatura)
)

# img03
