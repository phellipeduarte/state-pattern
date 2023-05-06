public class EstadoCivilSolteiro extends EstadoCivil{

    private static EstadoCivilSolteiro instance = new EstadoCivilSolteiro();

    public static EstadoCivilSolteiro getInstance(){ return instance; }

    public String getEstadoCivil(){
        return "Solteiro";
    }
}
