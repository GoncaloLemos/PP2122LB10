package F10E1;

/**
 * @author Pedro Simões [30007732], Gonçalo Lemos [30007523], LEI, D
 */
public class Aluno {
    /**
     *
     */
    private int Id;
    /**
     *
     */
    private String Nome;
    /**
     *
     */
    private int Nota;

    ////////////////////////////////////////////////////////////////////////////////

    /**
     * @param id
     * @param nome
     * @param nota
     */
    public Aluno(int id, String nome, int nota) {
        this.Id = id;
        this.Nome = nome;
        this.Nota = nota;
    }

    ////////////////////////////////////////////////////////////////////////////////

    /**
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        Id = id;
    }

    /**
     * @return
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.Nome = nome;
    }

    /**
     * @return
     */
    public int getNota() {
        return Nota;
    }

    /**
     * @param nota
     */
    public void setNota(int nota) {
        Nota = nota;
    }

    ////////////////////////////////////////////////////////////////////////////////

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Aluno:	" + Nome + ", Nota: " + Nota;
    }
}
