/**
 * 
 */

/**
 * @author DAn Dan
 *
 */
public class Manager extends Employe{
	public void startProjectWork() {
		meetingWithCustomer();
		defineProjectSchedule();
		assignRespToTeam();
		}
		private void meetingWithCustomer() {
		System.out.println(" startProjectWork Manager meet Customer");
		}
		private void defineProjectSchedule() {
		System.out.println(" startProjectWork Manager Project Schedule");
		}
		private void assignRespToTeam() {
		System.out.println(" startProjectWork Manager team work starts");
		}
}
