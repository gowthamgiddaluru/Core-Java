package Trail;

class OuterClass{
	int x=2;
	
	class InnerClass{
		int y =3;
	}
}

public class InnerClasses {	
	public static void main(String[] args) {
		OuterClass myOuterClass = new OuterClass();
		OuterClass.InnerClass myInnerClass= myOuterClass.new InnerClass();
		System.out.println(myOuterClass.x + myInnerClass.y);

	}
}
