USE agencia;

SELECT * FROM Usuario;
SELECT * FROM Productos;

INSERT INTO Usuario
VALUES (null, "Administrador", "Nadia", "nadia.best.dreams@gmail.com", "3216549870", "Mjkluio7$$" );

INSERT INTO USUARIO
VALUES(null,"ADMINITRADOR", "EDGAR", "EDGAR@GAMIAL.COM", "5534678767","EDARCOOL"),
(null,"USUARIO", "MARIA", "MARIA23@GAMIAL.COM", "5534567890","EDARCOOL"),
(null,"ADMINITRADOR", "SUSANA", "SUSANHEMOSITA@GAMIAL.COM", "5527659841","EDARCOOL"),
(null,"USUARIO", "CAPRI", "CAPRITORETO@GAMIAL.COM", "9087654567","EDARCOOL");

INSERT INTO Productos
VALUES (null, "Gran Tour de Europa", "https://res.cloudinary.com/dte9mtmma/image/upload/v1755824177/grantoureuropa_ounwxj.jpg", 1999, "Londres, París, Luxemburgo", "19", "17", "-Boleto de avión México – Londres / Madrid – México volando en clase turista con AEROMÉXICO, algunas salidas son con Iberia Vía Madrid.
- 17 Noches de alojamiento en categoría indicada .
- Desayunos de acuerdo con itinerario.
- Visitas según itinerario.
- Guía profesional de habla hispana.
- Traslados los indicados.
- Transporte en autocar turístico.
- Documentos electrónicos código QR (empresa socialmente responsable con el medio ambiente).", "- Alimentos, gastos de indole personal.
- Ningún servicio no especificado.
- Todas las excursiones que se mencionan como opcionales.
- Impuestos aéreos por persona.
NOTA: 65 EUROS QUE CORRESPONDEN A PROPINAS PARA CHOFERES, TASAS HOTELES Y MUNICIPALES. SE PAGA EN DESTINO");

SELECT * FROM  Cotizacion;

INSERT INTO Cotizacion
VALUES (null, "2025-05-20", 1), 
(null, "2025-06-08", 2),
(null, "2025-07-15", 3),
(null, "2025-08-02", 4),
(null, "2025-08-28", 5);

SELECT * FROM Productos_has_Cotizacion;

INSERT INTO Productos_has_Cotizacion
VALUES (3, 1, null),
(4, 1, null),
(1, 2, null),
(3, 3, null),
(1, 3, null);

