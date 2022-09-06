package com.cogent.jdbcnew;
import com.cogent.*;

public class Tester {

	
	
	public static void main(String[] args) {

			BusinessLogic bLogic = new BusinessLogic();
					try {
						//bLogic.addBooks();
						//bLogic.deleteBook();
						bLogic.displayBooks();
					} catch (Throwable e) {
						e.printStackTrace();
					}
		
		}

}