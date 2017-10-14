
public class VacaHomeTest {

	public static void main(String[] args) {

		int siblings = 5;

		String vacationHomeLocation;

		if (siblings == 0) {
			vacationHomeLocation = "Paris, France";

		} else if (siblings == 1) {
			vacationHomeLocation = "Poconos, NY";

		} else if (siblings == 2) {
			vacationHomeLocation = "Santa Monica, CA";

		} else if (siblings == 3) {
			vacationHomeLocation = "Orlando. FL";

		} else if (siblings == 4) {
			vacationHomeLocation = "Pigeon Forge, TN";

		} else {
			vacationHomeLocation = "Alderaan";
		}
		System.out.println(vacationHomeLocation);

	}
}
