package com.example.praktika;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button ButtonChoice;

    @FXML
    private ListView<String> ListAll;
    JOptionPane JOptionPane;

    @FXML
    void ButtonChoiceClick(ActionEvent event) {

        String message = ""; //объект в которой записывается значение о выборе
        ObservableList<String> movies; //объект листа который мы выбрали и записываем месэндж
        movies = ListAll.getSelectionModel().getSelectedItems();

        for (String m: movies){ //перебираем объекты
            message += m; //записываем в мессэдж
        }

        if(message.equals("")){

            JOptionPane.showMessageDialog(null, "Ошибка. Выберете препарат!");
        }
        else {
            ButtonChoice.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("window2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root, 600, 400);
            Label label = (Label) scene.lookup("#coll");
            Label label1 = (Label) scene.lookup("#aprel_col");
            Label label2 = (Label) scene.lookup("#col24");
            Label label3 = (Label) scene.lookup("#colHeath");
            Label label4 = (Label) scene.lookup("#vita_col");
            label.setText(message);
            if (message.equals("парацетамол")) {
                label1.setText("25");
                label2.setText("71");
                label3.setText("79");
                label4.setText("57");
            }
            if (message.equals("сумамед")) {
                label1.setText("353");
                label2.setText("196");
                label3.setText("395");
                label4.setText("245");
            }
            if (message.equals("пектусин")) {
                label1.setText("54");
                label2.setText("79");
                label3.setText("110");
                label4.setText("62");
            }
            if (message.equals("пентальгин")) {
                label1.setText("111");
                label2.setText("163");
                label3.setText("147");
                label4.setText("123");
            }
            if (message.equals("нурофен")) {
                label1.setText("200");
                label2.setText("95");
                label3.setText("107");
                label4.setText("165");
            }
            if (message.equals("полисорб")) {
                label1.setText("275");
                label2.setText("486");
                label3.setText("143");
                label4.setText("471");
            }
            if (message.equals("панкреатин")) {
                label1.setText("62");
                label2.setText("54");
                label3.setText("58");
                label4.setText("77");
            }
            if (message.equals("тантум ферде")) {
                label1.setText("436");
                label2.setText("612");
                label3.setText("462");
                label4.setText("576");
            }
            if (message.equals("лизобакт")) {
                label1.setText("314");
                label2.setText("408");
                label3.setText("356");
                label4.setText("378");
            }
            if (message.equals("мукалтин")) {
                label1.setText("127");
                label2.setText("156");
                label3.setText("122");
                label4.setText("122");
            }
            if (message.equals("мирамистин")) {
                label1.setText("527");
                label2.setText("625");
                label3.setText("587");
                label4.setText("610");
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       ListAll.getItems().addAll("парацетамол", "сумамед", "пектусин", "пентальгин", "нурофен", "полисорб", "панкреатин", "тантум ферде","лизобакт", "мукалтин", "мирамистин");
       ListAll.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}
