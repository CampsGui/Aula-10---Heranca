public class App {
    public static void main(String[] args) throws Exception {
        Mensalista m1 = new Mensalista("José", "Rua ABC Nº123", "Junior");
        Horista h1 = new Horista("Maria", "Rua 23 de Maio", 10);

        System.out.println("INSS: " + m1.calcularINSS());
        System.out.println("IR: " + m1.calcularIR());


    }
}
