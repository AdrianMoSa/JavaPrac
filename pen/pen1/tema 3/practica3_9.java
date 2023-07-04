public class practica3_9 {
    public static void main(String[] args) {
        double media=0;
        
        double major=0;
        String[]noms={"Espinete","Don Pinpon","Gustavo","Triki"};
        double [][] notes={{6.0,7.2,2.3,5.8,3.4},{7.8,1.6,4.6,9.4,3.1},{3.6,1.4,8.9,3.5,6.5},{2.5,3.10,2.4,8.9}};
        double [][] mitjanaIMaximaAlumnes= new double [4][2];
        for (int i=0;i<notes.length;i++){
            for(int j=0;i<notes[i].length;j++){
                media+=notes[i][j];
                if(notes[i][j]>=major){
                    major=notes[i][j];
                }
                
                
            }
            mitjanaIMaximaAlumnes[i][0]=media/notes[i].length;
            mitjanaIMaximaAlumnes[i][1]=major;
            media=0.0;
            major=0.0;

        }
        
        
    }
}
