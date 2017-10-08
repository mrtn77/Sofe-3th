package sofe.exercise2;

import java.util.ArrayList;

public class ReverseParenthesis {

    public static String reverseParenthesis(String text) {
        String cadena = "";
        int counter = 0;
        ArrayList abiertos = posicionParentesisAbiertos(text);
        ArrayList cerrados = posicionParentesisCerrados(text);
        String inicio=text.substring(0,Integer.parseInt(abiertos.get(0).toString()));
        String finals=text.substring(Integer.parseInt(cerrados.get(0).toString()));
     //   String[] parejas = new String[text.length()];
        ArrayList Parejas=new ArrayList();
        for (int i = 0; i < abiertos.size(); i++) {
            int auxPosicionFinal=0;
            
            int auxPosicionInicial=Integer.parseInt(abiertos.get(i).toString());
            for(int j= 0; j<cerrados.size(); j++)
            {
                if(auxPosicionInicial >Integer.parseInt(cerrados.get(j).toString()))
                {
                    
                }
                else{
                    auxPosicionFinal=Integer.parseInt(cerrados.get(j).toString());
                    break;
                }
            }
            
            
           
            StringBuilder aux = new StringBuilder(text.substring(auxPosicionInicial+1,auxPosicionFinal-1));

            Parejas.add(aux.reverse().toString());
            /*for (int j = abiertos[i]; j < cerrados[i]; j++) {

                char aux2 = parejas[counter].charAt(j);
                char aux3 = text.charAt(j);
                aux3 = aux2;

            }*/
           
        }
        cadena=inicio+Parejas.get(Parejas.size()-1).toString()+finals; 
       

        return cadena;
    }
       
    static ArrayList posicionParentesisAbiertos(String text) {
        int counter = 0;
        ArrayList lista=new ArrayList();
        int[] arreglo = new int[text.length()];
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == '(') {
                lista.add(i);

            }
        }
            
        return lista;

    }

    static ArrayList posicionParentesisCerrados(String text) {
        ArrayList lista=new ArrayList();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ')') {
                lista.add(i);

            }
        }

        return lista;
    }

}
