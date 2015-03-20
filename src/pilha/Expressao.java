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
public class Expressao {
    String infixa;
    String posfixa;
    Pilha sinais;

    public Expressao(String infixa) {
        this.infixa = infixa;
        this.posfixa="";
        sinais=new Pilha(100);
    }
    
    
    
    public String calculoPosfixa (){
        
        for (int i = 0; i < infixa.length(); i++) {
             char bolinha = infixa.charAt(i);
             if(bolinha != '+'&& bolinha != '-'&& bolinha != '*'&& bolinha != '/' && bolinha != '%'&& bolinha != '^' ){
                 posfixa+=bolinha;
                System.out.println("passou por aqui  :"+bolinha);
             }
             else{
                 
                 if(sinais.isEmpty()){
                     
                     sinais.push(bolinha);
                 }
                 else{
                     if(this.prioridadeStack(bolinha) < this.prioridadeStack(sinais.getTopElemento())){
                         sinais.push(bolinha);
                     }
                     else{
                         while(!sinais.isEmpty()){
                             posfixa+= sinais.pop();
                         }
                         sinais.push(bolinha);
                     }
                 }
             } 
        }
        
        while(!sinais.isEmpty()){
            
            posfixa+= sinais.pop();
        }
        
        
        
        return posfixa;
    }

    /**
     *
     * @param bolinha
     * @return
     */
    public int prioridadeStack(char bolinha){
        if(bolinha == '+'||bolinha == '-')
            return 3;
        else{ 
            if(bolinha == '*'||bolinha == '/' ||bolinha == '%')
                return 2;
            else{
                if(bolinha == '^')
                    return 1;
            }
        }
        return -1;
    }
}
