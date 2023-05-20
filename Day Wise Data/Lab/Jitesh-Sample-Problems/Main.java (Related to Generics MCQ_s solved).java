import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<? extends Fruit> fruits=new ArrayList<Fruit>();
		List<? extends Fruit> fruits2=new ArrayList<Melon>();
		List<? extends Fruit> fruits3=new LinkedList<WaterMelon>();
		//List<? extends Fruit> fruits4=new Vector<Object>(); illegal
		List<? super Melon> melons=new ArrayList<Fruit>();
		List<? super Melon> melons2=new LinkedList<>();
		//List<? super Melon> melons3=new LinkedList<WaterMelon>(); illegal
		List<? super WaterMelon> melons3=new LinkedList<Melon>(); 
		
		
		

		List<Melon> melons4=new ArrayList<>();
		HashSet<Fruit> fruits4=new HashSet<>();
		LinkedList<WaterMelon> wMelons=new LinkedList<>();
		//melons4.addAll(fruits4); illegal
		fruits4.addAll(melons4);
		melons4.addAll(wMelons);
		fruits4.addAll(melons4);
		fruits4.addAll(wMelons);

		//wMelons.addAll(fruits4);illegal
		//wMelons.addAll(melons4); illegal
	}

}

class Fruit{}
class Melon extends Fruit{}
class WaterMelon extends Melon{}


