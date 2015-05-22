import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Applet implements ActionListener
{
    private Button button1;
    //private Button button2;
    //private Button button3;
    private int buttonPress;
    private Button next;
    public void init()
    { 
        // initialize the instance variables
        button1 = new Button("Start Quiz");
        add(button1);
        button1.addActionListener(this);
        //button2 = new Button("Polys/Arcs");
        //add(button2);
        //button2.addActionListener(this);
        //button3 = new Button("Picture");
        //add(button3);
        //button3.addActionListener(this);
        next = new Button("Next Question");
        add(next);
        next.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Object source = ae.getSource();
        if (source.equals(button1)){
            buttonPress = 1;
        }
        //else if (source.equals(button2)){
            //buttonPress = 2;
        
        //else if (source.equals(button3)){
            //buttonPress = 3;
        
        else {
            buttonPress = 0;
        }
        repaint();
    }
//     public void paint(Graphics g)
//     {
//         if (buttonPress == 1)
//             drawVan(g);
//         
//         //else if (buttonPress == 2){
//             //drawPolyArc(g);
//         
//         //else if (buttonPress == 3){
//             //drawPic3(g);
//         }
    
//     public void drawVan(Graphics g){
//         g.setColor(Color.blue);
//         g.fillRect(0, 0, 300, 200/5*3);
//         g.setColor(new Color(160,80,0));
//         g.fillRect(0, 200/5*3, 300, 200/5*2);
//         Polygon van = new Polygon();
//         van.addPoint(50, 50);
//         van.addPoint(50,150);
//         van.addPoint(250,150);
//         van.addPoint(250,100);
//         van.addPoint(200,50);
//         g.setColor(Color.yellow);
//         g.fillPolygon(van);
//         drawCross(125,75,50,Color.red, g);
//         Polygon window = new Polygon();
//         window.addPoint(200,50);
//         window.addPoint(200,100);
//         window.addPoint(250,100);
//         g.setColor(Color.white);
//         g.fillPolygon(window);
//         g.setColor(Color.black);
//         g.fillOval(200,75,25,25);
//         g.fillOval(75, 125, 50, 50);
//         g.fillOval(175, 125, 50, 50);
//     }
//     public void drawCross(int x, int y, int r, Color c1, Graphics g)
//     {
//         g.setColor(c1);
//         g.fillRect(x+r/3,y,r/3,r);
//         g.fillRect(x,y+r/3,r,r/3);
//     }
//     public void drawPolyArc(Graphics g)
//     {
//         g.setColor(Color.blue);
//         g.fillRect(50,0,50,50);
//         g.setColor(Color.red);
//         Polygon triangle = new Polygon();
//         triangle.addPoint(75,50);
//         triangle.addPoint(50,100);
//         triangle.addPoint(100,100);
//         g.fillPolygon(triangle);
//         g.setColor(Color.cyan);
//         Polygon hexagon = new Polygon();
//         hexagon.addPoint(50/3,100);
//         hexagon.addPoint(0,200/8*5);
//         hexagon.addPoint(50/3,150);
//         hexagon.addPoint(50/3*2,150);
//         hexagon.addPoint(50,200/8*5);
//         hexagon.addPoint(50/3*2,100);
//         g.fillPolygon(hexagon);
//         Polygon pentagon = new Polygon();
//         pentagon.addPoint(100,150+50/3);
//         pentagon.addPoint(110,200);
//         pentagon.addPoint(140,200);
//         pentagon.addPoint(150,150+50/3);
//         pentagon.addPoint(100+50/2,150);
//         g.setColor(Color.magenta);
//         g.fillPolygon(pentagon);
//         int red1 = (int)(Math.random()*256);
//         int green1 = (int)(Math.random()*256);
//         int blue1 = (int)(Math.random()*256);
//         g.setColor(new Color(red1, green1, blue1));
//         g.fillArc(150,0,100,100,90,90);
//         int red2 = (int)(Math.random()*256);
//         int green2 = (int)(Math.random()*256);
//         int blue2 = (int)(Math.random()*256);
//         g.setColor(new Color(red2, green2, blue2));
//         g.fillArc(200,0,100,100,0,90);
//         int red3 = (int)(Math.random()*256);
//         int green3 = (int)(Math.random()*256);
//         int blue3 = (int)(Math.random()*256);
//         g.setColor(new Color(red3, green3, blue3));
//         g.fillArc(150,50,100,100,180,90);
//         int red4 = (int)(Math.random()*256);
//         int green4 = (int)(Math.random()*256);
//         int blue4 = (int)(Math.random()*256);
//         g.setColor(new Color(red4, green4, blue4));
//         g.fillArc(200,50,100,100,0,-90);
//         int red5 = (int)(Math.random()*256);
//         int green5 = (int)(Math.random()*256);
//         int blue5 = (int)(Math.random()*256);
//         g.setColor(new Color(red5, green5, blue5));
//         g.fillArc(225,150,50,50,90,180);
//         int red6 = (int)(Math.random()*256);
//         int green6 = (int)(Math.random()*256);
//         int blue6 = (int)(Math.random()*256);
//         g.setColor(new Color(red6, green6, blue6));
//         g.fillArc(275,150,50,50,-90,180);
//         g.setColor(Color.black);
//         g.drawString("Square",55,25);
//         g.drawString("Triangle",55,75);
//         g.drawString("Hexagon",5,125);
//         g.drawString("Pentagon",105,175);
//     }
//     public void drawPic3(Graphics g)
//     {
//         Color bat = new Color(255,213,0);
//         g.setColor(bat);
//         g.fillRect(150,150,50,225);
//         g.fillOval(155,35,35,15);
//         g.setColor(Color.red);
//         g.fillRect(150,150,5,100);
//         g.fillRect(195,150,5,100);
//         g.fillRect(165,50,15,100);
//         
//         g.setColor(Color.black);
//         g.drawString("St",170,195);
//         g.fillRect(160,205,5,30);
//         g.fillRect(170,205,5,30);
//         g.fillRect(180,205,5,30);
//         g.drawString("Adidas",155,280);
//     }
         TextField inputLine = new TextField(15);  
    
    public Buttons() {
        add(inputLine);
        inputLine.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    String s = inputLine.getText();
                    if(s.equals("a"))
                    {
                        inputLine.setBackground(Color.green);
                    }
                    else
                    {
                        inputLine.setBackground(Color.red);
                        inputLine.setName("");
                }
            }
         );
    }
}