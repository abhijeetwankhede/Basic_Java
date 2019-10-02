package StringBuilderAssignment1;

import java.util.Date;

public class SectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Section section = new Section();
		section.setName("core_java");
		section.setId(101);
		section.setDate(new Date());

		System.out.println(section.showSectionDetail());



	}

}
