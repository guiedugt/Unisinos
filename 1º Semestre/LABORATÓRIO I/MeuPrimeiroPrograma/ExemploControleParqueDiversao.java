public class ExemploControleParqueDiversao
{
    public static void main(String args[]){
        //declarar e atribuir valor para as constantes: 
        //   - IDADE_MINIMA para acesso ao brinquedo
        //   - VALOR_CARTAO valor do cartao
        final int IDADE_MINIMA = 12;
        final double VALOR_CARTAO = 15.0;
        
        //declarar e atribuir valor as variaveis: 
        int qtdeAcessos = 15;
        int idade = 15;
        double valorBrinquedo = 3.5;
        
        //calcular o quanto seria gasto se comprasse os acessos para cada brinquedo indivualmente
        double totalSemCartao = qtdeAcessos*valorBrinquedo;
        double totalEconomiaCartao = totalSemCartao-VALOR_CARTAO;
    
        //imprimir as mensagens na tela
        System.out.printf("Voce economizou: %4.2f.\n",totalEconomiaCartao);
        System.out.printf("Voce acessou um brinquedo e agora possui: %d.\n",--qtdeAcessos);
        System.out.printf("Pela sua idade seu acesso ao brinquedo e: %b.\n",idade>IDADE_MINIMA);
        System.out.printf("Controle acesso: Idade permitida e ");
        System.out.printf("Possui Acessos: %b.\n",idade>IDADE_MINIMA && qtdeAcessos>0);
    }
}
