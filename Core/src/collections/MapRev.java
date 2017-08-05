package collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class MapRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> st= new LinkedHashSet<String>(Arrays.asList("sathees","dhilip","arun","arun"));
		String[] array=st.toArray(new String[st.size()]);
		for(int i=2;i>=0;i--) {
			System.out.println(array[i]);
		}

	}

}
