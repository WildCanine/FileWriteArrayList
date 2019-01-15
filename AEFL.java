package array;
import java.util.List;
import java.util.ArrayList;
public class AEFL {
	public static void main(String[] args) {
		int bucky[]={3,4,5,6,7};
		int total=0;
		for(int x: bucky) {
			total+=x;
		}
		System.out.println(total);
		List<String> listOfStrings=new ArrayList<String>();
		listOfStrings.add("AAA");
		listOfStrings.add("BBB");
		listOfStrings.add("CCC");
		listOfStrings.add("DDD");
		listOfStrings.add("EEE");
		listOfStrings.add("FFF");
		listOfStrings.add("GGG");
		listOfStrings.add("HHH");
		System.out.println("\nList Items: ");
		for(String x: listOfStrings) {
			System.out.println(x);
		}
		System.out.println("\n"+listOfStrings.remove(0));
		System.out.println("\nList Items: ");
		for(String x: listOfStrings) {
			System.out.println(x);
		}
		System.out.println("");
		int a=5,b=6,c=7,d=8;
		int x[]= {5,6,7,8};
		int y[]= {6,7,8,9};
		int z[]= {9,8,7,6};
		int p[][]= {{5,6,7,8},{6,7,8,9},{9,8,7,6}};
		for(int i[]: p) {
			for(int j: i) {
				System.out.print(j+"");
			}
			System.out.println("");
		}
	}
}
