package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Controller {
    public TextField nametf;
    public TextField surnametf;
    public Button addbtn;
    public TextField grouptf;
    public TextField yeartf;
    public Button Savebtn;
    public Button Openbtn;
    public TextField savetf;
    public TextField opentf;
    public Label textlbl;


    public void handleButtonAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == addbtn) {
            String tmp = textlbl.getText();
            textlbl.setText(tmp + getalltext());

        }
        else if (actionEvent.getSource() == Savebtn) {
            Savetofile();
        }
        else if (actionEvent.getSource() == Openbtn) {
            ReadFile();
        }
    }

    private String ReadFile() {
        try {

            String text = opentf.getText();
            String all = Files.readString(Path.of(text));
            textlbl.setText(all);
            System.out.println(all);

            return "File read";
        }
        catch (Exception e){
            textlbl.setText("no such file or you forgot .txt");
            return "File not read";
        }

    }

    private String getalltext() {
        String text = nametf.getText() +" " +surnametf.getText() +" " + grouptf.getText() +" " + yeartf.getText()+"\n";
        System.out.println(text);
        return text;
    }

    private String Savetofile() {
        try {
            String name = savetf.getText();
            FileWriter writer = new FileWriter(name, true);
            writer.write(textlbl.getText());
            writer.close();
            System.out.println("Success");
            return "Success";
        }

        catch (Exception e){
            System.out.println("gg");
            textlbl.setText("Something went wrong");
            return "Failed";
        }


    }
}
