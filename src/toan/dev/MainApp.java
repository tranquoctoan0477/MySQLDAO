package toan.dev;

import toan.dev.data.dao.CategoryDao;
import toan.dev.data.impl.CategoryImpl;
import toan.dev.data.model.Category;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryDao categoryDao = new CategoryImpl();
		Category category = new Category("Ao da", "mo ta");
		categoryDao.insert(category);
	}

}
