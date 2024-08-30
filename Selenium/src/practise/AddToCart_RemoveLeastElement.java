package practise;

import java.util.Arrays;
import java.util.TreeSet;

public class AddToCart_RemoveLeastElement {
	public static void main(String[] args) {
		
		 String [] a= {"As 9","Rs 25,499","Rs 3,299"}; 
		 Arrays.sort(a);
		 
		System.out.println(Arrays.toString(a));
		 String res="";
		 for(int i=0;i<a.length;i++)
		 {
			String word=a[i];
			 for(int j=0;j<word.length();j++)
			 {
				 char ch=word.charAt(j);
				// System.out.println(ch);
				 
				 if(ch>='0' && ch<='9')
				 {
					 res=res+ch;
					 //System.out.println(res);
				 }
			 }
			 res=res+" ";
			// System.out.println(res);
			 }
		 		
		 String[] b=res.split(" ");
		 Arrays.sort(b);
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.println(b[i]);
		 }
		 
		/* int arr[]=new int[3];
		 for(int i=0;i<arr.length;i++) {
		         arr[i] = Integer.parseInt(b[i]);
		 }
		 TreeSet<Integer> t=new TreeSet();
		 for(Integer i:arr) 
		 {
			t.add(i);
		 }
		 System.out.println(t);
		 */
		 
		
		
		

	}


}
