
package calculadoraoht;


public class TesteSubtrair {

    
    public static void main(String[] args) {
        Subtrair calc = new Subtrair();
        
        //Cenário de teste 1 : Subtração de dois números inteiros (dois valores).
        int subtrair = calc.subtrair(10,5);
        System.out.println(subtrair);
        
        //Cenário de teste 2 : Subtração de dois valores sendo o segundo zero;
        subtrair = calc.subtrair(10,0);
        System.out.println(subtrair);
        
        //Cenário de teste 3 : Subtração de dois valores sendo ambos os números zero;
        subtrair = calc.subtrair(0,0);
        System.out.println(subtrair);
        
        //Cenário de teste 4 : Subtração de dois valores sendo o primiro zero e o segundo um número negativo.
        subtrair = calc.subtrair(0,-3);
        System.out.println(subtrair);
        
        //Cenário de teste 5 : Subtração de dois valores sendo o primeiro positivo e o segundo negativo.
        subtrair = calc.subtrair(10,-3);
        System.out.println(subtrair);
        
        //Cenário de teste 6 : Subtração de dois valores sendo o primeiro negativo e o segundo positivo.
        subtrair = calc.subtrair(-5,10);
        System.out.println(subtrair);
        
        //Cenário de teste 7 : Subtração de dois valores sendo o primeiro menor que o segundo.
        subtrair = calc.subtrair(1,2);
        System.out.println(subtrair);
        
    }
}
