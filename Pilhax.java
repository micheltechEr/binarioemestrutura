package main;
public class Pilha<T>{
/*Olá,hoje vamos aprender a implementar a estrutura de Dados(Pilha).
Ela é uma estrutura baseada em FIFO(First In First Out),ou seja,o primeiro elemento a sair é o primeiro elemento a entrar
Ela possui dois atributos,um que guarda o topo e outro que guarda os valores armazenados nela.Como agora vamos implementar ela no formato de vetor
 - ,ela possuirá [].
 *\
T[] elem
int topo;
//Agorá iremos criar o constrututor
public Pilha(int max){
//O atributo elemento irá ser convertido em Object.Esse constrututor armazena o máximo de elementos que a pilha suporta
elem = (T[]) new Object[max];
topo = -1;
    }
    //Aqui está o metódo para verificar se está cheia...Ele consiste em um boolean que retorna naturalmente false,caso a pilha estiver 
     // cheia e ao contrário se ela não estiver
    public boolean isFull(){
     return  topo == elem.length-1;
    }
    //O segundo metódo de verificação consiste em verificar se a pilha está vazia,caso a alternativa esteja certa,ele o topo será -1.
    public boolean isEmpty(){
    return topo == -1;
    }
    public boolean push(T elemento){
    //Se a pilha não (!) estiver cheia 
      if(!this.isFull()){
        topo++;
        elem[topo] = elemento;
      }
    }
}
