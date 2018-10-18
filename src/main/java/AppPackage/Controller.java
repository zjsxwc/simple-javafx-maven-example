package AppPackage;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    @FXML
    private Button myButtonSayHello;

    @FXML
    private TextField myTextField;

    public void sayHelloAction(ActionEvent event) {
        System.out.println("Button Clicked!");
        Alert information = new Alert(Alert.AlertType.INFORMATION, "哈哈哈哈");
        information.setTitle("呵呵呵"); //设置标题，不设置默认标题为本地语言的information
        information.setHeaderText("点击hello按钮"); //设置头标题，默认标题为本地语言的information
        information.showAndWait();
        information = null;

        Date now = new Date();

        DateFormat df = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        String dateTimeString = df.format(now);
        myTextField.setText(dateTimeString);
    }

}
