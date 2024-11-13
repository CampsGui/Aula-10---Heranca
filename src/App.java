public class App {
    public static void main(String[] args) throws Exception {
        Mensalista m1 = new Mensalista("José", "Rua ABC Nº123", "Pleno");
        Horista h1 = new Horista("Maria", "Rua 23 de Maio", 10);
        
        m1.calcularSalario();

        System.out.println("MENTASALISTA: " + m1.getNome());  
        System.out.println("INSS: " + m1.calcularINSS());
        System.out.printf("IR: %.2f%n", m1.calcularIR());
        System.err.println("\n");

        h1.calcularSalario();

        System.out.println("HORISTA: " + h1.getNome());        
        System.out.println("INSS: " + h1.calcularINSS());
        System.out.println("IR: " + h1.calcularIR());
    }
}
