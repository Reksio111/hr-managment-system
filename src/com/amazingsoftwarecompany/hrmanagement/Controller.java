package com.amazingsoftwarecompany.hrmanagement;

public class Controller {

	public static void main(String[] args) {

		Controller controller = new Controller();

		controller.run();

	}

	private void run() {

		Menu menu = new Menu();

		menu.showMenu();
	}

}
