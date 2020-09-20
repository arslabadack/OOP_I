package UI_FX;

import entities.GameEvents;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EditEvents_FX extends Application {
    private Stage stage;
    private Label lblAddEvents;
    private ImageView game;
    private TextField eventNameTxt;
    private TextField eventDateTxt;
    private TextField eventLocalTxt;
    private TextField eventDescriptionTxt;
    private TextField gameNameTxt;
    private Button saveBtn;
    private Button cancelBtn;
    private Pane pane;
    private GameEvents gameEv;

    public EditEvents_FX(GameEvents gameEv) {
	this.gameEv = gameEv;
    }

    @Override
    public void start(Stage stage) throws Exception {
	this.stage = stage;

	initComponents();
	configLayout();

	Scene scene = new Scene(pane);
	saveBtn.requestFocus();

	stage.setScene(scene);
	stage.setTitle("Skynet");
	stage.setResizable(false);
	stage.show();
    }

    private void initComponents() {

	eventNameTxt = new TextField();
	eventNameTxt.setPromptText("EVENT NAME");
	eventNameTxt.styleProperty().set(
		"-fx-text-fill: #778899; -fx-border-color: #4169E1; -fx-border-radius: 0; -fx-background-color: #F8F8FF;");

	eventDateTxt = new TextField();
	eventDateTxt.setPromptText("SAVE THE DATE");
	eventDateTxt.styleProperty().set(
		"-fx-text-fill: #778899; -fx-border-color: #4169E1; -fx-border-radius: 0; -fx-background-color: #F8F8FF;");

	eventLocalTxt = new TextField();
	eventLocalTxt.setPromptText("EVENT LOCAL");
	eventLocalTxt.styleProperty().set(
		"-fx-text-fill: #778899; -fx-border-color: #4169E1; -fx-border-radius: 0; -fx-background-color: #F8F8FF;");

	eventDescriptionTxt = new TextField();
	eventDescriptionTxt.setPromptText("EVENT DESCRIPTION");
	eventDescriptionTxt.styleProperty().set(
		"-fx-text-fill: #778899; -fx-border-color: #4169E1; -fx-border-radius: 0; -fx-background-color: #F8F8FF;");

	gameNameTxt = new TextField();
	gameNameTxt.setPromptText("MAIN GAME NAME");
	gameNameTxt.styleProperty().set(
		"-fx-text-fill: #778899; -fx-border-color: #4169E1; -fx-border-radius: 0; -fx-background-color: #F8F8FF;");

	saveBtn = new Button("SAVE");
	saveBtn.setOnAction(save());
	saveBtn.styleProperty().set(
		"-fx-text-fill: #FFFFFF; -fx-border-color: #4169E1; -fx-border-radius: 0; -fx-background-color: #4169E1;");

	cancelBtn = new Button("CANCEL");
	cancelBtn.setOnAction(cancel());
	cancelBtn.styleProperty().set(
		"-fx-text-fill: #FFFFFF; -fx-border-color: #4169E1; -fx-border-radius: 0; -fx-background-color: #4169E1;");

	pane = new AnchorPane();
	pane.styleProperty().set("-fx-background-color: #3E3E3E");

	pane.getChildren().addAll(nameLbl, birthLbl, nationalityLbl, sexLbl, heightLbl, nameTxt, birthTxt,
		nationalityTxt, heightTxt, maleRadio, femaleRadio, saveBtn, cancelBtn);
    }
//	
//	private void configLayout() {
//		pane.setPrefSize(400, 260);
//		
//		nameLbl.setLayoutX(20);
//		nameLbl.setLayoutY(20);
//		
//		nameTxt.setLayoutX(20);
//		nameTxt.setLayoutY(40);
//		nameTxt.setPrefHeight(20);
//		nameTxt.setPrefWidth(pane.getPrefWidth() - 40);
//		
//		birthLbl.setLayoutX(20);
//		birthLbl.setLayoutY(80);
//		
//		birthTxt.setLayoutX(20);
//		birthTxt.setLayoutY(100);
//		birthTxt.setPrefHeight(20);
//		birthTxt.setPrefWidth((pane.getPrefWidth() - 60) / 2);
//		
//		nationalityLbl.setLayoutX(210);
//		nationalityLbl.setLayoutY(80);
//		
//		nationalityTxt.setLayoutX(210);
//		nationalityTxt.setLayoutY(100);
//		nationalityTxt.setPrefHeight(20);
//		nationalityTxt.setPrefWidth((pane.getPrefWidth() - 60) / 2);
//		
//		heightLbl.setLayoutX(20);
//		heightLbl.setLayoutY(140);
//		
//		heightTxt.setLayoutX(20);
//		heightTxt.setLayoutY(160);
//		heightTxt.setPrefHeight(20);
//		heightTxt.setPrefWidth((pane.getPrefWidth() - 60) / 2);
//		
//		sexLbl.setLayoutX(210);
//		sexLbl.setLayoutY(140);
//		
//		maleRadio.setLayoutX(210);
//		maleRadio.setLayoutY(163);
//		maleRadio.setPrefHeight(20);
//		maleRadio.setPrefWidth((pane.getPrefWidth() - 60) / 4);
//		
//		femaleRadio.setLayoutX(305);
//		femaleRadio.setLayoutY(163);
//		femaleRadio.setPrefHeight(20);
//		femaleRadio.setPrefWidth((pane.getPrefWidth() - 60) / 4);
//		
//		saveBtn.setLayoutX(20);
//		saveBtn.setLayoutY(210);
//		saveBtn.setPrefHeight(20);
//		saveBtn.setPrefWidth((pane.getPrefWidth() - 60) / 2);
//		
//		cancelBtn.setLayoutX(210);
//		cancelBtn.setLayoutY(210);
//		cancelBtn.setPrefHeight(20);
//		cancelBtn.setPrefWidth((pane.getPrefWidth() - 60) / 2);
//		
//	}
//	
//	private EventHandler<ActionEvent> setMale() {
//		return new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				if (femaleRadio.isSelected()) {
//					femaleRadio.setSelected(false);
//				}
//				maleRadio.setSelected(true);
//			}
//		};
//	}
//	
//	private EventHandler<ActionEvent> setFemale() {
//		return new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				if (maleRadio.isSelected()) {
//					maleRadio.setSelected(false);
//				}
//				femaleRadio.setSelected(true);
//			}
//		};
//	}
//	
//	private EventHandler<ActionEvent> save() {
//		return new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				try {
//					if (nameTxt.getText().isEmpty()) {
//						Alert_FX.alert("Name field is empty");
//						return;
//					}
//					if (birthTxt.getText().isEmpty()) {
//						Alert_FX.alert("Birth date field is empty");
//						return;
//					}
//					if (nationalityTxt.getText().isEmpty()) {
//						Alert_FX.alert("Nationality field is empty");
//						return;
//					}
//					if (heightTxt.getText().isEmpty()) {
//						Alert_FX.alert("Height field is empty");
//						return;
//					} else if (heightTxt.getText().contains(",")) {
//						Alert_FX.alert("Please use '.' instead of ',' for the height");
//						return;
//					}
//					if (!maleRadio.isSelected() && !femaleRadio.isSelected()) {
//						Alert_FX.alert("Selecet a sex for the actor");
//						return;
//					}
//					
//					String sex = "";
//					
//					if (maleRadio.isSelected()) {
//						sex = "M";
//					} else if (femaleRadio.isSelected()) {
//						sex = "F";
//					}
//					
//					new ProtagonistDAO().add(
//							new Protagonist(nameTxt.getText(), birthTxt.getText(), nationalityTxt.getText(), sex, Float.valueOf(heightTxt.getText())));
//					
//					openActorWindow();
//				} catch (Exception e) {
//					Alert_FX.error("Inable to save the actor!");
//				}
//			}
//		};
//	}
//
//	private void openActorWindow() {
//		try {
//			new ActorFX().start(stage);
//		} catch (Exception e) {
//			Alert_FX.error("Inable to open the actor window");
//		}
//	}
//	
//	private EventHandler<ActionEvent> cancel() {
//		return new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				try {
//					new ActorFX().start(stage);
//				} catch (Exception e) {
//					Alert_FX.error("Inable to open the actor's window!");
//				}
//			}
//		};
//	}

}
