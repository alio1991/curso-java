<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="css/estilo.css" />
<title>AULAS</title>
</head>
<body style="background-color: silver;">

<H1>Aula: ${aula1.nombre}</H1><br/>

<p style="color: red;">Alumno: ${alumno1.nombre}</p><br/>
<p style="color: red;">Alumno: ${alumno2.nombre}</p><br/>
<p style="color: red;">Alumno: ${alumno3.nombre}</p><br/>

<br/>
<!--Alumno Extra: ${alumno_extra.nombre}<br/> -->
<H1>Aula: ${aula2.nombre}</H1><br/>
Alumno: ${alumno4.nombre}<br/>
Alumno: ${alumno5.nombre}<br/>

<!--  Singleton: ${mensajeSingleton.nombre} - ${mensajeSingleton.descripcion}<br/>
Prototype: ${mensajePrototype.nombre} - ${mensajePrototype.descripcion}<br/>
Request: ${mensajeRequest.nombre} - ${mensajeRequest.descripcion}<br/>
Session: ${mensajeSession.nombre} - ${mensajeSession.descripcion}<br/>
-->

</body>
</html>