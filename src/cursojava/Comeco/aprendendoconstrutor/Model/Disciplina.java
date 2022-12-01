package cursojava.Comeco.aprendendoconstrutor.Model;

import java.util.Arrays;
import java.util.Objects;

//Classe de disciplina servirá para todos objetos e instancias de notas e matérias
public class Disciplina {
    //Cada disciplina terá 4 notas durante o ano
    private double[] nota = new double[4];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMediaNotas(){
        double somaTotal = 0;

        for (double v : nota) {
            somaTotal += v;
        }
        return somaTotal / nota.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Arrays.equals(nota, that.nota) && Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(disciplina);
        result = 31 * result + Arrays.hashCode(nota);
        return result;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + Arrays.toString(nota) +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
