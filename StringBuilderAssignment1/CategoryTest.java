package StringBuilderAssignment1;

import java.util.Date;

public class CategoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Category category = new Category();
		category.setName("javabasic");
		category.setId(101);
		category.setDate(new Date());
		System.out.println(category.showCategoryDetail());
	}

}
