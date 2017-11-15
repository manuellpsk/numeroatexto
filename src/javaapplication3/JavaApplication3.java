package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {
    private static Scanner scan;
    public static void main(String[] args) {
        scan=new Scanner(System.in);
        //Scanner leer=new Scanner(System.in);
        float n1=datain();
        text(n1);
    }//main
    
    static float datain(){
    float n;
    do{
        System.out.println("Ingrese nota");
        n=scan.nextFloat();
    }while(n<1 || n>7);
    return n;
    }
    
    static void text(float n){
        
        String texto=new String();
        float a=n*10;
        int digitouni=(int)a/10;
        int digitodeci=(int)a%10;
        if(digitodeci!=0)
            {texto=cadena(digitouni)+","+cadena(digitodeci);
            }
        else
            {texto=cadena(digitouni);
            }
        System.out.println(texto);
      
    }
    static String cadena(int x){
        
        String str=new String();
        switch(x){
            case 1:str="UNO";break;
            case 2:str="DOS";break;
            case 3:str="TREA";break;
            case 4:str="CUATRO";break;
            case 5:str="CINCO";break;
            case 6:str="SEIS";break;
            case 7:str="SIETE";break;
            case 8:str="OCHO";break;
            case 9:str="NUEVE";break;
        }
        return str;
    }
}//class main
