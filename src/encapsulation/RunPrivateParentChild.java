package encapsulation;

import inheritance.ChildClass;
import inheritance.ParentClass;

public class RunPrivateParentChild {

	public static void main(String[] args) {
		
		ParentClass po = new ParentClass();
		ChildClass co = new ChildClass();
		
		po.getparentMethod();
		co.childMethod();
	}
}
