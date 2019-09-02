package cs1302.gallery;

import javafx.stage.Stage;

import javafx.application.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.TilePaneBuilder;




public class GalleryApp extends Application  {

	/** @inheritdoc */
		
		VBox root= new VBox();
		Stage stage;
		HBox hbox;
		Button pause;
		Label searchQ;
		TextField urlS;
		Button updateSearch;
		TilePane tile;
		//scene already compatible w/ vbox. 
		Scene scene = new Scene(root);
	
		
		
		
		
		
		MenuBarClass menuObj = new MenuBarClass();
		
	
	    
	    public void start(Stage stage) {
		/**
		 * root.getChil add everything to vbox 
		 * hbox next
		 * left to right
		 * then grid 
		 */
	    	hbox = new HBox();
	    	pause = new Button("Pause");
	    	searchQ = new Label("Search Query");
	    	urlS = new TextField("");
	    	updateSearch = new Button("Update Search");
	    	tile=  new TilePane(); //tilePane
	    	
	    	
	    	root.getChildren().add(menuObj);
	    	root.getChildren().add(hbox);
	    	hbox.getChildren().addAll(pause,searchQ,urlS,updateSearch);
	   
	    	
	    	/**The following is the horizontal tilepane API example */
	    	tile.setHgap(8);
	    	tile.setPrefColumns(5);
	    	ImageView newImg = new ImageView("https://itunes.apple.com/search?term=jack+johnson");
	    	for (int i=0; i < 20; i++) {
	    		tile.getChildren().add(newImg);
	    	 	
	    	}
	    	*/
	    	stage.setMaxWidth(640);
	    	stage.setMaxHeight(480);
	    	stage.setTitle("GalleryApp!");
	    	stage.setScene(scene);
	    	stage.show();
		
	    } // main
	    
	    public static void main(String[] args) {
	    	Application.launch(args);
	    }

	} // ImageApp

