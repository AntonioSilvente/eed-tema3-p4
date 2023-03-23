public class Main {
    public static void main(String[] args) {
        Main programa = new Main();
        boolean resultado = programa.esPalindromo("hola");
        boolean resultado1 = programa.esPalindromo("poop");
        boolean resultado2 = programa.esPalindromo("lol");
        boolean resultado3 = programa.esPalindromo("lool");
        System.out.println("hola= "+resultado);
        System.out.println("poop= "+resultado1);
        System.out.println("lol= "+resultado2);
        System.out.println("lool= "+resultado3);
    }

    public boolean esPalindromo(String texto) {
        boolean palindrome=false;
        if(texto.length()>=4){
            char[] palin= new char[texto.length()];
            char[] inv= new char[palin.length];
            //Rellena el primer vector.
            for (int i = 0; i < palin.length; i++){
                palin[i]=texto.charAt(i);
            }
            //Rellena el vector inverso
            for (int i = 0; i < palin.length; i++){
                inv[i] = palin[palin.length - i - 1];
            }
            //Comparamos ambos vectores para idedntificar si las palabras son palindromo o no.
            for (int i=0; i<palin.length; i++){
                //Si el caracter del vector "palin" coincide con el caracter del vector "inv" entonces son plaindromo. 
                if (palin[i]==inv[i]){
                    palindrome=true;
                    //En caso de que cualquier caracter no coincidiera, entonces "palindrome" es falso y salimos.
                }else{
                    palindrome=false;
                    break;
                }
            }
            //Si "palindrome" es cierto, entonces llas palabras son palindormo.
            return palindrome;
                //Si no, entonces no son palindromo.
        }else{
            return palindrome;
        }
    }
}        
