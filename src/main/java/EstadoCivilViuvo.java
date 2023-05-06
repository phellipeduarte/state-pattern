public class EstadoCivilViuvo extends EstadoCivil{

    private static EstadoCivilViuvo instance = new EstadoCivilViuvo();

    public static EstadoCivilViuvo getInstance(){ return instance; }

    public String getEstadoCivil(){
        return "Viuvo";
    }
}
