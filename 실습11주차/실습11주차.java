package 실습11주차;
import java.util.ArrayList;
import java.util.List;

public class 실습11주차 {

	public static class FavoriteClasses<Fav>{
		private Fav favorite1;
		private Fav favorite2;
		private Fav favorite3;
		
		FavoriteClasses(Fav fav1,Fav fav2,Fav fav3){
			this.favorite1=fav1;
			this.favorite2=fav2;
			this.favorite3=fav3;
		}
		public Fav getFav1() {
			return(this.favorite1);
		}
		public Fav getFav2() {
			return(this.favorite2);
		}
		public Fav getFav3() {
			return(this.favorite3);
		}
	}
	public static void main(String[] args) {
		List r = new ArrayList();
		
		r.add(6.3);
		r.add(5.9);
		
		FavoriteClasses a = new FavoriteClasses("Hello", 67, r.get(0));
		
		System.out.println("My favorites are "+ a.getFav1()+", "+a.getFav2()+", and "+a.getFav3()+".");
	}

}
