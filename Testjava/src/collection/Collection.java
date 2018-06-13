package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection {
	public static void main(String args[]) throws Exception{  
		  //Creating and adding elements  
		int a = 0;
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.clone();
		  //Traversing elements  
		 
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next()); 
		  // System.out.println(a);
		  }  
		  Collection c =new Collection();
		  c.forExceptionsTest();
		  c.forHashMapTest();
		 }  

	public void forExceptionsTest() throws Exception {
		String url = null;
		/*
		 * 1. Compare the Given above string with any other valid string
		 */
		/*
		 * 2. Handle the Specific Exception
		 */
		/*
		 * 3. Throw the exception manually and handle it appropriately
		 */ 
		
		try{
			
			String temp = "Test";
			if(url!=temp){
				throw new ArithmeticException("url is not a valid Input"); 
			}
			
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
	}
		public void forHashMapTest() {
			/*
			 * Create the new Hashmap to store the Integer, String pairs
			 * 
			 */
			
			HashMap<String, String> hm = new HashMap<String, String>();
		

			/*
			 * Add the following pairs into HashMap
			 * 
			 * key : 1 value : Windows key : 2 value : Ubuntu key : 3 value : OsX
			 * 
			 */
			
			hm.put("1", "Windows");
			hm.put("2", "Ubuntu");
			hm.put("3", "OsX");
			

			/*
			 * Print the size of the Hashmap
			 */
			
			System.out.println("Size of Haspmap:" + hm.size());

			/*
			 * poll the last added item in the hashmap
			 */
			String lastpool = Integer.toString(hm.size()-1);
			System.out.println(hm.get(lastpool));
			System.out.println("key is /t"+hm.get(0));

			/*
			 * remove 'Windows' from hashmap. And print the size of the hashmap
			 * 
			 * 
			 */
			
			hm.remove("1");
			
			
			System.out.println("Size of Haspmap after removal:" + hm.size());
			

			

		}
}
