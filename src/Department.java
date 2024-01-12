public abstract class Department {
    abstract int getdepartmenSize();

    public static void main(String[] args) {

        Subdepartment sub1 = new Subdepartment();

        System.out.println("The Department Size is "+ sub1.getdepartmenSize());

	}
}

