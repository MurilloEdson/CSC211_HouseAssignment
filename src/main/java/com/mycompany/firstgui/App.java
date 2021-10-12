package com.mycompany.firstgui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) 
    {
        int i = 0;
        Rectangle sky = new Rectangle(0,0,550,200);//The sky is created
        sky.setFill(Color.ALICEBLUE);
        Rectangle ground = new Rectangle(0,200,550,280);//The ground is created
        ground.setFill(Color.LIMEGREEN);
        Rectangle front = new Rectangle(100,100,360,320);//The main wall is crated
        front.setFill(Color.BROWN);
        Rectangle roofBottom = new Rectangle(100,100,360,20);//The wall under  the roof is created
        roofBottom.setFill(Color.WHITE);
        roofBottom.setStroke(Color.BLACK);
        Rectangle plaque = new Rectangle(255,140,50,30);//The plaque is created
        plaque.setFill(Color.GREY);
        plaque.setStroke(Color.BLACK);
        Rectangle floor = new Rectangle(100,300,360,10);//The main floor is created
        floor.setFill(Color.GREY);
        floor.setStroke(Color.BLACK);
        Polygon roof = new Polygon();//The roof is created
        roof.getPoints().addAll(275.0, 0.0, 50.0, 100.0, 500.0, 100.0);
        roof.setFill(Color.WHITE);
        roof.setStroke(Color.BLACK);
 
        Group gp = new Group(sky, ground, roof,front,roofBottom, plaque,floor);//Most objects are put into one group
        
        for(i = 0; i < 4; i++){ // The 4 main pillars are created
            Rectangle pillar = new Rectangle((110 + i * 103),120,30,180);
            pillar.setFill(Color.WHITE);
            pillar.setStroke(Color.BLACK);
            gp.getChildren().add(pillar);}
        
        for(i = 0; i < 4; i++){// The 4 bases of the pillars are created
            Rectangle pillarBottom = new Rectangle((100 + i * 103),290,50,10);
            pillarBottom.setFill(Color.WHITE);
            pillarBottom.setStroke(Color.BLACK);
            gp.getChildren().add(pillarBottom);}
        
        for(i = 0; i < 4; i++){// The circles around the top left of the pillars are created 
            Circle accentsL = new Circle(110 + (i * 103), 130, 10, Color.WHITE);
            accentsL.setStroke(Color.BLACK);
            gp.getChildren().add(accentsL);}
        
        for(i = 0; i < 4; i++){//The circles around teh top right of the pillars are created
            Circle accentsR = new Circle(140 + (i * 103), 130, 10, Color.WHITE);
            accentsR.setStroke(Color.BLACK);
            gp.getChildren().add(accentsR);}
        Rectangle[] stairs = new Rectangle[11];
        
        for(i = 0; i < 11; i++){//The stairs are created
            stairs[i] = new Rectangle(150 - (i*10),300 + (i*11),260 + (i*20),10);
            stairs[i].setFill(Color.GREY);
            stairs[i].setStroke(Color.BLACK);
            gp.getChildren().add(stairs[i]);}
        
        for(i = 0; i < 3; i++){//The doors are created
            Rectangle doors = new Rectangle((156 + i * 103),210 - (i%2 * 15),40,90 + (i%2 * 15));
            doors.setFill(Color.WHITE);
            doors.setStroke(Color.BLACK);
            gp.getChildren().add(doors);}
        
        for(i = 0; i < 10; i++){//The windows on the first door are created
            Rectangle windows1 = new Rectangle((160 + (i%2 * 20)),220 + (i%5 * 15),10,10);
            windows1.setFill(Color.BLACK);
            gp.getChildren().add(windows1);}
        
        for(i = 0; i < 10; i++){//The windows on the second door are created
            Rectangle windows2 = new Rectangle((263 + (i%2 * 20)),220 + (i%5 * 15),10,10);
            windows2.setFill(Color.BLACK);
            gp.getChildren().add(windows2);}
        
        for(i = 0; i < 10; i++){//The windows on the third door are created
            Rectangle windows3 = new Rectangle((366 + (i%2 * 20)),220 + (i%5 * 15),10,10);
            windows3.setFill(Color.BLACK);
            gp.getChildren().add(windows3);}
        
        Scene scene = new Scene(gp, 550, 480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}