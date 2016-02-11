import java.util.Scanner;
public class TUI {
	public static void main(String[] args) {
		IFunktionalitet f = new Funktionalitet();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Indtast CPR nummer");
		String userinput = scan.nextLine();
		System.out.println(f.getNavn(userinput) + " du har en BMI på: " + Math.ceil(f.getBMI(userinput)) + " - " + f.getTextualBMI(userinput));
		//123456-7890
		//234567-8901
		//456789-0123
	}
}
