package cursojava.Comeco.aprendendoconstrutor.interfaces;

//Contrato de autenticação
public interface PermitirAcesso {
    public Boolean autenticar(); //Apenas declaração do método
    public boolean autenticar(String login, String senha);
}
