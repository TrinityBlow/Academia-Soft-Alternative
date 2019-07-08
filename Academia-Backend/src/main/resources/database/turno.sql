CREATE TABLE TURNO (
	id	int
				IDENTITY (1,1)
				NOT NULL primary key,
	id_socio int FOREIGN KEY REFERENCES SOCIO(id),
	fecha smalldatetime,
	especialidad nvarchar(60),
	prestacion nvarchar(100),
);

