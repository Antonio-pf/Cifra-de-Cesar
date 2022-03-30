package Cifrador;

public class Cifrador {

    private char valores[];
    private int chave;

    public Cifrador() {

        valores = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*()><[]áãç".toCharArray();
        chave = 5;
    }

    public int trocar(char a) {
        int i = 0;
        int o = valores.length;

        boolean validaValores = false;
        while (i < o) {
            char l = valores[i];
            if (l == a) {
                validaValores = true;
                break;
            }
            i += 1;
        }

        if (!validaValores) {
            i -= 1;
        }
        return i;
    }

    public String guardar(String entrada) {
        String saida = "";

        int i = 0;
        int o = entrada.length();
        while (i < o) {
            char letra = entrada.charAt(i);

            if (letra == ' ') {
                saida += " ";
            } else {

                int p = trocar(letra);

                if (p >= 0) {
                    int n = p + chave;
                    if (n >= valores.length) {
                        n -= valores.length;

                    }
                    saida += String.valueOf(valores[n]);

                } else {
                    saida += "";
                }
            }

            i += 1;
        }

        return saida;

    }

    public String revelar(String entrada) {
        String saida = "";
        int i = 0;
        int o = entrada.length();

        while (i < o) {

            char letra = entrada.charAt(i);

            if (letra == ' ') {
                saida += " ";

            } else {

                int p = trocar(letra);
                if (p >= 0) {
                    int n = p - chave;
                    if(n < 0){
                        n += valores.length;
                    }
                    saida += String.valueOf(valores[n]);
                } else {
                    saida += " ";
                }
            }

            i += 1;
        }
        return saida;
    }
}
