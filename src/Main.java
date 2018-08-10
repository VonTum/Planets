import javax.swing.*;

import java.util.Random;
import java.awt.event.*;
import java.awt.*;




public class Main {
	public static Screen Panel;
	public static Timer timer;
	public static ActionListener timerAction = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Panel.repaint();
		}
	};
	public static void main(String[] args) {
		timer = new Timer(10, timerAction);
		
		Random r = new Random();
		
		JFrame f = new JFrame("Planets");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(1200,1000);
		
		
		Panel = new Screen();
		f.add(Panel);
		
		/*
		Panel.addPlanet(new Planet(600, 500, 50, 10, Color.ORANGE));
		Panel.addPlanet(new Planet(600, 400, 2.5, 0, 10, 1, Color.BLUE));
		Panel.addPlanet(new Planet(600, 300, -2.5, 0, 10, 1, Color.CYAN));
		*/
		
		/*Panel.addPlanet(new Planet(500, 600, 20, 2, new Color(r.nextInt())));
		Panel.addPlanet(new Planet(600, 600, 20, 2, new Color(r.nextInt())));
		Panel.addPlanet(new Planet(550, 550, 20, 2, new Color(r.nextInt())));
		Panel.addPlanet(new Planet(800, 800, 20, 2, new Color(r.nextInt())));*/
		
		for(int x = 300; x < 900; x += 20){
			for(int y = 200; y < 800; y += 20){
				
				int size = r.nextInt(20);
				Panel.addPlanet(new Planet(x, y, size, size/10 + 0.1, new Color(r.nextInt())));
				//Panel.addPlanet(new Planet(x, y, 10, 1));
			}
		}
		
		
		/*
		double size = 0;
		for(int x = 300; x < 900; x += 40){
			for(int y = 200; y < 800; y += 40){
				
				size += 0.1;
				Panel.addPlanet(new Planet(x, y, size, size/10 + 0.1, new Color(r.nextInt())));
				//Panel.addPlanet(new Planet(x, y, 10, 1));
			}
		}
		*/
		
		/*
		for(int i = 0; i<500; i++){
			Panel.addPlanet(new Planet(r.nextInt(1200), r.nextInt(1000), 20, 1));
		}
		Panel.addPlanet(new Planet(600, 500 , 50, 20, Color.YELLOW));
		*/
		
		
		
		/*
		for(int i = 0; i<10; i++){
			double size = 5 + r.nextInt(45);
			Panel.addPlanet(new Planet(r.nextInt(800), r.nextInt(800), size, r.nextInt(5)));
		}
		*/
		
		/*
		Panel.addPlanet(new Planet(100, 180, 1, 0, 20, 1));
		Panel.addPlanet(new Planet(150, 273, -1, 0, 20, 1));
		Panel.addPlanet(new Planet(200, 293, 0, 0, 30, 3, Color.YELLOW));
		Panel.addPlanet(new Planet(500, 217, 0, 0, 25, 2, Color.CYAN));
		*/
		
		timer.start();
	}
}