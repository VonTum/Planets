import java.awt.Color;
import java.awt.Graphics;


public class Planet{
	double x;
	double y;
	double vx;
	double vy;
	double size;
	double mass;
	Color c;
	public Planet(double x, double y, double size, double mass){
		this.x = x;
		this.y = y;
		this.vx = 0;
		this.vy = 0;
		this.size = size;
		this.mass = mass;
		this.c = Color.BLACK;
	}
	public Planet(double x, double y, double size, double mass, Color color){
		this.x = x;
		this.y = y;
		this.vx = 0;
		this.vy = 0;
		this.size = size;
		this.mass = mass;
		this.c = color;
	}
	public Planet(double x, double y, double vx, double vy, double size, double mass){
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.size = size;
		this.mass = mass;
		this.c = Color.BLACK;
	}
	public Planet(double x, double y, double vx, double vy, double size, double mass, Color color){
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.size = size;
		this.mass = mass;
		this.c = color;
	}
	public void attract(Planet p){
		//Calc distance
		double xd = p.x - x;
		double yd = p.y - y;
		double distance = Math.max(Math.sqrt(xd*xd + yd*yd), 5);
		double F = p.mass / distance;
		
		/*
		if(distance < (size + p.size)){
			size = Math.sqrt(size*size+p.size*p.size);
			mass += p.mass;
			vx = p.vx*p.mass/mass;
			vy = p.vy*p.mass/mass;
			//Main.Panel.removePlanet(p);
		}
		*/
		
		vx += F*(xd/distance);
		vy += F*(yd/distance);
		
		vx = vx*0.999999;
		vy = vy*0.999999;
		
	}
	public void move(Graphics g){
		x += vx;
		y += vy;
		
		g.setColor(c);
		g.fillOval((int)Math.round(x - size/2), (int)Math.round(y - size/2), (int)Math.round(size), (int)Math.round(size));
	}
}