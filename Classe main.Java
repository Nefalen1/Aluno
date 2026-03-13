public class Main {

    public static void main(String[] args) {

        // Criando aluno
        Aluno aluno1 = new Aluno("Lucas");

        // Criando notas
        double[] notas = {8.5, 7.0, 6.5, 9.0};

        // Inserindo notas
        aluno1.setNotas(notas);

        // Calculando média
        double media = aluno1.calcularMedia();

        // Mostrando resultado
        aluno1.resultado(media);

    }
}
