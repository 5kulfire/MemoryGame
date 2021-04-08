/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Main extends Application {
	
	ImageView lastClicked = null;
	Image Image1 = new Image("1.png");
	Image Image2 = new Image("2.png");
        Image Image3 = new Image("3.png");
        Image Image4 = new Image("4.png");
        Image Image5 = new Image("5.png");
        Image Image6 = new Image("6.png");
        Image Image7 = new Image("7.png");
        Image Image8 = new Image("8.png");
	Image pImage = new Image("c.png");
        int a,b,c,d,e,f,g,h,score=0;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,515,515);
			ImageView iView1 = new ImageView(pImage);
			ImageView iView2 = new ImageView(pImage);
			ImageView iView3 = new ImageView(pImage);
			ImageView iView4 = new ImageView(pImage);
                        ImageView iView5 = new ImageView(pImage);
                        ImageView iView6 = new ImageView(pImage);
                        ImageView iView7 = new ImageView(pImage);
                        ImageView iView8 = new ImageView(pImage);
                        ImageView iView9 = new ImageView(pImage);
                        ImageView iView10 = new ImageView(pImage);
                        ImageView iView11 = new ImageView(pImage);
                        ImageView iView12 = new ImageView(pImage);
                        ImageView iView13 = new ImageView(pImage);
                        ImageView iView14 = new ImageView(pImage);
                        ImageView iView15 = new ImageView(pImage);
                        ImageView iView16 = new ImageView(pImage);
			root.add(iView1, 0, 0);
			root.add(iView2, 0, 1);
			root.add(iView3, 0, 2);
			root.add(iView4, 0, 3);
                        root.add(iView5, 1, 0);
                        root.add(iView6, 1, 1);
                        root.add(iView7, 1, 2);
                        root.add(iView8, 1, 3);
                        root.add(iView9, 2, 0);
                        root.add(iView10, 2, 1);
                        root.add(iView11, 2, 2);
                        root.add(iView12, 2, 3);
                        root.add(iView13, 3, 0);
                        root.add(iView14, 3, 1);
                        root.add(iView15, 3, 2);
                        root.add(iView16, 3, 3);
			iView1.setOnMouseClicked((MouseEvent event) -> {
                            iView1.setImage(Image1);
                            if(a==2){
                                score++;
                                a=2;
                            }
                            else{
                                hideLastImage();
                                lastClicked = iView1;
                                a=1;
                            }
                        });
			iView2.setOnMouseClicked((MouseEvent event) -> {
                            iView2.setImage(Image2);
                            if(b==2){
                                score++;
                                b=2;
                            }
                            else{
                                hideLastImage();
                                lastClicked = iView2;
                                b=1;
                            }
                        });
			iView3.setOnMouseClicked((MouseEvent event) -> {
                            iView3.setImage(Image1);
                            if(a==1){
                                score++;
                                a=2;
                            }
                            else{
                                hideLastImage();
                                lastClicked = iView3;
                                a=2;
                            }
                        });
			iView4.setOnMouseClicked((MouseEvent event) -> {
                            iView4.setImage(Image2);
                            if(b==1){
                                score++;
                                b=2;
                            }
                            else{
                                hideLastImage();
                                lastClicked = iView4;
                                b=2;
                            }
                        });
                        iView5.setOnMouseClicked((MouseEvent event) -> {
                            iView5.setImage(Image3);
                            if(c==2){
                                score++;
                                c=2;
                            }
                            else{
                                hideLastImage();
                                lastClicked = iView5;
                                c=1;
                            }
                        });
                        iView6.setOnMouseClicked((MouseEvent event) -> {
                            if(d==2){
                                score++;
                                d=2;
                            }
                            else{
                                hideLastImage();
                                iView6.setImage(Image4);
                                lastClicked = iView6;
                                d=1;
                            }
                        });
                        iView7.setOnMouseClicked((MouseEvent event) -> {
                            if(c==1){
                                score++;
                                c=1;
                            }
                            else{
                                hideLastImage();
                                iView7.setImage(Image3);
                                lastClicked = iView7;
                                c=2;
                            }
                        });
                        iView8.setOnMouseClicked((MouseEvent event) -> {
                            if(d==1){
                                score++;
                                d=1;
                            }
                            else{
                                hideLastImage();
                                iView8.setImage(Image4);
                                lastClicked = iView8;
                                d=2;
                            }
                        });
                        iView9.setOnMouseClicked((MouseEvent event) -> {
                            hideLastImage();
                            iView9.setImage(Image5);
                            lastClicked = iView9;
                        });
                        iView10.setOnMouseClicked((MouseEvent event) -> {
                            hideLastImage();
                            iView10.setImage(Image6);
                            lastClicked = iView10;
                        });
                        iView11.setOnMouseClicked((MouseEvent event) -> {
                            hideLastImage();
                            iView11.setImage(Image5);
                            lastClicked = iView11;
                        });
                        iView12.setOnMouseClicked((MouseEvent event) -> {
                            hideLastImage();
                            iView12.setImage(Image6);
                            lastClicked = iView12;
                        });
                        iView13.setOnMouseClicked((MouseEvent event) -> {
                            hideLastImage();
                            iView13.setImage(Image7);
                            lastClicked = iView13;
                        });
                        iView14.setOnMouseClicked((MouseEvent event) -> {
                            hideLastImage();
                            iView14.setImage(Image8);
                            lastClicked = iView14;
                        });
                        iView15.setOnMouseClicked((MouseEvent event) -> {
                            hideLastImage();
                            iView15.setImage(Image7);
                            lastClicked = iView15;
                        });
                        iView16.setOnMouseClicked((MouseEvent event) -> {
                            hideLastImage();
                            iView16.setImage(Image8);
                            lastClicked = iView16;
                        });
                        
			primaryStage.setTitle("Memory Game");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
		}
	}
	
	public void hideLastImage() {
		if (lastClicked != null) {
			lastClicked.setImage(pImage);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}