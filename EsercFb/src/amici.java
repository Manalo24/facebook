import java.util.Scanner;

public class amici {
	int max=0;
	Scanner sc = new Scanner(System.in);
	private int tag = 0;
	private boolean amicoSi = false;
	private int[] numCount = new int[4];
	private int cont = 0;
	private int fotoNum = 0;
	private int friend = 0;
	private int indice = 0;
	private String[] arrayFriends = new String[100];
	private int nameSwitch;
	private String cognome;
	private int eta;
	private String name;
	private String surname;
	private int age;
	boolean stop = false;
	private int max1=0;
	foto photoObject = new foto("bb");

	public amici(String surname, int age) {
		this.surname = surname;
		this.age = age;

	}

	public void execute() {
		while (stop == false) {
			System.out.println("Scegli dal menu:");
			System.out.println("0) Esci");
			System.out.println("1)Per inserire un amico");
			System.out.println("2)Per Inserire una foto");
			System.out.println("3)Per visualizzare lista  amici");
			System.out.println("4)Per visualizzare lista foto");
			System.out.println("5)Per associare una foto ad un  amico");
			System.out.println("6)Per visualizzare quante volte un amico è stato taggato in una foto");
			System.out.println("7)Visualizzare l'amico più taggato");
			nameSwitch = sc.nextInt();
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
			case 6:
				contaTag();
				break;
			case 7:
				max();
				break;
				
			}

		}
	}

	public void getName() {
		System.out.println("Inserisci nome amico");
		name = sc.nextLine();
		arrayFriends[indice] = name;
		indice++;

	}

	public void getArray() {
		for (int i = 0; i < indice; i++) {
			System.out.print(i + ") " + arrayFriends[i] + " ");
		}
		System.out.println(" ");
	}

	public void uscita() {
		stop = true;
	}

	public void association() {
		System.out.println("Scegli da questa lista");
		getArray();
		System.out.println(" ");
		do {
			System.out.println("Scegli numero del amico");
			friend = sc.nextInt();
			sc.nextLine();

			if (friend > indice) {
				System.out.println("Amico non trovato");

			} else {
				amicoSi = true;
			}
		} while (amicoSi == false);

		System.out.println("Hai scelto " + arrayFriends[friend]);
		System.out.println("Scegli da questa lista");
		photoObject.getArray();
		while (fotoNum != 99 && cont < photoObject.indiceFoto) {
			System.out.println("Scegli numero della foto");
			System.out.println("Inserire 99 se non vuoi piu inserire");
			fotoNum = sc.nextInt();
			sc.nextLine();
			if (fotoNum != 99 && fotoNum < photoObject.indiceFoto) {
				System.out.println(
						"La foto " + photoObject.arrayFoto[fotoNum] + " è stato associato a " + arrayFriends[friend]);
				cont++;
				numCount[friend] = cont;
			} else {
				System.out.println("La foto scelta non è disponibile");
			}
		}
		cont = 0;
		fotoNum = 0;

	}
	public void contaTag() {
		System.out.println("Scegli da questa lista");
		getArray();
		System.out.println(" ");
		tag=sc.nextInt();
		sc.nextLine();
		System.out.println("L'amico "+arrayFriends[tag]+" è taggato in "+ numCount[tag] +" foto");
		
		
	}
	public void max() {
		for (int p = 0; p < indice;p++) {
			if (numCount[p]>numCount[p+1]) {
				max=numCount[p];
				
			} else {
				max = numCount[p+1];
				
			} 
			/*if (max1>max) {
				max=max1;
			}*/
		}
		System.out.println(" "+max);
		
	}
}
