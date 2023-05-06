public abstract class EstadoCivil {

    public abstract String getEstadoCivil();

    public boolean casar(Cidadao cidadao){
        cidadao.setEstadoCivil(EstadoCivilCasado.getInstance());
        return true;
    }

    public boolean separar(Cidadao cidadao){
        return false;
    }

    public boolean divorciar(Cidadao cidadao){
        return false;
    }

    public boolean enviuvar(Cidadao cidadao) {
        return false;
    }
}
