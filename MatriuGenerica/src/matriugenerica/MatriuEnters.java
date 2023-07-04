package matriugenerica;

public class MatriuEnters extends MatriuGenerica{

    @Override
    public Integer[][] suma(Integer[][] matriu1, Integer[][] matriu2) {
        Integer[][] resultat = new Integer[matriu1.length][matriu2[0].length];
        for(int i=0; i<matriu1.length; i++){
            for(int j=0; j<matriu1[i].length; j++){
                resultat[i][j] = matriu1[i][j] + matriu2[i][j];
            }
        }
        
        return resultat;
    }

    
    @Override
    public Integer[][] multiplicacio(Integer[][] matriu1, Integer[][] matriu2) {
        Integer[][] resultat = new Integer[matriu1.length][matriu2[0].length];
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[i].length; j++) {
                resultat[i][j] = 0;

                for (int k = 0; k < matriu1[0].length; k++) {
                    resultat[i][j] = resultat[i][j] + matriu1[i][k] * matriu2[k][j];
                }
            }
        }
        return resultat;
    }

    
    @Override
    public Object zero() {
        return 0;
    }

    
    @Override
    public Object aleatori() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public Object suma(Object matriu1, Object matriu2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
    
}
