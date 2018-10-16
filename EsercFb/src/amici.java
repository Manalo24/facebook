import java.util.Scanner;
public class amici {
	Scanner sc = new Scanner(System.in);
	
		private	String name;
		private	String surname;
		private	int age;
		public amici(String surname, int age) {
			this.surname = surname;
			this.age = age;
			
		}
		public String getName() {
			System.out.println("Inserisci tuo nome");
			return name=sc.nextLine();
		}
		
			
	
}
