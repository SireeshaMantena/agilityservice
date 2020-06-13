package JavaBasics;

public class traingle extends abstractionex{
	traingle(){
		System.out.println(" im traingle constructor");
	}
	

	public static void main(String[] args) {
		abstractionex  obj= new traingle();
	obj.shape();
	obj.rectangle();
	traingle t= new traingle();
	
	}

	@Override
	void shape() {
		System.out.println("im shape of somethong");
	}

}
