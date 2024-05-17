package inheritance;

public class RunParentChild {

	public static void main(String[] args) {
		
		ParentClass pc = new ParentClass();
		ChildClass cc = new ChildClass();
		
		pc.parentMethod();
		cc.childMethod();
		cc.parentMethod();
	}
}
