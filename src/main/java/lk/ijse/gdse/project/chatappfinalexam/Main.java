package lk.ijse.gdse.project.chatappfinalexam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader serverLoader = new FXMLLoader(HelloApplication.class.getResource("/view/Sever.fxml"));
        Scene SeverScene = new Scene(serverLoader.load());
        stage.setTitle("Server Ui");
        stage.setScene(SeverScene);
        stage.show();

        FXMLLoader clientLoader = new FXMLLoader(HelloApplication.class.getResource("/view/Client.fxml"));
        Scene ClientScene = new Scene(clientLoader.load());
        stage.setTitle("Server Ui");
        stage.setScene(ClientScene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}