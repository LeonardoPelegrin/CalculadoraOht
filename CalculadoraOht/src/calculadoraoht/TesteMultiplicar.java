
package calculadoraoht;

public class TesteMultiplicar {

    
    public static void main(String[] args) {
       Multiplicar calc = new Multiplicar();
       
        //Cenário de teste 1 : Multiplicação de dois numeros inteiros positivos.
        int multiplicar = calc.multiplicar(3,7);
        System.out.println(multiplicar);  
        
        //Cenário de teste 2 : Multiplicação de dois números sendo o segundo número zero.
         multiplicar = calc.multiplicar(3,0);
         System.out.println(multiplicar); 
        
        //Cenário de teste 3 : Multiplicação de dois números sendo ambos eles zero.
         multiplicar = calc.multiplicar(0,0);
         System.out.println(multiplicar);
         
         //Cenário de teste 4 : Multiplicação de dois números sendo o primeiro zero e o segundo positivo.
         multiplicar = calc.multiplicar(0,2);
         System.out.println(multiplicar);
         
         //Cenário de teste 5 : Multiplicação de dois números sendo o primeiro zero e o segundo negativo.
         multiplicar = calc.multiplicar(0,-4);
         System.out.println(multiplicar);
       
         //Cenário de teste 6 : Multiplicação de dois números sendo o primeiro negativo e o segundo zero.
         multiplicar = calc.multiplicar(-5,0);
         System.out.println(multiplicar);
          
         //Cenário de teste 7 : Multiplicação de dois números sendo o primeiro positivo e o sgundo negativo.
         multiplicar = calc.multiplicar(3,-5);
         System.out.println(multiplicar);
          
        //Cenário de teste 8 : Multiplicação de dois números sendo o primeiro negativo e o sgundo positivo.
         multiplicar = calc.multiplicar(-6,3);
         System.out.println(multiplicar);
         
         //Cenário de teste 7 : Multiplicação de dois números sendo ambos negativos.
          multiplicar = calc.multiplicar(-6,-3);
         System.out.println(multiplicar);
    }   
}
