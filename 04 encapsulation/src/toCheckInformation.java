import java.util.Random;

public class toCheckInformation {

	private String firsName;
	private String lastName;
	private String peopleInfo;

	public toCheckInformation() {}

	public toCheckInformation(String firsName, String lastName, String peopleInfo) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.peopleInfo = peopleInfo;
	}

	public void name() {

		if (peopleInfo != null) {
			Random random = new Random();
			
			System.out.println("You information : " + getPeopleInfo());
			System.out.println("you number : " + random.nextInt(100));
		}
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPeopleInfo() {
		return peopleInfo;
	}

	private boolean check = false;

	public void setPeopleInfo(String peopleInfo) {
		if (10 < peopleInfo.length() && peopleInfo.length() < 15) {
			for (int i = 0; i < peopleInfo.length(); i++) {
				char caracter = peopleInfo.charAt(i);
				
				if (Character.isDigit(caracter)) {
					check = true;
				} else {
					check = false;
					break;
				}
			}

		} else {
			write("Not between 10 and 15");

		}
		if (!check) {

			write("Error");

		} else {
			this.peopleInfo = peopleInfo;
		}
	}
	
	public void write(String info) {
		System.out.println(info);
	}

}
