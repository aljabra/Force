import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MyApplet extends Applet  { 
    TextField inputLine = new TextField(15);  
    
    public MyApplet() {
        add(inputLine);
        inputLine.addActionListener(new ActionListener()
             {
                public void actionPerformed(ActionEvent event) {
                    String s = inputLine.getText();
                    if(s.equals("a"))
                    {
                       inputLine.setBackground(Color.);
                    }
                }
            }
     );
    }
    public void paint(Graphics g) {
      g.setColor(Color.red);
      
   }
}