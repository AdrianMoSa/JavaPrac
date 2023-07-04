Algoritmo sin_titulo
	Escribir "Introdueix l any (DC) de que vols saber l horoscop xines: "
	leer any
	resultat=any%12
	si any<=0
		Entonces
		Escribir "error"
	Sino
	Segun resultat Hacer
			 0:
			animal="mono"
			 1:
			animal="gallo"
			 2:
				 animal="perro"
			 3:
				 animal="cerdo"
		 4:
			animal="rata"
		 5:
			animal="buey"
		 6:
			animal="tigre"
		 7:
			animal="conejo"
		 8:
			animal="dragon"
		 9:
			animal="serpiente"
		10:
			animal="caballo"
		11:
			animal="cabra"
		De Otro Modo:
			
	Fin Segun
	Escribir "El teu horoscop xines corresppn a ",animal
finsi
FinAlgoritmo
