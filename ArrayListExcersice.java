import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExcersice {
	
	public static void main(String [] args) {
		
		List<Name> Namesetting = new ArrayList<>();
		
		
		Namesetting.add(new Name("Asif", "Arathy", "Arya", "Ahwas"));
		
		System.out.println(Namesetting);
		
		Iterator<Name> iterator = Namesetting.iterator();
	
		
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
	
			ListIterator<Name> iiterator = Namesetting.listIterator(Namesetting.size());
			
			while(iiterator.hasPrevious()) {
				System.out.println(iiterator.previous());
			}
	}
	

}

class Name {
	private String Name1 ;
	private String Name2;
	private String Name3;
	private String Name4;
	public String getName1() {
		return Name1;
	}
	public void setName1(String name1) {
		Name1 = name1;
	}
	public String getName2() {
		return Name2;
	}
	public void setName2(String name2) {
		Name2 = name2;
	}
	public String getName3() {
		return Name3;
	}
	public void setName3(String name3) {
		Name3 = name3;
	}
	public String getName4() {
		return Name4;
	}
	public void setName4(String name4) {
		Name4 = name4;
	}
	public Name(String name1, String name2, String name3, String name4) {
		super();
		Name1 = name1;
		Name2 = name2;
		Name3 = name3;
		Name4 = name4;
	}
	@Override
	public String toString() {
		return "Name [Name1=" + Name1 + ", Name2=" + Name2 + ", Name3=" + Name3 + ", Name4=" + Name4 + "]";
	}
	
	
}











