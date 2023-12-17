package E2P1__DiegoRosales;

public class Numero {
     int base;
    int decimal;
    String conversion;
         
    public Numero(int base, int numero) {
           this.base = base;
           this.decimal = numero;
    }
         
    char numToChar(int numero) {
       char caracter;
       
       if(numero>=0 && numero<=9){
          caracter=(char)(numero+'0');
       }else{
         switch(numero){
             case 10:
                 caracter='A';
                 break;
             case 11:
                 caracter='B';
                 break;
             case 12:
                 caracter='C';
                 break;
             case 13:
                 caracter='D';
                 break;
             case 14:
                 caracter='E';
                 break;
             case 15:
                 caracter='F';
                 break;
             case 16:
                 caracter='G';
                 break;
             case 17:
                 caracter='H';
                 break;
             case 18:
                 caracter='I';
                 break;
             case 19:
                 caracter='J';
                 break;
             case 20:
                 caracter='K';
                 break;
             case 21:
                 caracter='L';
                 break;
             case 22:
                 caracter='M';
                 break;
             case 23:
                 caracter='N';
                 break;
             case 24:
                 caracter='O';
                 break;
             case 25:
                 caracter='P';
                 break;
             case 26:
                 caracter='Q';
                 break;
             case 27:
                 caracter='R';
                 break;
             case 28:
                 caracter='S';
                 break;
             case 29:
                 caracter='T';
                 break;
             case 30:
                 caracter='U';
                 break;
             case 31:
                 caracter='V';
                 break;
             case 32:
                 caracter='W';
                 break;
             case 33:
                 caracter='X';
                 break;
             case 34:
                 caracter='Y';
                 break;
             case 35:
                 caracter='Z';
                 break;
             default:
                 caracter=' ';
                 
         }
       }
       return caracter;
    }
    
    int charToNum(char caracter) {
           int numero=0;
           return numero;
    }
    
    
    
    String decToBase() {
        int residuo;
        String numeroBase = "";
        int numeroDecimal=getDecimal();
        
        while(numeroDecimal>0){
            int cociente = numeroDecimal / getBase();
            residuo=numeroDecimal-(cociente*getBase());
            
            char caracter = numToChar(residuo);
            numeroBase = caracter+numeroBase;
            numeroDecimal = cociente;
            
        }
        this.conversion=numeroBase;
        return numeroBase;
    }
    
    int baseToDec(String otraBase,int base) {
        int equivalenteNumerico;
        int decimal=0;
        
        for (int i = 0; i < otraBase.length(); i++) {
            int potencia=otraBase.length();
            char caracter = otraBase.charAt(i);
            equivalenteNumerico= charToNum(caracter);
            
            decimal = decimal + equivalenteNumerico*(int)Math.pow(base,potencia);
        }
        return decimal;
    }
    
    public  int getDecimal (){
     return this.decimal;
    }

    public void setDecimal (int newDecimal){
        this.decimal = newDecimal;
    }
    
    public int getBase (){
     return this.base;
    }

    public void setBase (int newBase){
        this.base = newBase;
    }
}
