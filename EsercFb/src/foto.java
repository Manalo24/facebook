import java.util.*;
public class foto {
		private String title;
		private String tag;
		
		Scanner sc =new Scanner(System.in);

		public foto(String tag) {
			this.tag = tag;
		}

		
		public String getTitle() {
			System.out.println("Inserisci titolo del foto");
			return title = sc.nextLine();
		}

		
		
}
