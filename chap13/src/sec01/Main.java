package sec01;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		String removeElem = "Perl";
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove:");
        System.out.println(myList);
        
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
               if(removeElem.equals(itr.next())){
                   itr.remove();
               }
        }
        System.out.println("After remove:");
        System.out.println(myList); 
	}

}
