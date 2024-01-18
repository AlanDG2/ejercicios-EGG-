DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);



select nombre from producto;
select nombre, precio from producto;
select* from producto;
select nombre, round(precio) as precio from producto;
SELECT  f.codigo FROM fabricante f INNER JOIN producto p ON f.codigo = p.codigo_fabricante ;
SELECT DISTINCT f.codigo FROM fabricante f INNER JOIN producto p ON f.codigo = p.codigo_fabricante;
SELECT  f.codigo FROM fabricante f INNER JOIN producto p ON f.codigo = p.codigo_fabricante GROUP BY f.codigo;
select nombre from fabricante  order by nombre asc ;
select nombre,precio from producto order by nombre asc, precio desc;
select* from fabricante limit 5;
select nombre,precio from producto order by precio asc limit 1;
select nombre,precio from producto order by precio desc limit 1;
select nombre,precio from producto where precio<=120;
select* from producto where precio between 60 and 200;
select* from producto where codigo_fabricante in (1,3,5);
select nombre from producto where nombre like '%portatil%';
select p.codigo, p.nombre,p.codigo_fabricante, f.nombre from producto p inner join fabricante f on p.codigo_fabricante= f.codigo;
select p.nombre,p.precio,f.nombre from producto p  inner join fabricante f on p.codigo_fabricante= f.codigo;
select p.nombre,p.precio,f.nombre from producto p  inner join fabricante f on p.codigo_fabricante= f.codigo order by p.precio limit 1;
select * from producto p  inner join fabricante f  on p.codigo_fabricante= f.codigo  where f.nombre ='Lenovo' ;
select * from producto p  inner join fabricante f  on p.codigo_fabricante= f.codigo  where f.nombre ='Crucial' and p.precio > 200 ;
select * from producto p  inner join fabricante f  on p.codigo_fabricante= f.codigo  where f.nombre in ('Asus','Hewlett-Packard');
select p.nombre,p.precio,f.nombre from producto p  inner join fabricante f on p.codigo_fabricante= f.codigo order by p.precio limit 1;
select p.nombre,p.precio,f.nombre from producto p  inner join fabricante f on p.codigo_fabricante= f.codigo where p.precio >= 180 order by p.precio desc, p.nombre asc;
select* from producto where codigo_fabricante in (select codigo from fabricante where nombre ='Lenovo');
select * from producto where precio =(select max(precio) from fabricante where nombre ='Lenovo') ;
select nombre from producto where precio=(select max(precio) from producto where codigo_fabricante = (select codigo from fabricante where nombre='Lenovo'));
select * from producto where codigo_fabricante in (select codigo from  fabricante  where nombre ='Asus' and precio > (select avg(precio)from producto where codigo_fabricante = (select codigo from fabricante where nombre = 'Asus')) );
select nombre from  fabricante where codigo in (select codigo_fabricante from producto);
select nombre from  fabricante where codigo not in (select codigo_fabricante from producto);
select nombre from fabricante where ( select count(*) from producto where codigo_fabricante = (select codigo from fabricante where nombre='Lenovo')) ;
select f.nombre from fabricante f  inner join producto p  on p.codigo_fabricante= f.codigo group by f.nombre  having count(p.codigo)=(select codigo from fabricante where nombre='Lenovo') ;


select* from  producto;
-- Lista el nombre de todos los productos que hay en la tabla producto.
     select nombre from producto;
--  "select nombre from producto;
-- Lista los nombres y los precios de todos los productos de la tabla producto.
select nombre,precio from producto;
-- c) Listar aquellos productos que su precio esté entre 120 y 202.
select * from producto where precio between  120 and 202;
-- d) Buscar y listar todos los Portátiles de la tabla producto.
select nombre from producto where nombre  like '%portatil%';
-- e) Listar el nombre y el precio del producto más barato.
select nombre, precio  from producto order by precio asc limit 1 ;
select nombre, precio  from producto where precio =(select min(precio) from producto) ;
select nombre, precio  from producto where precio  <= all (select min(precio) from producto) ;
--  Ingresar un producto a la base de datos.
-- "INSERT INTO producto (nombre,precio,codigo_fabricante) VALUES('" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "' );";
 INSERT INTO producto (nombre,precio,codigo_fabricante) VALUES ("alan", 30000,4);
select * from producto where nombre= "alan";
delete from producto where nombre ="alan";
-- Ingresar un fabricante a la base de datos
 -- "INSERT INTO fabricante (nombre) VALUES('" + fabricante.getNombre()+ "' );";
-- Editar un producto con datos a elección.
-- "UPDATE  producto SET precio = "+ producto.getPrecio() + " WHERE codigo = " + producto.getCodigo()+";";
 update  producto set precio = 5000 where codigo = 13;
 select *from fabricante;
 delete from  fabricante where codigo=10;
 
 

