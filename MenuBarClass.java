package cs1302.gallery;

import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;


public class MenuBarClass extends MenuBar {

	
	
	final Menu menu1=new Menu("File");
	final MenuItem item1 = new MenuItem("Exit");
	
	
	/**
	 * Adds menu. 
	 */
	public MenuBarClass() {
		
		this.getMenus().add(menu1);
		menu1.getItems().add(item1);
		
	}
}
