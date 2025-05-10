public class ParametrosInvalidosException extends RuntimeException
{
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o primeiro número é maior que o segundo.");
    }
}
