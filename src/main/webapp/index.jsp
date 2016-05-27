<%@ page import="java.util.Date"%>
<%@ page import="org.usco.lcms.Suma"%>
<html>
<body>
<h2>Hello World!</h2>

<%
	/*
	byte dato1 = 125;
	short dato2 = 4654;
	int dato3 = 23000;
	long dato4 = 23764257;
		
	float dato5 = 43.14F;
	double dato6 = 4.56;
	
	char dato7 = 'F';
	
	boolean dato8 = true;
	
	String nombre = "Maria Perdomo";
	Date fecha = new Date("2016/10/09");
	
	out.println("<p>Nombre: " + nombre + "</p>");
	
	if(dato1 > 10){
		out.println("<p>dato 1 mayor </p>");
	}
	
	
	if(dato1 > 10){
		out.println("<p>dato 1 mayor </p>");
	}
	else{
		out.println("<p>dato 1 menor </p>");
	}
	
	// una linea
	///*
	asds
	asd
	aSDSd
	s
	///
	
	if(dato1 > 0 && dato1 <= 10){
		out.println("<p>opcion 1 </p>");
	}
	else if (dato1 > 10 && dato1 <= 50){
		out.println("<p>opcion 2 </p>");
	}
	else{
		out.println("<p>opcion 3 </p>");
	}
	
	dato2 = 7;
	String texto = "";
	switch(dato2){
		case 6:
		case 8:
		case 10: 	texto = "6, 8, 10";
					break;
		case 12:	texto = "doce";
					break;
		case 14:	texto = "catorce";
					break;
		case 16:	texto = "dieciseis";
					break;
		default:	texto = "otros";
	}
	out.println(texto);
	
	
	//ciclos
	for(int i=0; i<20; i=i+1){
		//if(i > 10)
		//	break;
		if(i == 10){
			continue;
		}
		
		out.println("<p>Parrafo " + i + "</p>");		
	}
	
	int k = 0;
	while(k < 10){
		out.println("<p>Parrafo K " + k + "</p>");
		k++;	
	}
	
	int p = 0;
	do{
		out.println("<p>Parrafo p " + p + "</p>");
		p++;	
	}while(p < 10);
	*/
	
	int [] datos = {12, 156, 40};

// 	int [] datos = new int[3];
// 	datos[0] = 12;
// 	datos[1] = 16;
// 	datos[2] = 40;
	
	for(int i=0; i<datos.length; i=i+1){
		out.println("<p>datos[" + i + "] " + datos[i] + "</p>");	
	}
	
	
	Suma suma1 = new Suma();
	double resultado = suma1.getSuma(10, 5);
	out.println("<p>Suma(10,5): " + resultado + "</p>");
	
%>

</body>
</html>
