public class App {
    public static void main(String[] args) throws Exception {
        double primeironumero = 20;
        double segundonumero = 30;
        //CHAMAR A CLASSE
        FuncionalidadesCalculadora funcoes = new FuncionalidadesCalculadora();
        //ADICIONAR OS VALORES NAS FUNÇÕES/MÉTODOS
        double SOMA = funcoes.Somar(primeironumero, segundonumero);
        double SUBTRAIR = funcoes.Subtrair(primeironumero, segundonumero);
        double DIVIDIR = funcoes.Dividir(primeironumero, segundonumero);
        double MULTIPLICAR = funcoes.Multiplicar(primeironumero, segundonumero);
        //MOSTRAR RESULTADOS NA TELA
        System.out.println("Resultado da soma: "+SOMA);
        System.out.println("Resultado da subtração: "+SUBTRAIR);
        System.out.println("Resultado da divisão "+DIVIDIR);
        System.out.println("Resultado da multiplicação: "+MULTIPLICAR);
    }
}
