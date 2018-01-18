package acepta.el.reto;

import java.util.Scanner;

public class N2 {

    static String numero10;
    static String numero5;
static int resultado2;
    public static void main(String[] args) {

        Scanner contador = new Scanner(System.in);

        int n;
        n = contador.nextInt();
        contador.nextLine();

        while (n > 0) {
            numero10 = contador.nextLine();

            numero5 = base10to5(numero10);
            
            resultado2=cuantos4(numero5);
            
            if (resultado2==1){
            System.out.println("SI");
            
            }
            else
            
                        System.out.println("NO");

            
            n--;

        }
    }

    public static String base10to5(String numero) {

        int n1 = Integer.parseInt(numero, 10);

        String s2 = Integer.toString(n1, 5);

        return s2;

    }

    static int cuantos4(String numero5) {
        
        int contador=0;
        int resultado;
        
        for(int i=0;i<numero5.length();i++){
          
            char a = numero5.charAt(i);
            
            if(a=='4'){
                
                contador++;
            }
            
            
        }
        
        if (contador>1){
        resultado=1;
       
        
        }
        else
            resultado=0;
            
           
        
            
            return resultado;
            
    }
}
