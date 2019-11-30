package ErweiterungenStudent;

public class StudentMain {

	public static void main(String[] args) {
		Student[] studenten = new Student[2];
		studenten[0] = new Student ("Hannes", "Dreyer", "03.05.2000", 123456789, 13);
		studenten[1] = new Student ("Sennah", "Reyerd", "05.03.2000", 987654321, 31);
		for (Student i: studenten) {
			i.setTelnr("Privat", "0521 - "+(int)(Math.random()*10000000+10000));
			i.setTelnr("A", "05245456456");
			System.out.println(i);
		}
		
	}

}
