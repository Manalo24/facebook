import java.util.Scanner;
public class amici {
	Scanner sc = new Scanner(System.in);
		private int [] numCount = new int [100];
		private int cont=0;
		private int fotoNum=0;
		private int friend=0;
		private int indice=0;
		private String [] arrayFriends = new String [100];
		private int nameSwitch;
		private String cognome;
		private int eta;
		private	String name;
		private	String surname;
		private	int age;
		boolean stop = false;
		foto photoObject = new foto("bb");
		public amici(String surname, int age) {
			this.surname = surname;
			this.age = age;
			
		}
			
		
		public void execute(){
			while (stop==false) {
				System.out.println("Scegli dal menu:");
				System.out.println("0) Esci");
				System.out.println("1)Per inserire un amico");
				System.out.println("2)Per Inserire una foto");
				System.out.println("3)Per visualizzare lista  amici");
				System.out.println("4)Per visualizzare lista foto");
				System.out.println("5)Per associare una foto ad un  amico");
				nameSwitch=sc.nextInt();
				sc.nextLine();
						
			switch (nameSwitch) {
			case 0: 
			        uscita();
			        break;
			case 1: 
					getName();
					break;
			case 2:
					
					photoObject.getTitle();
					break;
			case 3:
					getArray();
					break;
			case 4:
				photoObject.getArray();
				break;
			case 5:
				association();
				break;
			}

			
			}
		}
		public void getName() {
			System.out.println("Inserisci nome amico");
			name=sc.nextLine();
			arrayFriends[indice]=name;
			indice++;
			
		}
		public void getArray() {
			for (int i=0;i<indice;i++) {
				System.out.print(i+") " + arrayFriends[i]+" ");
			}
			System.out.println(" ");
		}
		public void uscita() {
			stop=true;
		}
		public void association() {
			getArray();
			System.out.println(" ");
			System.out.println("Scegli amico");
			friend=sc.nextInt();
			sc.nextLine();
			System.out.println("Hai scelto " + arrayFriends[friend]);
			photoObject.getArray();
			
			while (fotoNum!=99 && cont<photoObject.indiceFoto) {
				System.out.println("Scegli foto");
				System.out.println("Inserire 99 se non vuoi piu inserire");
				fotoNum=sc.nextInt();
				sc.nextLine();
				if (fotoNum!=99) {
				System.out.println("La foto " +	photoObject.arrayFoto[fotoNum] +" è stato associato a " + arrayFriends[friend] );
			cont++;
				numCount[friend]=cont;
				}
			}
			
			
				
				
				
			
			System.out.println(" " + cont);
			cont=0;
			fotoNum=0;

		}
}
