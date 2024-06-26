CREATE TABLE `db_dominio_proyecto`.`empleados` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `primer_nombre` VARCHAR(45) NULL,
  `segundo_nombre` VARCHAR(45) NULL,
  `apellido_paterno` VARCHAR(45) NULL,
  `apellido_materno` VARCHAR(45) NULL,
  `edad` INT NULL,
  `sexo` VARCHAR(45) NULL,
  `fecha_nacimiento` VARCHAR(45) NULL,
  `puesto` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
/* datos prueba */
INSERT INTO empleados (primer_nombre,segundo_nombre,apellido_paterno,apellido_materno,edad,sexo,fecha_nacimiento,puesto) VALUES ("primer","","primero","inicial",41,"masculino","12-12-2012","gerente");
INSERT INTO empleados (primer_nombre,segundo_nombre,apellido_paterno,apellido_materno,edad,sexo,fecha_nacimiento,puesto) VALUES ("secundus","segundo","roman","garmendia",43,"masculino","12-02-2012","empleado");
INSERT INTO empleados (primer_nombre,segundo_nombre,apellido_paterno,apellido_materno,edad,sexo,fecha_nacimiento,puesto) VALUES ("tercius","tercero","aguilar","garmendia",33,"masculino","09-02-2012","empleado");
INSERT INTO empleados (primer_nombre,segundo_nombre,apellido_paterno,apellido_materno,edad,sexo,fecha_nacimiento,puesto) VALUES ("cuartina","cuarta","roman","ma",21,"femenino","12-07-2012","empleado");
INSERT INTO empleados (primer_nombre,segundo_nombre,apellido_paterno,apellido_materno,edad,sexo,fecha_nacimiento,puesto) VALUES ("quintina","","quintana","quinta",53,"femenino","12-02-2012","CEO");
INSERT INTO empleados (primer_nombre,segundo_nombre,apellido_paterno,apellido_materno,edad,sexo,fecha_nacimiento,puesto) VALUES ("sixtina","","sexta","",24,"femenino","12-02-2012","Gerente");
INSERT INTO empleados (primer_nombre,segundo_nombre,apellido_paterno,apellido_materno,edad,sexo,fecha_nacimiento,puesto) VALUES ("seventino","septimo","septenio","",35,"masculino","08-14-2012","empleado");

SELECT * FROM empleados;