package InheritanceAndPolymorphism;

public class Application {

	public static void main(String[] args) {
		Students std = new Students();
		std.attendSessions();
		std.markAttendance();
		std.doExercise();
		
		Teachers t = new Teachers();
		t.deliverSessions();
		t.markAttendance();
		t.doExercise();
	}
}
