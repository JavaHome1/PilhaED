/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author mocao
 */
public class BemFormada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        System.out.println("resultado:"+bemFormada("(([)]())"));
        String infixa = "4 * (9 / 3 + 2 ) – 1";//5–4*3 +2
        Expressao ex = new Expressao(infixa);
        System.out.print(ex.calculoPosfixa());
        
              
    }
    public static boolean bemFormada(String str){
        Pilha pilha = new Pilha(2); 
        for( int i = 0; i < str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[')
                pilha.push(str.charAt(i));
            // se na posicao corrente em str 
            // temos um fecha colchete
            if( str.charAt(i)==']'){
                // se topo da pilha não tiver
                // um abre colchetes
                if(pilha.pop() != '[')
                    return false; // nao esta bem formada
                
            }
            // se na posicao corrente em str 
            // temos um fecha parenteses
            if( str.charAt(i)==')'){
                // se topo da pilha não tiver
                // um abre colchetes
                if(pilha.pop() != '(')
                    return false; // nao esta bem formada
                
            }
        }
        return pilha.isEmpty();
    }
    
}
