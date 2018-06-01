package TestErro;

import java.util.ArrayList;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> use = new ArrayList <String>();
		ArrayList <String> use2 = new ArrayList <String>();
		
		use.add("1");
		use.add("2");
		use.add("a");
		use.add("b");
		use.add("c");
		
		use2.add("a");
		use2.add("b");
		use2.add("c");

		
		
		
		
		for(int i=0;i < use2.size();i++) {
			
			for(int j=0;j < use.size();j++) {
				
				if(use.get(j).equals(use2.get(i))){
					
					System.out.println(use.get(i));
				}
				}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
