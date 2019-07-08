CREATE TABLE SOCIO (
	id	int
				IDENTITY (1,1)
				NOT NULL primary key,
	id_plan int FOREIGN KEY REFERENCES [PLAN](id),
	descripcion nvarchar(1000),
	numeroSocio int,
	nombre nvarchar(40),
	apellido nvarchar(40),
	sexo nvarchar(40),
	estadoCivil nvarchar(40),
	nombreConyuge nvarchar(40),
	cantidadHijos int,
	dni int ,
	telefono int,
	direccion nvarchar(100),
);