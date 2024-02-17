import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridPaneExample extends Application {

    private static final double PREF_WIDTH = 300; // preferred width
    private static final double PREF_HEIGHT = 150; // preferred height

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane gridPane = new GridPane();

        // Load images
        Image image1 = new Image("file:C:\\Users\\david\\OneDrive\\Desktop\\programmingMO5-01\\14-1 Images\\Images\\flag1.gif");
        Image image2 = new Image("file:C:\\Users\\david\\OneDrive\\Desktop\\programmingMO5-01\\14-1 Images\\Images\\flag2.gif");
        Image image3 = new Image("file:C:\\Users\\david\\OneDrive\\Desktop\\programmingMO5-01\\14-1 Images\\Images\\flag6.gif");
        Image image4 = new Image("file:C:\\Users\\david\\OneDrive\\Desktop\\programmingMO5-01\\14-1 Images\\Images\\flag7.gif");

        // Create ImageView for each image and set their size
        ImageView imageView1 = createImageView(image1);
        ImageView imageView2 = createImageView(image2);
        ImageView imageView3 = createImageView(image3);
        ImageView imageView4 = createImageView(image4);

        // Add ImageViews to the grid pane
        gridPane.add(imageView1, 0, 0); // Column=0, Row=0
        gridPane.add(imageView2, 1, 0); // Column=1, Row=0
        gridPane.add(imageView3, 0, 1); // Column=0, Row=1
        gridPane.add(imageView4, 1, 1); // Column=1, Row=1

        // Adjust padding and gaps if necessary
        gridPane.setVgap(5); // vertical gap
        gridPane.setHgap(5); // horizontal gap

        // Setting the Scene
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Image Grid Pane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ImageView createImageView(Image image) {
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(PREF_WIDTH);
        imageView.setFitHeight(PREF_HEIGHT);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

        // Load images
        

