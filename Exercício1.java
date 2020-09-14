package primeiromundo;
/*
* Gustavo Guimarães Garcez
* Lista 1
*/
public class Exercício1 {
    public int fibonacci(int n){
        if (n == 1 || n == 2)
            return 1;
        else if (n == 0)
            return 0;
        int posicao = 2, conteudo1 = 1, conteudo2 = 1, conteudo = conteudo1 + conteudo2;
                while (posicao != n)
                    {posicao++; 
                    conteudo = conteudo1 + conteudo2;
                    conteudo1 = conteudo2;
                    conteudo2 = conteudo;}        
            return conteudo;
    }
    public boolean alsBigger(int a, int b){
        int medidor = a - b;
        if (a > b && medidor >= 2)
            return true;
        else 
            return false;      
    }
    public boolean alsBigger2(int a, int b){
        boolean marcador = a > b;
        boolean marcador2 = (a - b) >= 2;
        boolean marcador3 = marcador && marcador2;
        return marcador3;
    }
    public int quintoNumero(){
        int num5 = 0, contador = 0;
        for (int num = 1000; num > num5; num++){
            if (num % 11 == 5){
                contador += 1;}
            if (contador == 5){
                num5 = num;}
        }
        return num5+1;
    }
}
