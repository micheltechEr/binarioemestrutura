package aula20192;
import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        //Leitura de dados
        Scanner s =new Scanner(System.in);
        int numero;
     //Defino o tamanho da pilha
        Pilha p = new Pilha(39);
        //Variavel resto,que armazena a divisão inteira
        int resto;
        System.out.println("Informe o numero decimal :");
        numero = s.nextInt();
        //Enquanto o numero não for 0,a operação é executada
        while(numero  !=0){
            //divisão
            resto = numero%2;
            // armazena o resto na pilha
           p.push(resto);
           numero = numero/2;
        }
        System.out.println("Binário desse número :");
        //Enquanto a pilha não estiver vazia, será mostrada a exibição dos restos
        while(!p.isEmpty()){
            resto = p.remover();
            System.out.print(resto);
        }
    }
}
