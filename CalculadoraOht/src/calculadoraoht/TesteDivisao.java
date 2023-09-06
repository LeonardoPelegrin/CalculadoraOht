package calculadoraoht;


public class TesteDivisao {

    
    public static void main(String[] args) {
        Divisao calc = new Divisao();
        
        //Cenário de teste 1 : Divisão de dois números inteiros positivos (dois valores).
        int divisao = calc.divisao(6,2);
        System.out.println(divisao);
        
        //Cenário de teste 2 : Divisão de dois números inteiros negativos.
         divisao = calc.divisao(-6,-2);
         System.out.println(divisao);
        
         //Cenário de teste 3 : Divisão de dois números inteiros o primiro negativo e o segundo positivo.
         divisao = calc.divisao(-6,2);
         System.out.println(divisao);
         
         //Cenário de teste 4 : Divisão de dois números inteiros o primiro positivo e o segundo negativo.
         divisao = calc.divisao(8,-2);
         System.out.println(divisao);
         
         /*Cenário de teste 5 : Divisão de 2 números o primeiro positivo e o segundo númro zero.
          divisao = calc.divisao(8,0);
          System.out.println(divisao);  //Aqui está em comentário pois divisão por 0 não é possivel da erro.
         */
         
         /* Cenário de teste 6 : Divisão de 2 números o primeiro nulo e o segundo positivo.
         divisao = calc.divisao(0,7);
          System.out.println(divisao); //Aqui está em comentário pois divisão por 0 não é possivel da erro.
         
         */
         
          /*Cenário de teste 7 : Divisão de dois números ambos números zero.
          divisao = calc.divisao(0,0);
          System.out.println(divisao);  //Aqui está em comentário pois divisão por 0 não é possivel da erro.
          */
         
        
        
        
        
    }  
}
