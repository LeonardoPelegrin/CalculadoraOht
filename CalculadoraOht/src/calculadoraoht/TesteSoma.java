
package calculadoraoht;

public class TesteSoma {

  
    public static void main(String[] args) {
     
        Somar calc = new Somar();
      
       //Cenário de teste 1 : Soma de dois números inteiros (dois valores).
        int soma = calc.somar(3,7);
        System.out.println(soma);
        
        //Cenário de teste 2 : Soma de dois números inteiros sendo um deles zero.
        soma = calc.somar(7,0);
        System.out.println(soma);
        
        //Cenário de teste 3 : Soma de dois números sendo que ambos são zeros (nulo).
        soma = calc.somar(0,0);
        System.out.println(soma);
        
        //Cenário de teste 4 : Soma de dois valores sendo que um deles é ngativo.
        soma = calc.somar(10,-2);
        System.out.println(soma);
        
        //Cenário de teste 5 : Soma de dois valores sendo que ambos valores são negativos.
        soma = calc.somar(-5,-2);
        System.out.println(soma);
        
        //Cenário de teste 6 : Soma de dois valores sendo um deles zero e o outro é negativo.
        soma = calc.somar(0,-2);
        System.out.println(soma);
        
       //Cenário de teste 7 : Soma de dois valores sendo o primeiro negativo e o segundo positivo.
        soma = calc.somar(-10,5);
        System.out.println(soma);
        
        //Cenário de teste 8 : Soma de dois valores ambos nesgativos com muitos digitos.
        soma = calc.somar(-127865467,109845863);
        System.out.println(soma);
        
        
        
        
    }  
}
