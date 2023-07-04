Algoritmo sin_titulo
	Escribir "Introdueix preu en ? "
	leer preu
	si preu >= 100 Entonces
		preu= preu*0.9
	FinSi
	
	si preu <30 Entonces
		preu=preu+2
	FinSi
	Escribir "El preu final es " ,preu
FinAlgoritmo
