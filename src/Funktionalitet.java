public class Funktionalitet implements IFunktionalitet {
		IData data = new Data();
		private double BMI;
	public double getBMI(String cpr) {
		BMI = data.getVaegt(cpr)/Math.pow(data.getHoejde(cpr), 2);
		return BMI;
	}

	public String getTextualBMI(String cpr) {
		String aktuel = "";
		String undervaegtig = "Undervægtig";
		String tilpas = "Tilpas";
		String overvaegtig = "Overvægtig";
		String svaertovervaegtig = "Svært overvægtig";
		if (BMI <= 18.5)
			aktuel = undervaegtig;
		else if (BMI <= 25)
			aktuel = tilpas;
		else if (BMI <= 30)
			aktuel = overvaegtig;
		else 
			aktuel = svaertovervaegtig;
		return aktuel;
	}

	public String getNavn(String cpr) {
		return data.getNavn(cpr);
	}

	public double getVaegt(String cpr) {
		return data.getVaegt(cpr);
	}

	public double getHoejde(String cpr) {
		return data.getHoejde(cpr);
	}

}
