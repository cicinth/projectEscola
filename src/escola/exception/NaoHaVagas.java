package escola.exception;

public class NaoHaVagas extends Exception {
    public NaoHaVagas() {
        super("Não há vagas disponíveis");
    }
}
