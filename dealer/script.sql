create schema if not exists concesionario;

use concesionario;

create table vehiculos (
    id_vehiculo int auto_increment primary key,
    marca varchar(40),
    cilindraje int,
    precio double,
    modelo varchar(40)
);

create table vendedores (
    id_vendedor int auto_increment primary key,
    nombre varchar(40),
    cedula varchar(40),
    direccion varchar(40),
    telefono int
);

create table cliente (
    id_cliente int auto_increment primary key,
    nombre varchar(40),
    cedula varchar(40),
    direccion varchar(40),
    telefono int
);

create table vehiculos_usados (
    id_cesion int auto_increment primary key,
    id_cliente int,
    marca varchar(40),
    cilindraje int,
    precio_tasacion double,
    modelo varchar(40),
    fecha date,
    foreign key (id_cliente) references cliente(id_cliente)
);

create table opc_adicionales (
    id_opcion int auto_increment primary key,
    nombre varchar(40),
    descripcion varchar(100),
    precio_opcion double
);

create table ventas (
    id_ventas int auto_increment primary key,
    id_clientes int,
    id_vendedor int,
    id_vehiculo int,
    id_cesion int,
    fecha date,
    precio_venta double,
    foreign key (id_clientes) references cliente(id_cliente),
    foreign key (id_vendedor) references vendedores(id_vendedor),
    foreign key (id_vehiculo) references vehiculos(id_vehiculo),
    foreign key (id_cesion) references vehiculos_usados(id_cesion)
);

create table todas_opciones (
    id int auto_increment primary key,
    id_ventas int,
    id_opcion int,
    foreign key (id_ventas) references ventas(id_ventas),
    foreign key (id_opcion) references opc_adicionales(id_opcion)
);
