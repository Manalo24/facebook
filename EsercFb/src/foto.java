import java.util.*;
public class foto {
		public int indiceFoto=0;
		public String [] arrayFoto = new String [100];
		private String title;
		private String tag;
		Scanner sc =new Scanner(System.in);

		public foto(String tag) {
			this.tag = tag;
		}

		
		public 	void getTitle() {
			System.out.println("Inserisci titolo del foto");
			title = sc.nextLine();
			arrayFoto[indiceFoto]=title;
			indiceFoto++;
		}
		public void getArray() {
			for (int i=0;i<indiceFoto;i++) {
				System.out.print(i+") " + arrayFoto[i]+" ");
			}
			System.out.println(" ");
		}

		
		
}
