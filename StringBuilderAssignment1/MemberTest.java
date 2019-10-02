package StringBuilderAssignment1;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member();
		member.setFirstname("Pankaj ");
		member.setLastname("Sharma");
		member.setRole("Trainer");
		member.setPassword(12345);
		member.setEmail("sharma.pankaj@yash.com");
		System.out.println(member.showMemberDetail());


	}

}
