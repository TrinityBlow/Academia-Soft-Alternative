
/****** Object:  Table [dbo].[Plan]    Script Date: 03/03/2016 17:02:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Plan](
	[ID_PLAN] [int] NULL,
	[DESCRIPCION] [varchar](20) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Practicas]    Script Date: 03/03/2016 17:02:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Practicas](
	[Codigo] [float] NULL,
	[Practica] [nvarchar](255) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Prestadores]    Script Date: 03/03/2016 17:02:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Prestadores](
	[Id_Prestador] [float] NULL,
	[ApellidoYNombre] [nvarchar](255) NULL,
	[Filial] [nvarchar](255) NULL,
	[Especialidad] [nvarchar](255) NULL,
	[Domicilio] [nvarchar](255) NULL,
	[Localidad] [nvarchar](255) NULL,
	[Telefono] [nvarchar](255) NULL
) ON [PRIMARY]

GO
INSERT [dbo].[Plan] ([ID_PLAN], [DESCRIPCION]) VALUES (210, N'PLAN OSDE 210')
GO
INSERT [dbo].[Plan] ([ID_PLAN], [DESCRIPCION]) VALUES (210, N'PLAN OSDE 310')
GO
INSERT [dbo].[Plan] ([ID_PLAN], [DESCRIPCION]) VALUES (210, N'PLAN OSDE 410')
GO
INSERT [dbo].[Plan] ([ID_PLAN], [DESCRIPCION]) VALUES (210, N'PLAN OSDE 510')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (70260, N'MÓD.CIR.CARD.C.EXTRAC. HC ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (70264, N'MÓD.C.CAR.S/C.EXTRACOR.HC.')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (70265, N'MÓD.C.CARD.S/C.EXTRACO.HI.')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (70266, N'MOD.ANGIOPL.TRANS.CORON.HC')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (70267, N'MOD.ATC H.I.(ADULTOS)     ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (70270, N'MOD.ATC PERIFERICA        ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (70261, N'MÓD.C.CARD.C/C.EXTRAC. HI ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (130173, N'ESCAR QUIROF B/ANEST.INTER')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (130174, N'ESCARECT B/ANESTESIA      ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (910104, N'SET MONIT.PRESION INTRACRA')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (910304, N'OTRAS PROT.IMPL.OTORRINOLG')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (910714, N'PROT.VASCULAR CORONARIA.  ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (910803, N'PROTESIS BILIAR.          ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (912730, N'PROT.VASC.DACRON KNITTED B')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (930109, N'AUDIFONOS INTRACANALES.   ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (910311, N'ESTRIBO ARTIFICIAL.       ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911233, N'SET DE PLACAS Y TORNILLOS ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911239, N'TAPONES FEMORALES.        ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911247, N'CLAVO ENDOMEDULAR P/TIBIA ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911249, N'ARPONES DE TITANIO IMPORT.')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911250, N'ENDOBOTONES IMPORTADOS.   ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911253, N'PROT.DE HOMBRO IMPORTADA  ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911254, N'ENDOPR.NO CONV.CADER/RODIL')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (922506, N'HEPTODINE 100MG X 28 COMPR')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (922507, N'CEREDASE 600 UI.          ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (930502, N'KIT HAEMONETICS NRO.603   ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (930602, N'CAT.DOBLE J.              ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (930603, N'CATETER SUBCLAVIO P/HEMOD.')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (930604, N'PORTAL CATET.P/QUIMIOT.   ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (930606, N'INFUSOR TRAVENOL P/QUIMIOT')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (910701, N'PROT.VASCULARES IMPORTADAS')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (990211, N'BOMBA DE INSULINA PROGRAM.')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911281, N'MARCO P/FIJAC.DE COLUMNA. ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (922017, N'IPAQUE                    ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (320160, N'COMPLEJ.PEDIATRICA 1.     ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (320161, N'COMPLEJIDAD PEDIATRICA 2. ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (320162, N'COMPLEJIDAD PEDIATRICA 3. ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (130169, N'ESCAR SACRA/TROCANT EN DOM')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (130170, N'ESCAR/TROCAN/OTRA REG.DOM ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (130172, N'MOD CURAC DIARIA ESCAR/DOM')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (170102, N'ELECTROCARD.A DOMICILIO   ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (270162, N'MOD.HEMODIAL.CRONICA      ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (130163, N'MOD.CIR.ONCOLOG.AMBULAT.  ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (270160, N'D.P.C.A.                  ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (420160, N'CONS.AMB.SEGUIM.HEMOFILIA ')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (420161, N'CONS.AMB.VESTIDA (HEMOFI.)')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (940103, N'REINT.X COBR.INDEB-AMBULAT')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (940104, N'AJUSTE X REFAC-AMBULATORIO')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (70107, N'MANT.CIRC.ASISTIDA EXTERNA')
GO
INSERT [dbo].[Practicas] ([Codigo], [Practica]) VALUES (911279, N'SET AUTOINJER.OSTEOCONDRAL')
GO

