/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author Felipe
 */
public class Pilha {
    private char elementos[];
    private int top;
    public Pilha( int N){
        this.elementos = new char[N];
        this.top = -1; // pilha vazia
    }
    // verifica se a pilha esta vazia
    public boolean isEmpty(){
        return top == -1;
    }
    // Implementa a operacao que insere 
    // elemento na pilha
    public void push(char elemento) throws ArrayIndexOutOfBoundsException{
        this.elementos[++top]=elemento;
    }
    public char pop(){
        return this.elementos[top--];
    }

    public char getTopElemento() {
        return elementos[top];
    }
    
    
}
