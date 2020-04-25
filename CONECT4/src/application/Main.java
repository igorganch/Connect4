package application;
	
import java.util.Vector;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Connect 4");
			Pane pane = new Pane();
			
			
			

			
			Rectangle square = new Rectangle(0,0,400,400);	
			square.setFill(Color.LIGHTBLUE);
			Vector<Circle> circles = new Vector();
			int x = 35;
			int y = 35;


			
			
			for (int c = 0; c < 6; c++) {
			
				y = 35;
			for (int i = 0 ; i < 6; i++) {
				Circle c1 =new Circle(x,y,30);
				c1.setFill(Color.WHITE);
				circles.add(c1);
				y+=66;
				
			
			}
			x+=66;
			}
			Rectangle event1 = new Rectangle(5,5,60,390);
			event1.setFill(Color.TRANSPARENT);
			event1.setStroke(Color.TRANSPARENT);
event1.setOnMouseClicked(new EventHandler<MouseEvent>() {
				
				public void handle(MouseEvent t) {
				if((circles.get(0)).getFill() == Color.WHITE) {	
					if (Connect4.turn() == false) {
						if((circles.get(5)).getFill() == Color.WHITE) {
							(circles.get(5)).setFill(Color.RED);
							Connect4.playgame(0, 0, 0);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}
							else {
							if((circles.get(4)).getFill() == Color.WHITE) {
								(circles.get(4)).setFill(Color.RED);
								Connect4.playgame(0, 1, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}else{
								if((circles.get(3)).getFill() == Color.WHITE) {
									(circles.get(3)).setFill(Color.RED);
									Connect4.playgame(0, 2, 0);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}
								else {
								
									if((circles.get(2)).getFill() == Color.WHITE) {
										(circles.get(2)).setFill(Color.RED);
										Connect4.playgame(0, 3, 0);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}else {
										if((circles.get(1)).getFill() == Color.WHITE) {
											(circles.get(1)).setFill(Color.RED);
											Connect4.playgame(0, 4, 0);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
											
										}
										else {
											(circles.get(0)).setFill(Color.RED);
											Connect4.playgame(0, 5, 0);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
									}
								}
								
							}
							
							
						}
	                
					}
					else {
						if((circles.get(5)).getFill() == Color.WHITE) {
							(circles.get(5)).setFill(Color.YELLOW);
							Connect4.playgame(0, 0, 1);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}
							else {
							if((circles.get(4)).getFill() == Color.WHITE) {
								(circles.get(4)).setFill(Color.YELLOW);
								Connect4.playgame(0, 1, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}else{
								if((circles.get(3)).getFill() == Color.WHITE) {
									(circles.get(3)).setFill(Color.YELLOW);
									Connect4.playgame(0, 2, 1);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}
								else {
								
									if((circles.get(2)).getFill() == Color.WHITE) {
										(circles.get(2)).setFill(Color.YELLOW);
										Connect4.playgame(0, 3, 1);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}else {
										if((circles.get(1)).getFill() == Color.WHITE) {
											(circles.get(1)).setFill(Color.YELLOW);
											Connect4.playgame(0, 4, 1);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
										else {
											(circles.get(0)).setFill(Color.YELLOW);
											Connect4.playgame(0, 5, 1);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
									}
								}
								
							}
							
							
						}
					}
	            }
				}
			});
			/*
			event1.setOnMouseClicked(new EventHandler<MouseEvent>() {
				
				public void handle(MouseEvent t) {
				if((circles.get(0)).getFill() == Color.WHITE) {	
					if (Connect4.turn() == false) {
						if((circles.get(5)).getFill() == Color.WHITE) {
							(circles.get(5)).setFill(Color.RED);
							Connect4.playgame(0, 0, 0);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
							else {
							if((circles.get(4)).getFill() == Color.WHITE) {
								(circles.get(4)).setFill(Color.RED);
								Connect4.playgame(0, 1, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}else{
								if((circles.get(3)).getFill() == Color.WHITE) {
									(circles.get(3)).setFill(Color.RED);
									Connect4.playgame(0, 2, 0);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
									
								}
								else {
								
									if((circles.get(2)).getFill() == Color.WHITE) {
										(circles.get(2)).setFill(Color.RED);
										Connect4.playgame(0, 3, 0);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}else {
										if((circles.get(1)).getFill() == Color.WHITE) {
											(circles.get(1)).setFill(Color.RED);
											Connect4.playgame(0, 4, 0);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
										else {
											(circles.get(0)).setFill(Color.RED);
											Connect4.playgame(0, 5, 0);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
									}
								}
								
							}
							
							
						}
	                
					}
					else {
						if((circles.get(5)).getFill() == Color.WHITE) {
							(circles.get(5)).setFill(Color.YELLOW);
							Connect4.playgame(0, 0, 1);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}
							else {
							if((circles.get(4)).getFill() == Color.WHITE) {
								(circles.get(4)).setFill(Color.YELLOW);
								Connect4.playgame(0, 1, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}else{
								if((circles.get(3)).getFill() == Color.WHITE) {
									(circles.get(3)).setFill(Color.YELLOW);
									Connect4.playgame(0, 2, 1);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}
								else {
								
									if((circles.get(2)).getFill() == Color.WHITE) {
										(circles.get(2)).setFill(Color.YELLOW);
										Connect4.playgame(0, 3, 1);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}else {
										if((circles.get(1)).getFill() == Color.WHITE) {
											(circles.get(1)).setFill(Color.YELLOW);
											Connect4.playgame(0, 4, 1);
											Connect4.print();
											
										}
										else {
											(circles.get(0)).setFill(Color.YELLOW);
											Connect4.playgame(0, 5, 1);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
									}
								}
								
							}
							
							
						}
					}
	            }
				}
			}
			);
			*/
			
			Rectangle event2 = new Rectangle(70,5,60,390);
			event2.setFill(Color.TRANSPARENT);
			event2.setStroke(Color.TRANSPARENT);
		event2.setOnMouseClicked(new EventHandler<MouseEvent>() {
				
				public void handle(MouseEvent t) {
				if((circles.get(6)).getFill() == Color.WHITE) {	
					if (Connect4.turn() == false) {
						if((circles.get(11)).getFill() == Color.WHITE) {
							(circles.get(11)).setFill(Color.RED);
							Connect4.playgame(1, 0, 0);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}
							else {
							if((circles.get(10)).getFill() == Color.WHITE) {
								(circles.get(10)).setFill(Color.RED);
								Connect4.playgame(1, 1, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}else{
								if((circles.get(9)).getFill() == Color.WHITE) {
									(circles.get(9)).setFill(Color.RED);
									Connect4.playgame(1, 2, 0);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}
								else {
								
									if((circles.get(8)).getFill() == Color.WHITE) {
										(circles.get(8)).setFill(Color.RED);
										Connect4.playgame(1, 3, 0);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}else {
										if((circles.get(7)).getFill() == Color.WHITE) {
											(circles.get(7)).setFill(Color.RED);
											Connect4.playgame(1, 4, 0);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
											
										}
										else {
											(circles.get(6)).setFill(Color.RED);
											Connect4.playgame(1, 5, 0);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
									}
								}
								
							}
							
							
						}
	                
					}
					else {
						if((circles.get(11)).getFill() == Color.WHITE) {
							(circles.get(11)).setFill(Color.YELLOW);
							Connect4.playgame(1, 0, 1);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}
							else {
							if((circles.get(10)).getFill() == Color.WHITE) {
								(circles.get(10)).setFill(Color.YELLOW);
								Connect4.playgame(1, 1, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}else{
								if((circles.get(9)).getFill() == Color.WHITE) {
									(circles.get(9)).setFill(Color.YELLOW);
									Connect4.playgame(1, 2, 1);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}
								else {
								
									if((circles.get(8)).getFill() == Color.WHITE) {
										(circles.get(8)).setFill(Color.YELLOW);
										Connect4.playgame(1, 3, 1);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}else {
										if((circles.get(7)).getFill() == Color.WHITE) {
											(circles.get(7)).setFill(Color.YELLOW);
											Connect4.playgame(1, 4, 1);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
										else {
											(circles.get(6)).setFill(Color.YELLOW);
											Connect4.playgame(1, 5, 1);
											Connect4.print();
											if (Connect4.rules() != 7) {
												winner(primaryStage);
											
										}
										}
									}
								}
								
							}
							
							
						}
					}
	            }
				}
			});
			
		Rectangle event3 = new Rectangle(135,5,60,390);
		event3.setFill(Color.TRANSPARENT);
		event3.setStroke(Color.TRANSPARENT);
	event3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent t) {
			if((circles.get(12)).getFill() == Color.WHITE) {	
				if (Connect4.turn() == false) {
					if((circles.get(17)).getFill() == Color.WHITE) {
						(circles.get(17)).setFill(Color.RED);
						Connect4.playgame(2, 0, 0);
						Connect4.print();
						if (Connect4.rules() != 7) {
							winner(primaryStage);
						
					}
					}
						else {
						if((circles.get(16)).getFill() == Color.WHITE) {
							(circles.get(16)).setFill(Color.RED);
							Connect4.playgame(2, 1, 0);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}else{
							if((circles.get(15)).getFill() == Color.WHITE) {
								(circles.get(15)).setFill(Color.RED);
								Connect4.playgame(2, 2, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}
							else {
							
								if((circles.get(14)).getFill() == Color.WHITE) {
									(circles.get(14)).setFill(Color.RED);
									Connect4.playgame(2, 3, 0);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}else {
									if((circles.get(13)).getFill() == Color.WHITE) {
										(circles.get(13)).setFill(Color.RED);
										Connect4.playgame(2, 4, 0);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
										
									}
									else {
										(circles.get(12)).setFill(Color.RED);
										Connect4.playgame(2, 5, 0);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}
								}
							}
							
						}
						
						
					}
                
				}
				else {
					if((circles.get(17)).getFill() == Color.WHITE) {
						(circles.get(17)).setFill(Color.YELLOW);
						Connect4.playgame(2, 0, 1);
						Connect4.print();
						if (Connect4.rules() != 7) {
							winner(primaryStage);
						
					}
					}
						else {
						if((circles.get(16)).getFill() == Color.WHITE) {
							(circles.get(16)).setFill(Color.YELLOW);
							Connect4.playgame(2, 1, 1);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}else{
							if((circles.get(15)).getFill() == Color.WHITE) {
								(circles.get(15)).setFill(Color.YELLOW);
								Connect4.playgame(2, 2, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}
							else {
							
								if((circles.get(14)).getFill() == Color.WHITE) {
									(circles.get(14)).setFill(Color.YELLOW);
									Connect4.playgame(2, 3, 1);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}else {
									if((circles.get(13)).getFill() == Color.WHITE) {
										(circles.get(13)).setFill(Color.YELLOW);
										Connect4.playgame(2, 4, 1);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}
									else {
										(circles.get(12)).setFill(Color.YELLOW);
										Connect4.playgame(2, 5, 1);
										Connect4.print();
										if (Connect4.rules() != 7) {
											winner(primaryStage);
										
									}
									}
								}
							}
							
						}
						
						
					}
				}
            }
			}
		});
	
	Rectangle event4 = new Rectangle(200,5,60,390);
	event4.setFill(Color.TRANSPARENT);
	event4.setStroke(Color.TRANSPARENT);
event4.setOnMouseClicked(new EventHandler<MouseEvent>() {
		
		public void handle(MouseEvent t) {
		if((circles.get(18)).getFill() == Color.WHITE) {	
			if (Connect4.turn() == false) {
				if((circles.get(23)).getFill() == Color.WHITE) {
					(circles.get(23)).setFill(Color.RED);
					Connect4.playgame(3, 0, 0);
					Connect4.print();
					if (Connect4.rules() != 7) {
						winner(primaryStage);
					
				}
				}
					else {
					if((circles.get(22)).getFill() == Color.WHITE) {
						(circles.get(22)).setFill(Color.RED);
						Connect4.playgame(3, 1, 0);
						Connect4.print();
						if (Connect4.rules() != 7) {
							winner(primaryStage);
						
					}
					}else{
						if((circles.get(21)).getFill() == Color.WHITE) {
							(circles.get(21)).setFill(Color.RED);
							Connect4.playgame(3, 2, 0);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}
						else {
						
							if((circles.get(20)).getFill() == Color.WHITE) {
								(circles.get(20)).setFill(Color.RED);
								Connect4.playgame(3, 3, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}else {
								if((circles.get(19)).getFill() == Color.WHITE) {
									(circles.get(19)).setFill(Color.RED);
									Connect4.playgame(3, 4, 0);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
									
								}
								else {
									(circles.get(18)).setFill(Color.RED);
									Connect4.playgame(3, 5, 0);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}
							}
						}
						
					}
					
					
				}
            
			}
			else {
				if((circles.get(23)).getFill() == Color.WHITE) {
					(circles.get(23)).setFill(Color.YELLOW);
					Connect4.playgame(3, 0, 1);
					Connect4.print();
					if (Connect4.rules() != 7) {
						winner(primaryStage);
					
				}
				}
					else {
					if((circles.get(22)).getFill() == Color.WHITE) {
						(circles.get(22)).setFill(Color.YELLOW);
						Connect4.playgame(3, 1, 1);
						Connect4.print();
						if (Connect4.rules() != 7) {
							winner(primaryStage);
						
					}
					}else{
						if((circles.get(21)).getFill() == Color.WHITE) {
							(circles.get(21)).setFill(Color.YELLOW);
							Connect4.playgame(3, 2, 1);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}
						else {
						
							if((circles.get(20)).getFill() == Color.WHITE) {
								(circles.get(20)).setFill(Color.YELLOW);
								Connect4.playgame(3, 3, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}else {
								if((circles.get(19)).getFill() == Color.WHITE) {
									(circles.get(19)).setFill(Color.YELLOW);
									Connect4.playgame(3, 4, 1);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}
								else {
									(circles.get(18)).setFill(Color.YELLOW);
									Connect4.playgame(3, 5, 1);
									Connect4.print();
									if (Connect4.rules() != 7) {
										winner(primaryStage);
									
								}
								}
							}
						}
						
					}
					
					
				}
			}
        }
		}
	});
Rectangle event5 = new Rectangle(265,5,60,390);
event5.setFill(Color.TRANSPARENT);
event5.setStroke(Color.TRANSPARENT);
event5.setOnMouseClicked(new EventHandler<MouseEvent>() {
	
	public void handle(MouseEvent t) {
	if((circles.get(24)).getFill() == Color.WHITE) {	
		if (Connect4.turn() == false) {
			if((circles.get(29)).getFill() == Color.WHITE) {
				(circles.get(29)).setFill(Color.RED);
				Connect4.playgame(4, 0, 0);
				Connect4.print();
				if (Connect4.rules() != 7) {
					winner(primaryStage);
				
			}
			}
				else {
				if((circles.get(28)).getFill() == Color.WHITE) {
					(circles.get(28)).setFill(Color.RED);
					Connect4.playgame(4, 1, 0);
					Connect4.print();
					if (Connect4.rules() != 7) {
						winner(primaryStage);
					
				}
				}else{
					if((circles.get(27)).getFill() == Color.WHITE) {
						(circles.get(27)).setFill(Color.RED);
						Connect4.playgame(4, 2, 0);
						Connect4.print();
						if (Connect4.rules() != 7) {
							winner(primaryStage);
						
					}
					}
					else {
					
						if((circles.get(26)).getFill() == Color.WHITE) {
							(circles.get(26)).setFill(Color.RED);
							Connect4.playgame(4, 3, 0);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}else {
							if((circles.get(25)).getFill() == Color.WHITE) {
								(circles.get(25)).setFill(Color.RED);
								Connect4.playgame(4, 4, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
								
							}
							else {
								(circles.get(24)).setFill(Color.RED);
								Connect4.playgame(4, 5, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							
						}
					}
					
				}
				
				
			}
        
				}
		}
		else {
			if((circles.get(29)).getFill() == Color.WHITE) {
				(circles.get(29)).setFill(Color.YELLOW);
				Connect4.playgame(4, 0, 1);
				Connect4.print();
				if (Connect4.rules() != 7) {
					winner(primaryStage);
				
			}
			}
				else {
				if((circles.get(28)).getFill() == Color.WHITE) {
					(circles.get(28)).setFill(Color.YELLOW);
					Connect4.playgame(4, 1, 1);
					Connect4.print();
					if (Connect4.rules() != 7) {
						winner(primaryStage);
					
				}
					
				}else{
					if((circles.get(27)).getFill() == Color.WHITE) {
						(circles.get(27)).setFill(Color.YELLOW);
						Connect4.playgame(4, 2, 1);
						Connect4.print();
						if (Connect4.rules() != 7) {
							winner(primaryStage);
						
					}
					}
					else {
					
						if((circles.get(26)).getFill() == Color.WHITE) {
							(circles.get(26)).setFill(Color.YELLOW);
							Connect4.playgame(4, 3, 1);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}else {
							if((circles.get(25)).getFill() == Color.WHITE) {
								(circles.get(25)).setFill(Color.YELLOW);
								Connect4.playgame(4, 4, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}
							else {
								(circles.get(24)).setFill(Color.YELLOW);
								Connect4.playgame(4, 5, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}
						}
					}
					
				}
				
				
			}
		}
		
    }
	}
});
Rectangle event6 = new Rectangle(330,5,60,390);
event6.setFill(Color.TRANSPARENT);
event6.setStroke(Color.TRANSPARENT);
event6.setOnMouseClicked(new EventHandler<MouseEvent>() {
	
	public void handle(MouseEvent t) {
	if((circles.get(30)).getFill() == Color.WHITE) {	
		if (Connect4.turn() == false) {
			if((circles.get(35)).getFill() == Color.WHITE) {
				(circles.get(35)).setFill(Color.RED);
				Connect4.playgame(5, 0, 0);
				Connect4.print();
				if (Connect4.rules() != 7) {
					winner(primaryStage);
				
			}
			}
				else {
				if((circles.get(34)).getFill() == Color.WHITE) {
					(circles.get(34)).setFill(Color.RED);
					Connect4.playgame(5, 1, 0);
					Connect4.print();
					if (Connect4.rules() != 7) {
						winner(primaryStage);
					
				}
				}else{
					if((circles.get(33)).getFill() == Color.WHITE) {
						(circles.get(33)).setFill(Color.RED);
						Connect4.playgame(5, 2, 0);
						Connect4.print();
						if (Connect4.rules() != 7) {
							winner(primaryStage);
						
					}
					}
					else {
					
						if((circles.get(32)).getFill() == Color.WHITE) {
							(circles.get(32)).setFill(Color.RED);
							Connect4.playgame(5, 3, 0);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}else {
							if((circles.get(31)).getFill() == Color.WHITE) {
								(circles.get(31)).setFill(Color.RED);
								Connect4.playgame(5, 4, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}
							else {
								(circles.get(30)).setFill(Color.RED);
								Connect4.playgame(5, 5, 0);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
						}
					}
					
				}
				
				
			}
        
				}
		}
		else {
			if((circles.get(35)).getFill() == Color.WHITE) {
				(circles.get(35)).setFill(Color.YELLOW);
				Connect4.playgame(5, 0, 1);
				Connect4.print();
				if (Connect4.rules() != 7) {
					winner(primaryStage);
				
			}
			}
				else {
				if((circles.get(34)).getFill() == Color.WHITE) {
					(circles.get(34)).setFill(Color.YELLOW);
					Connect4.playgame(5, 1, 1);
					Connect4.print();
					if (Connect4.rules() != 7) {
						winner(primaryStage);
					
				}
				}else{
					if((circles.get(33)).getFill() == Color.WHITE) {
						(circles.get(33)).setFill(Color.YELLOW);
						Connect4.playgame(5, 2, 1);
						Connect4.print();
						if (Connect4.rules() != 7) {
							winner(primaryStage);
						
					}
					}
					else {
					
						if((circles.get(32)).getFill() == Color.WHITE) {
							(circles.get(32)).setFill(Color.YELLOW);
							Connect4.playgame(5, 3, 1);
							Connect4.print();
							if (Connect4.rules() != 7) {
								winner(primaryStage);
							
						}
						}else {
							if((circles.get(31)).getFill() == Color.WHITE) {
								(circles.get(31)).setFill(Color.YELLOW);
								Connect4.playgame(5, 4, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}
							else {
								(circles.get(30)).setFill(Color.YELLOW);
								Connect4.playgame(5, 5, 1);
								Connect4.print();
								if (Connect4.rules() != 7) {
									winner(primaryStage);
								
							}
							}
						}
					}
					
				}
				
				
			}
		}
		
    }
	}
});
	
	
	
			
			pane.getChildren().add(square);
			pane.getChildren().addAll(circles);
			pane.getChildren().addAll(event1, event2,event3,event4,event5, event6);
			
			
			
			
			
			
			Scene scene = new Scene(pane,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public void winner(Stage primaryStage) {
		if (Connect4.rules() == 1) {
			
			GridPane pane2 = new GridPane();
			pane2.setPadding(new Insets(15, 50, 0, 50));
			Label playagain = new Label("Play again?");
			Button yes = new Button("Yes");
			Button no = new Button("No");
			playagain.setMinWidth(30);
		
		
			pane2.add(new Label("Yellow wins!!"), 0,0);
			HBox pane3 = new HBox(5);
			pane3.setPadding(new Insets(10, 10, 0, 10));
			pane3.getChildren().addAll(playagain, yes, no);
			Scene winScene = new Scene(new VBox(pane2,pane3) , 170, 80);
			Stage secStage = new Stage();
			
			
			secStage.setScene(winScene);
			secStage.setTitle("Yellow wins");
			secStage.show();
			yes.setOnAction(e ->{
				secStage.close();
				
				start(primaryStage);
				
				Connect4.load();
			});
			
			no.setOnAction(e ->{
				secStage.close();
				primaryStage.close();
				
			});
			
			
		}else if(Connect4.rules() == 0) {
			GridPane pane2 = new GridPane();
			pane2.setPadding(new Insets(15, 50, 0, 50));
			Label playagain = new Label("Play again?");
			Button yes = new Button("Yes");
			Button no = new Button("No");
			playagain.setMinWidth(30);
		
		
			pane2.add(new Label("Red wins!!"), 0,0);
			HBox pane3 = new HBox(5);
			pane3.setPadding(new Insets(10, 10, 0, 10));
			pane3.getChildren().addAll(playagain, yes, no);
			Scene winScene = new Scene(new VBox(pane2,pane3) , 170, 80);
			Stage secStage = new Stage();
			
			
			secStage.setScene(winScene);
			secStage.setTitle("Red wins");
			secStage.show();
			yes.setOnAction(e ->{
				secStage.close();
				start(primaryStage);
				
				Connect4.load();
			});
			
			no.setOnAction(e ->{
				secStage.close();
				primaryStage.close();
				
			});
		}
	}

}

