public class EstadoCivilSeparado extends EstadoCivil{

    private static EstadoCivilSeparado instance = new EstadoCivilSeparado();

    public static EstadoCivilSeparado getInstance(){ return instance; }

    public String getEstadoCivil(){
        return "Separado";
    }

    public boolean casar(Cidadao cidadao) {
        return false;
    }

    public boolean divorciar(Cidadao cidadao) {
        cidadao.setEstadoCivil(EstadoCivilDivorciado.getInstance());
        return true;
    }
}
