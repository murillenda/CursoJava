package cursojava.Comeco.aprendendoconstrutor.classesauxiliares;

import cursojava.Comeco.aprendendoconstrutor.interfaces.PermitirAcesso;

//Realmente e somenre receber algum que tem o contrato da interface de PermitirAcesso e chamar o autenticar
public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;
    public boolean autenticar() {
        return permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso permitirAcesso) {
        this.permitirAcesso = permitirAcesso;
    }
}
