package l06;
import java.io.Serializable;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class textReplace implements Serializable {

	
public static void replace() {
	String str = "Буває таке мовчання коли слова не потрібні і це означає не кінець а початок розуміння"; 
	
    String[] words = str.split(" ");
    
    ArrayList<String> arrayList1 = new ArrayList<> (); 
     for(String subStr:words) {
    	 arrayList1.add(subStr);
     }  

   
    System.out.println("toString():" + arrayList1.toString());
    
    System.out.println("add(String string):" + arrayList1.add("Джонатан Коу"));
    
    System.out.println("remove(String string):" + arrayList1.remove("початок розуміння"));
    
    String arraylist2[] = new String[arrayList1.size()];
    arraylist2 = arrayList1.toArray(arraylist2);
    arrayList1.toArray(arraylist2);
    for (String item : arraylist2) {
        System.out.println("Item in Object[] toArray() = " + item);
    }
    
    System.out.println("size():" + arrayList1.size());
    
    System.out.println("contains(String string):" + arrayList1.contains("Буває"));
    
    List<String> listTemp = new ArrayList<String>();
    listTemp.add("Найпростіші речі");
    listTemp.add("можуть змусити");
    listTemp.add("вмирати від щастя.");
    System.out.println("containsAll(Container container):" + arrayList1.contains(listTemp));
    
    String wordDel = "слова";
    String word;
    
    Iterator<String> iterator = arrayList1.iterator();
   
    while(iterator.hasNext()) {
    	word = iterator.next();
    	System.out.println("Iterator has next, word is - " + word);
    	if (wordDel.equals(word)) {
    		iterator.remove();
    		System.out.println("Word '" + word + "' was be deleted");
    		}
   		}
    	System.out.print("\n\n");
	}
}
