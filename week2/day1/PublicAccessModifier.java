package week2.day1;

public class PublicAccessModifier {

	public void accessLevel() {

		System.out.println("This is from Public Access Modifier");
	}

	private void privateAccessLevel() {
		System.out.println("This is PrivateLevel Access Modifier");

	}

	protected void protectedAccessLevel() {
		System.out.println("This is protectedLevel Access Modifier");

	}

	void defaultAccessLevel() {
		System.out.println("This is defaultLevel Access Modifier");

	}

	public static void main(String[] args) {

		PublicAccessModifier pb = new PublicAccessModifier();
		pb.accessLevel();
		pb.privateAccessLevel();
		pb.protectedAccessLevel();
		pb.defaultAccessLevel();

	}

}
