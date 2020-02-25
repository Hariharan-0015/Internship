package intern;
import java.util.*;
//Sample Program of ArrayList
public class ArrarListDemo {

	public static void main(String[] args) {
	
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Hariharan");
		al.add(15);
		al.add(null);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(1,1999);
		al.add("M");
		System.out.println(al);
	}

}
