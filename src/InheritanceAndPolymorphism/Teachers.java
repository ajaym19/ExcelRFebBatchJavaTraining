package InheritanceAndPolymorphism;

public class Teachers extends SchoolBase{

	public void deliverSessions() {
		System.out.println("Devivering Sessions");
	}

	public void evaluateAssignments() {
		System.out.println("Evaluating Assignments");
	}
	
	@Override
	public void doExercise() {
		System.out.println("Performing Exercise for 30 mins");
	}

}
