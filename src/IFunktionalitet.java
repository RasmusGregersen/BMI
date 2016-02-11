public interface IFunktionalitet { // beregn BMI udfra personens CPR-nr
	public double getBMI(String cpr); // returnér en tekst der beskriver BMI intervallet
	public String getTextualBMI(String cpr); // returnér perosn navn udfra CPR-nr
	public String getNavn(String cpr); } // returnér perosn navn udfra CPR-nr