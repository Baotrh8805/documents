package bt_tren_lop;

public class test {
	public static void main(String[] args) {
		int i=0,t=1;
		while(true) {
			i++;
			if(i%2!=0) continue;
			t*=i;
			if(i==10) break;
		}
		System.out.print("10!!= "+t);
	}
}
