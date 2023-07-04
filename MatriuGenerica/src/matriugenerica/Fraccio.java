package matriugenerica;

public class Fraccio extends Number {

    private Number num;
    private Number den;

    public Fraccio() {
        this.num = 0;
        this.den = 1;
    }
    
    public Fraccio(Number num, Number den) {
        this.num = num;
        this.den = den;
    }

    public Number getNum() {
        return num;
    }

    public void setNum(Number num) {
        this.num = num;
    }

    public Number getDen() {
        return den;
    }

    public void setDen(Number den) {
        this.den = den;
    }
    
    
    
    public Fraccio suma(Fraccio f){
        return new Fraccio();
    }
    
    public Fraccio multiplicacio(Fraccio f){
        return new Fraccio();
    }
    
    @Override
    public int intValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long longValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
