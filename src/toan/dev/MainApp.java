package toan.dev;
import java.util.Scanner;
import toan.dev.data.dao.CategoryDao;
import toan.dev.data.impl.CategoryImpl;
import toan.dev.data.model.Category;

import toan.dev.data.dao.UserDao;
import toan.dev.data.impl.UserImpl;
import toan.dev.data.model.User;

public class MainApp {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		CategoryDao categoryDao = new CategoryImpl();
		
		UserDao  userDao = new UserImpl();
		
		Category category = new Category("Ao da", "mo ta");
		categoryDao.insert(category);
		
//		System.out.println("Nhập email người dùng:");
//		String userEmail = scanner.nextLine();
//		System.out.println("Nhập mật khẩu người dùng:");
//		String userPassword = scanner.nextLine();
//		System.out.println("Nhập vai trò người dùng:");
//		String userRole = scanner.nextLine();
		User  user = new User("tranquoctoan030804@gmailcom", "@Dmin1234", "Quan ly");
		userDao.insert(user);
	}

}
