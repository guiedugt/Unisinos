
//classe de teste
public class SegundoExemploIF
{
    //método main da classe de teste
    //responsável pela execução dos comandos 
    public static void main(String args[])
    {
        // criando duas váriáveis do tipo inteiro
        int numero1 = 4;
        int numero2 = 4;
        
        /* utiliza o if para verificar se os valores das variáveis: numero1 e numero2 
         * são iguais e depois imprime um texto caso o retorno da condição seja verdadeiro – 
         * neste exemplo estamos também utilizando o operador de comparação - igualdade  
         */
        if (numero1==numero2) // se os valores forem iguais, apresenta o texto abaixo
            System.out.println("As variáveis possuem valores IGUAIS");
        else // senão, se os valores forem diferentes apresenta o texto abaixo
            System.out.println("As variáveis possuem valores DIFERENTES");

    }
}
