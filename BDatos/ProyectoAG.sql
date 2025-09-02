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
NOTA: 65 EUROS QUE CORRESPONDEN A PROPINAS PARA CHOFERES, TASAS HOTELES Y MUNICIPALES. SE PAGA EN DESTINO"),
(null,"Especial Egipto y Dubái", 
"https://res.cloudinary.com/dte9mtmma/image/upload/v1755824176/egiptoydubai_x1myfh.jpg",
1299,
"El Cairo, Aswan, Kom Ombo, Edfu, Esna, Luxar y Duboi",
"15",
"12",
"-Boleto de avión en viaje redondo México – Dubái – México, en clase turista.
-Vuelos Dubái – El Cairo - Dubái / El Cairo – Aswan / Luxor – El Cairo en clase turista.
- 3 noches de alojamiento en el Cairo
-3 noches de crucero por el Nilo
-1 noche de alojamiento en Luxor
-5 noches de alojamiento en Dubái.
-Régimen alimenticio indicado en el itinerario.
-Traslados indicados.
-Visitas indicadas.
-Guías de habla hispana.
-Autocar con aire acondicionado.",
"-Gastos personales y extras en los hoteles.
-Propinas en Egipto: 60 USD por persona. (Se paga directo en destino)
-Propinas en Dubái: 35 USD por persona. (Se paga directo en destino)
-Impuesto Turismo en Dubái: 5 USD por habitación por noche. (Se paga directo en destino)BookingConclusion
-Impuestos aéreos
-Visa de Egipto: 25 USD aproximadamente (se paga en destino)
-Ningún servicio no especificado como incluido o como opcional.
-Seguro de viaje (Es obligatorio para entrar a los Emiratos árabes Unidos)."),
(null, "Tailandia y Phuket", 
"https://res.cloudinary.com/dte9mtmma/image/upload/v1755824181/tailandia-phukec_saz3lm.jpg", 
1599,
 "Bangkok, Kanchanaburi, Chiang Rai, Chiang Mai, Phuket", 
 "13", "9", 
 "- Boleto de avión en viaje redondo México – Bangkok / Phuket – México en clase turista.
- Boleto de avión Bangkok – Chiang Rai / Chiang Mai – Phuket en clase turista.
- 03 noches de alojamiento en Bangkok.
- 02 noche de alojamiento en Chiang Rai.
- 02 noches de alojamiento en Chiang Mai.
- 02 noches de alojamiento en Phuket.
- Traslados indicados
- Visitas indicadas
- Guías de habla hispana
- Autocar con aire acondicionado.",
 "-Gastos personales y extras en los hoteles.
-Propinas en Tailandia: 50 USD por persona (Se paga directo en destino)
-Ningún servicio no especificado como incluido o especificado como opcional.-Visa de Tailandia-Impuestos aéreos por persona"),
(null,"Tailandia y Phunket EXPRESS","https://res.cloudinary.com/dte9mtmma/image/upload/v1755824174/tailandiaExpress_jmrxsp.jpg",
 999,
 "Bangkok, Ayutthaya, Lopburi, Phitsanuloke, Sukhothai, Chiang Rai, Chiang Mai, Phuket.",
 "11","7",
 "- Boleto de avión en viaje redondo México -Bangkok - México, en clase tusrita.
- Boleto de avión Chiang Mai - Phuket en clase turista.
- Boleto de avión Phuket - Bangkok en clase turista.
- 2 noches de alojamiento en Bangkpk.
- 1 noche de alojamiento en Phitsanuloke.
- 1 noche de alojamiento en Chiang Rai.
- 1 noche de alojamiento en Chiang Mai.
- 2 noches de alojamiento en Phuket.
- Régimen alimenticio indicado en itinerario.
- Autocar con aire acondicionado.",
"- Gastos personales y extras en hoteles, BebidasPropinas para maleteros, camaristas, meseros, etc.
-Propinas en Tailandia: 50 USD por persona (Se paga directo en destino)
-Gastos estras en los hoteles como llamadas telefónicas, lavandería, etc.
-Visa de Tailanda.
-Fee de cámaras en los monumentos.
-Ningún servicio no específicado como incluido o especificado como opcional, Impuestos aéreos"),
(null,"Tailandia y Phuket",
"https://res.cloudinary.com/dte9mtmma/image/upload/v1755824181/tailandia-phukec_saz3lm.jpg",
"1599",
"Bangkok, Kanchanaburi, Chiang Rai, Chiang Mai, Phuket",
"13","9",
"- Boleto de avión en viaje redondo México – Bangkok / Phuket – México en clase turista.
- Boleto de avión Bangkok – Chiang Rai / Chiang Mai – Phuket en clase turista.
- 03 noches de alojamiento en Bangkok.
- 02 noche de alojamiento en Chiang Rai.
- 02 noches de alojamiento en Chiang Mai.
- 02 noches de alojamiento en Phuket.
- Traslados indicados
- Visitas indicadas
- Guías de habla hispana
- Autocar con aire acondicionado.",
"-Gastos personales y extras en los hoteles.
-Propinas en Tailandia: 50 USD por persona (Se paga directo en destino)
-Ningún servicio no especificado como incluido o especificado como opcional.
-Visa de Tailandia
-Impuestos aéreos por persona");


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

