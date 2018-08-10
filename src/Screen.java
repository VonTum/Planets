import javax.swing.*;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class Screen extends JPanel{
	List<Planet> planets;
	
	public Screen(){
		planets = new ArrayList<Planet>();
	}
	public void addPlanet(Planet p){
		planets.add(p);
	}
	public void removePlanet(Planet p){
		planets.remove(p);
	}
	
	public void paintComponent(Graphics g){
		//Thread t = new Thread();
		
		super.paintComponent(g);
		for(Planet p: planets){
			for(Planet pg: planets){
				if(p.equals(pg))
					continue;
				p.attract(pg);
			}
		}
		
		for(Planet p: planets)
			p.move(g);
		
	}
}