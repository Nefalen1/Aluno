public class Aluno{
    private string nome;
    private double [] notas;

public Aluno(string nome){
    this.nome= nome;
}
public void setnotas(double[] notas){
    this.notas = new double[notas.length];
    for (int i= 0; i< notas.length; i=++){
        if(notas[i]>=0 && notas[i] <= 10){
           this.notas[i]= notas[i]; 
        } else { 
            system.out.println("nota inválidada:"+ notas[i] + ". deve estar entre 0 e 10");
            this.notas[i] = 0;

        }
    }
}
public double[] getnotas() {
    return notas;

}
public double calcularmedia() {
    double soma = 0;
    for (double nota : notas){
        soma += nota;

    }
    double media = soma/ notas.length;
    if( media < 0){
        media = 0;

    }
    system.out.println("Aluno:"+ nome);
    system.out.println("Quantidade de notas:" + notas.length);
    system.out.println("Média:" + media);

    return media;
    public void resultado( double media){

        if (media >= 7){
            system.out.println("Resultado: Aprovado");

        } else {
            system.out.println("Resultado: Reprovado");
            
        }
    }
}
}
