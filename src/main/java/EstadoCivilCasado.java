public class EstadoCivilCasado extends EstadoCivil{

    private static EstadoCivilCasado instance = new EstadoCivilCasado();

    public static EstadoCivilCasado getInstance(){ return instance; }

    public String getEstadoCivil(){
        return "Casado";
    }

    public boolean casar(Cidadao cidadao) {
        return false;
    }

    public boolean divorciar(Cidadao cidadao) {
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        return true;
    }

    public boolean separar(Cidadao cidadao) {
        cidadao.setEstadoCivil(EstadoCivilSeparado.getInstance());
        return true;
    }

    public boolean enviuvar(Cidadao cidadao) {
        cidadao.setEstadoCivil(EstadoCivilViuvo.getInstance());
        return true;
    }
}
