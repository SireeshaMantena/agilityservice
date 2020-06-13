package JavaBasics;

public class StringConcatnation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 100;
		int b= 200;
		
		String x= " hello";
		String y= " Agility";
		
		System.out.println(x+y);//helloagility.
		System.out.println(a+b);//300
		System.out.println(x+y+a+b);//helloworld100200
		System.out.println(a+b+x+y);//300helloworld
	System.out.println(a+x+y+b);//100helloworld200
	System.out.println(a+b+y);//300agility
	System.out.println(x+y+(a+b));//helloagility300
	
		
		

	}

}
