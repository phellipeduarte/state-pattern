public class EstadoCivilDivorciado extends EstadoCivil{

    private static EstadoCivilDivorciado instance = new EstadoCivilDivorciado();

    public static EstadoCivilDivorciado getInstance(){ return instance; }

    public String getEstadoCivil(){
        return "Divorciado";
    }
}
