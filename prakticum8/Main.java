package eenpackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.*;
 
public class Main extends Application implements EventHandler<ActionEvent> {
	
	public Hotel boekingHotel = new Hotel("Avondrust");
	public LocalDate vandaag = LocalDate.now();
	public LocalDate morgen = vandaag.plus(1, ChronoUnit.DAYS);
	
    public static void main(String[] args) {
        launch(args);
    }
  
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        
        Label titel = new Label("Voer uw gegevens in:");
        
        Label naamLabel = new Label("Naam:");
        TextField naamInput = new TextField();
        
        Label adresLabel = new Label("Adres:");
        TextField adresInput = new TextField();
        
        Label aankomstLabel = new Label("Aankomstdatum: ");
        DatePicker aankomstInput = new DatePicker(this.vandaag);
        
        Label vertrekLabel = new Label("Vertrekdatum: ");
        DatePicker vertrekInput = new DatePicker(this.morgen);
        
        Label kamerLabel = new Label("Kamertype: ");
        ComboBox<KamerType> kamerBox = new ComboBox<>();
        
		HBox buttonBox = new HBox();
		buttonBox.setSpacing(8);

		Button resetButton = new Button("Reset");
		Button boekButton= new Button("Boek");

		HBox.setMargin(resetButton, new Insets(15, 20, 20, 190));
		HBox.setMargin(boekButton, new Insets(15, 20, 20, -10));

		HBox.setHgrow(buttonBox, Priority.ALWAYS);
		buttonBox.getChildren().addAll(
			resetButton, 
			boekButton
		);


        kamerBox.getItems().addAll(boekingHotel.getKamerTypen());
        
        FlowPane flow = new FlowPane();
        
    	flow.setHgap(16);
		flow.setVgap(16);
		flow.setPadding(new Insets(8));
		flow.setAlignment(Pos.TOP_LEFT);
        
        titel.setPrefWidth(400);
        naamLabel.setPrefWidth(100);
        adresLabel.setPrefWidth(100);
        aankomstLabel.setPrefWidth(100);
        vertrekLabel.setPrefWidth(100);
        kamerLabel.setPrefWidth(100);
        
        naamInput.setPrefWidth(200);
        adresInput.setPrefWidth(200);
        aankomstInput.setPrefWidth(200);
        vertrekInput.setPrefWidth(200);
        kamerBox.setPrefWidth(200);
        
        flow.getChildren().addAll(
        	titel,
        	naamLabel,
        	naamInput,
        	adresLabel,
        	adresInput,
        	aankomstLabel,
        	aankomstInput,
        	vertrekLabel,
        	vertrekInput,
        	kamerLabel,
        	kamerBox,
        	buttonBox
        );
        
        resetButton.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override 
    	    public void handle(ActionEvent e) {
    	    	System.out.println("Values zijn gereset.");
    	    	naamInput.clear();
    	    	adresInput.clear();
    	    }
    	});

        boekButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				
				LocalDate aankomst = aankomstInput.getValue();
				LocalDate vertrek = vertrekInput.getValue();
				String naam = naamInput.getText();
				String adres = adresInput.getText();
				KamerType gekozenKamerType = kamerBox.getValue();

				if(naamInput.getText().trim().equals("")) {
					System.out.println("Naam is leeg");
					titel.setText("Naam is leeg");
					return;
				} 
				if(adresInput.getText().trim().equals("")) {
					System.out.println("Adres is leeg");
					titel.setText("Adres is leeg");
					return;
				}
				if(aankomstInput.getValue() == null) {
					System.out.println("Aankomst  is leeg");
					titel.setText("Aankomst is leeg");
					return;
				}
				if(vertrekInput.getValue() == null) {
					System.out.println("Vertrek is leeg");
					titel.setText("Vertrek is leeg");
					return;
				}
				if (kamerBox.getValue() == null) {
					System.out.println("Kamertype is leeg");
					titel.setText("Kies een kamer type.");
					return;
				} 


				int kamerNummerDieIsGeboekt = boekingHotel.voegBoekingToe(
					aankomst,
					vertrek,
					naam,
					adres,						
					gekozenKamerType
				);
						
				System.out.println(kamerNummerDieIsGeboekt);
				System.out.println(boekingHotel);
				titel.setText("Boeking is gelukt.");


			}
        });
        
        primaryStage.setScene(new Scene(flow, 350, 350));
        primaryStage.show();
    }
}