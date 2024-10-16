package PacoteCodificador;

import java.util.ArrayList;
import java.util.List;

public class Codificador {
    public Codificador(String palavra){
        this.palavra = palavra;
        // definido o contrutor para passar a palavre que sera codificada no parametro;
    }
    String palavra;
    List<Character> listaDeCod = new ArrayList<>();
    List<Integer> listaCod = new ArrayList<>();
    public void definirListas(){
        char j = 65;
        for(char i = 65; i < 91; i++){
            listaDeCod.add(j);
            j++;
            // loop for para adicionar todos os caracteres de letra do alfabeto na lista (listaDecod).
        }
        for(int i = 1; i < 27; i++){
            listaCod.add(i);
            // loop para adicionar os números, que servirão como posição das letras.
        }
    }
    public String codificar(){
        String nova = "";
        for(int i = 0; i < this.palavra.length(); i++){
            int k = listaDeCod.indexOf(this.palavra.charAt(i));
            nova = nova + listaCod.get(k);
        }
        return nova;
    }
}
