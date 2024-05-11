package arrayExample;

public class studentMarksheet {
	
	public static void printSubjectMarks(int[] marks) {
		
		String[] subjects = {"Math", "English", "Nepali", "Computer",
				"Science"};
		for(int i=0; i<marks.length; i++) {
			System.out.println(subjects[i]+":"+marks[i]);
		}
	}
	
	public void calculateTotal() {
		
		int total = 0;
		int fullmark =500;
		int obtmarks[] = {99,80,87,88,69};
		
		for(int i=0; i<obtmarks.length; i++){
			total=total+obtmarks[i];
		}
		float percentage = (total*100)/fullmark;
		System.out.println("Total marks:"+total);
		System.out.println("Percentage:"+percentage);
				
	}
	
	public static void main(String[] args) {
		int[] obtmarks = {99,80,87,88,69};
		printSubjectMarks(obtmarks);
		
		System.out.println("-------------------");
		
		studentMarksheet sm = new studentMarksheet();
		sm.calculateTotal();
	}

}
