import java.applet.Applet;
import java.awt.*;
public class drawings extends Applet {
public void paint(Graphics g){
 g.setColor(Color.red);
 g.fillOval(50, 50, 100, 100);
 g.setColor(Color.green);
 g.fillRect(200, 50, 150, 100);
 g.setColor(Color.blue);
 g.drawLine(400, 50, 500, 200);
 }
} 
