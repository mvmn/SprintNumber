package x.mvmn.misc.sprintnumber;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SprintNumber {

	public static void main(String[] args) {
		if (args.length > 3) {
			try {
				System.out.println((int) Math.ceil(
						ChronoUnit.WEEKS.between(LocalDate.of(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])), LocalDate.now())
								/ Integer.parseInt(args[3])));
			} catch (NumberFormatException nfe) {
				fail("Incorrect input - non integer value supplied.");
			}
		} else {
			fail("Insufficient parameters provided.");
		}
	}

	protected static void fail(String reason) {
		System.err.println(reason + " Parameters should be: <year> <month> <date> <sprint length in weeks> - where each parameter is an integer number.");
		System.exit(-1);
	}
}
