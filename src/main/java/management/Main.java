package management;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
//        TagManager tagManager = new TagManager();
//        tagManager.addKey("Polska");
//        tagManager.addKey("Francja");
//        tagManager.addKey("Niemcy");
//        tagManager.addKey("USA");
//        tagManager.addTag("Czerwony");
//        tagManager.addTag("Biały");
//        tagManager.addTag("Niebieski");
//        tagManager.addTag("Żółty");
//        tagManager.addTag("Czarny");
//        tagManager.connectTag(tagManager.findKey("Polska"), tagManager.findTag("Biały"));
//        tagManager.connectTag(tagManager.findKey("Polska"), tagManager.findTag("Czerwony"));
//        tagManager.connectTag(tagManager.findKey("Francja"), tagManager.findTag("Czerwony"));
//        tagManager.connectTag(tagManager.findKey("Francja"), tagManager.findTag("Niebieski"));
//        tagManager.connectTag(tagManager.findKey("Francja"), tagManager.findTag("Biały"));
//        tagManager.connectTag(tagManager.findKey("Niemcy"), tagManager.findTag("Czerwony"));
//        tagManager.connectTag(tagManager.findKey("Niemcy"), tagManager.findTag("Czarny"));
//        tagManager.connectTag(tagManager.findKey("Niemcy"), tagManager.findTag("Żółty"));
//        tagManager.connectTag(tagManager.findKey("USA"), tagManager.findTag("Niebieski"));
//        tagManager.connectTag(tagManager.findKey("USA"), tagManager.findTag("Biały"));
//        tagManager.connectTag(tagManager.findKey("USA"), tagManager.findTag("Czerwony"));
    }
}
