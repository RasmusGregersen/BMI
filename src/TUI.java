import java.util.Scanner;
public class TUI {
	public static void main(String[] args) {
		IFunktionalitet f = new Funktionalitet();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Indtast CPR nummer");
		String userinput = scan.nextLine();
		System.out.println(f.getNavn(userinput)); //234567-8901
		System.out.println(Math.ceil(f.getBMI(userinput)));
		System.out.println(f.getTextualBMI(userinput));
	}
}
