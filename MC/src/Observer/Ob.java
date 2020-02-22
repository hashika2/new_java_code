package Observer;

import java.util.Observable;
import java.util.Observer;

public class Ob {

	public static void main(String[] args) {
		Ob ob=new Ob();
		ob.test();
	}
	void test() {
		DataObserver o=new DataObserver("hashika",23);
		ObserverObject oo1=new ObserverObject();
		ObserverObject2 oo2=new ObserverObject2();
		o.addObserver(oo1);
		o.addObserver(oo2);
		//oo2.update(o, arg1);
		o.setAge(24);
		
		
		System.out.println(o.countObservers());
	}

}

class DataObserver extends Observable{
	
	int age;
	String name;
	
	DataObserver(String name,int age){
		name=name;
		age=age;
		
	}
	
	void setAge(int age) {
		age=age;
		setChanged();
		notifyObservers(age);
	}
	


	@Override
	public String toString() {
		return "DataObserver [age=" + age + ", name=" + name + "]";
	}
}

class ObserverObject implements Observer{

	@Override
	public void update(Observable o	, Object age) {
	System.out.println("Object "+ age +" updated");
		
	}
	
}
class ObserverObject2 implements Observer{

	@Override
	public void update(Observable o	, Object arg1) {
	System.out.println("Object"+ o +"updated success");
		
	}
	
}

