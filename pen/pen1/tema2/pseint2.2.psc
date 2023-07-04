Algoritmo sin_titulo
	Escribir "Introdueix el teu pes (KG): "
	leer pes
	Escribir "Introdueix la teua altura (cm): "
	leer altura
	altura=altura/100
	IMCOxford=1.3*pes/(altura^2.5)
	IMC=pes/(altura^2)
	si IMCOxford <18.5
		Entonces
		resultat="(Manca de pes)"
	FinSi
	si IMCOxford >= 18.5 y IMCOxford <25.0
		Entonces
		resultat="(Normal)"
	FinSi
	si IMCOxford>=25.0 y IMCOxford <30
		Entonces
		resultat="(Sobrepes)"
	FinSi
	si IMCOxford>=30.0
		Entonces
		resultat="(Obés)"
	FinSi
	si IMCOxford-IMC>1 o IMCOxford-Imc<-1
		Entonces
		comparacio="(Descompensado)"
	FinSi
	si altura<=0 o pes<=0
		Entonces
		escribir "error"
	FinSi
	Escribir "el teu IMC(OXFORD2003) es ",IMCOxford," ",resultat,comparacio
FinAlgoritmo
