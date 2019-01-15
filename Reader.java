package array;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Reader {
	public static void main(String[] args) {
		Sort sort=new Sort();
		String fileName="/home/compsci/eclipse-workspace/textfiles/Lorem_Ipsum.txt";
		String line;
		ArrayList<String> aList=new ArrayList();
	try {
		BufferedReader input=new BufferedReader(new FileReader(fileName));
		if (!input.ready()) {
			input.close();
			throw new IOException();
		}
		while ((line=input.readLine())!=null) {
			aList.add(line);
		}
		input.close();
	}
	catch (IOException e) {
		System.out.println("Error "+e);
	}
	String alpha="abcdefghijklmnopqrstuvwxyz0123456789.,:;?\"-[]'";
	String lineContent="";
    int[] frequency;
    frequency=new int[alpha.length()];
    for (int f=0; f<alpha.length(); f++) {
    	frequency[f]=0;
    }
	int sz=aList.size();
	int j=0;
	int letIndex=0;
	for (int i=0; i < sz; i++) {
		System.out.println(aList.get(i).toString());
		lineContent=aList.get(i).toString().toLowerCase();
		for (j=0; j < lineContent.length(); j++) {
			if (!String.valueOf(lineContent.charAt(j)).equals(" ")) {
				letIndex=alpha.indexOf( String.valueOf(lineContent.charAt(j)));
				frequency[letIndex]=frequency[letIndex]+1;
			}
		}
	}
	int a, b, temp=0;
	char temp2;
	int[] freq=frequency;
	char[] alphaChar;
	alphaChar=new char[alpha.length()];
	for (int u=0; u<alpha.length(); u++) {
		alphaChar[u]=alpha.charAt(u);
    }
	for (a=0; a<freq.length-1; a++) {
		for (b=0; b<freq.length-1-a; b++) {
			if (freq[b]<freq[b+1]) {
				temp=freq[b];
				freq[b]=freq[b+1];
				freq[b+1]=temp;
				temp2=alphaChar[b];
				alphaChar[b]=alphaChar[b+1];
				alphaChar[b+1]=temp2;
			}
		}
	}
	alpha=String.valueOf(alphaChar);
	System.out.println("");
	System.out.println("Bubble Sort");
	int[] list1=sort.bubbleSort(frequency);
	for (int l=0; l<alpha.length(); l++) {
		System.out.print(Character.toString(alpha.charAt(l)));
		System.out.print(": ");
		System.out.println(list1[l]);
	}
	System.out.println("");
	System.out.println("Insertion Sort");
	int[] list2=sort.insertionSort(frequency);
	for (int m=0; m<alpha.length(); m++) {
		System.out.print(Character.toString(alpha.charAt(m)));
		System.out.print(": ");
		System.out.println(list2[m]);
	}
	ArrayList<Integer> freqarray=new ArrayList();
	for (int v=0; v<frequency.length; v++) {
    	freqarray.add(v, frequency[v]);
    }
	ArrayList<Integer> list3=sort.insertionSort(freqarray);
	System.out.println("");
	System.out.println("Insertion Sort (ArrayList)");
	for (int n=0; n<alpha.length(); n++) {
		System.out.print(Character.toString(alpha.charAt(n)));
		System.out.print(": ");
		System.out.println(list3.get(n));
	}
	System.out.println("");
	System.out.println("Merge Sort");
	int[] list4=frequency;
	sort.mergeSort(list4);
	for (int o=0; o<alpha.length(); o++) {
		System.out.print(Character.toString(alpha.charAt(o)));
		System.out.print(": ");
		System.out.println(list4[o]);
	}
	System.out.println("");
	System.out.println("Quick Sort");
	int[] list5=frequency;
	sort.quickSort(list5, list5[0], list5[alpha.length()-1]);
	for (int p=0; p<alpha.length(); p++) {
		System.out.print(Character.toString(alpha.charAt(p)));
		System.out.print(": ");
		System.out.println(list5[p]);
	}
	System.out.println("");
	System.out.println("Selection Sort");
	int[] list6=frequency;
	sort.selectionSort(list6);
	for (int q=0; q<alpha.length(); q++) {
		System.out.print(Character.toString(alpha.charAt(q)));
		System.out.print(": ");
		System.out.println(list6[q]);
	}
	}
}