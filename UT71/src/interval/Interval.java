package interval;


class Interval {

    private double inferior;
    private double superior;

    /**
     * Proporciona un interval amb els límits inferior i superior que li donem
     * @param inferior
     * @param superior 
     */
    public Interval(double inferior, double superior) {
       assert inferior<=superior;
       this.inferior=inferior;
       this.superior=superior;
    }

    /**
     * Proporciona un interval amb límit superior que li donem
     * @param superior 
     */
    public Interval(double superior) {
        assert superior<inferior;
      this.superior=superior;
      this.inferior=0;
    }

    /**
     * Proporciona un interval a partir d'un altre (copia)
     * @param interval 
     */
    public Interval(Interval interval) {
        this(interval.inferior,interval.superior);
    }

    /**
     * Proporciona un interval amb límits per defecte.
     */
    public Interval() {
        this.inferior=0;
        this.superior=0;
    }

    /**
     * Clona l'interval
     * @return 
     */
    public Interval clone() {
        return new Interval(this);
    }

    /**
     * Longitud de l'interval
     * @return 
     */
    public double longitud() {
       return this.superior-this.inferior;
    }

    /**
     * Mou els límits de l'interval segons el que indiquem
     * @param moviment 
     */
    public void moure(double moviment) {
       if(moviment>0){
           this.superior+=moviment;
           this.inferior+=moviment;
       }
       else{
           this.superior-=moviment;
           this.inferior-=moviment;
       }
    }

    /**
     * Obtiene l'interval mogut segons el moviment proporcionat
     * @param moviment
     * @return 
     */
    public Interval mogut(double moviment) {
        if(moviment>0){
            return new Interval(this.inferior+moviment,this.superior+moviment);
        }
        else{
            return new Interval (this.inferior-moviment,this.superior-moviment);
        }
    }

    /**
     * Determina si el valor está dintre de l'interval
     * @param valor
     * @return 
     */
    public boolean inclou(double valor) {
        if (valor>this.inferior&&valor<this.inferior){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Determina si l'interval proporcionat está inclòs en l'interval
     * @param interval
     * @return 
     */
    public boolean inclou(Interval interval) {
       if(this.inferior>=interval.inferior&&this.inferior<interval.superior&&this.superior>interval.inferior&&this.superior<interval.superior){
           return true;
       }
       else{
           return false;
       }
    }

    /**
     * Determina si dos intervals són iguals
     * @param interval
     * @return 
     */
    public boolean equals(Interval interval) {
     if(inferior==interval.inferior&&superior==interval.superior){
         return true;
     }
     else{
         return false;
     }
    }

    /**
     * Obté l'interval que intersecta
     * @param interval
     * @return 
     */
    public Interval interseccio(Interval interval) {
        double inferior1;
        double superior1;
        if(this.inferior>=interval.inferior&&this.inferior<=interval.superior){
            inferior1=this.inferior;
        }
        else if(interval.inferior>=this.inferior&&interval.inferior<=this.superior){
            inferior1=interval.inferior;
        }
        else{
            inferior1=0;
        }
        if(this.superior>=interval.inferior&&this.superior<=interval.superior){
            superior1=this.superior;
        }
        else if(interval.superior>=this.inferior&&interval.superior<=this.superior){
            superior1=interval.superior;
        }
        else{
            superior1=0;
        }
        return new Interval(inferior1,superior1);
    }

    /**
     * Determina si un interval intersecta amb el nostre
     * @param interval
     * @return 
     */
    public boolean intersecta(Interval interval) {
        if(this.inferior>=interval.inferior&&this.inferior<=interval.superior||this.superior>=interval.inferior&&this.superior<=interval.superior){
            return true;}
            else if(interval.inferior>=this.inferior&&interval.inferior<=this.superior||interval.superior>=this.inferior&&interval.superior<=this.superior){
                    return true;
                    }
        
        else{
            return false;
        }
    }

    /**
     * Transforma l'interval en el seu oposat.
     */
    public void oposar() {
        
        this.inferior*=-1;
        this.superior*=-1;
    }

    /**
     * Augmenta la grandària de l'interval al doble de la seua longitud (ha de creixer igual pels dos extrems).
     */
    public void doblar() {
       this.inferior=this.inferior*2;
       this.superior=this.superior*2;
    }

    /**
     * Demana a l'usuari que introduïsca els límits de l'interval
     */
    public void recollir() {
      
      GestorIO teclat=new GestorIO();
      teclat.out("Introdueix el valor inferior: ");
      this.inferior=teclat.inDouble();
      teclat.out("Introdueix el valor superior: ");
      this.superior=teclat.inDouble();
      assert inferior<=superior;
    }

    /** Mostra l'interval amb el format [limitInferior, limitSuperior].
     * 
     */
    public void mostrar() {
        GestorIO teclat=new GestorIO();
        teclat.out(this.inferior+", "+this.superior);
        
    }

    /**
     * Obté els subintervals en grandàries iguals segons els trossos proporcionats
     * @param trossos
     * @return 
     */
    public Interval[] trossejar(int trossos) {
        Interval j[]=new Interval[trossos];
        double inferiorTross=this.inferior/trossos;
        double superiorTross=this.superior/trossos;
        for (int i=0;i<trossos;i++){
            j[i]=new Interval(inferiorTross,superiorTross);
        }
        return j;
    }

  

}
