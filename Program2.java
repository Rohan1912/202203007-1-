import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author 91834
 */
public class Program2 extends Applet implements ItemListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
        Choice choice; 
        Label lb1;
        public void init() 
           {    
                setLayout(new BorderLayout()); 
                Panel p1= new Panel();
                p1.setLayout(new GridLayout(2,2)); 
                lb1=new Label("Select an Option"); 
                p1.add(lb1); 
                choice =new Choice(); 
                choice.addItem("Red"); 
                choice.addItem("Blue"); 
                choice.addItem("Green"); 
                choice.addItem("Yellow"); 
                choice.addItem("Orange"); 
                choice.addItem("Pink");
                choice.addItem("Cyan");
                choice.addItem("Black"); 
                choice.addItemListener(this); 
                      p1.add(choice);             
                 add(p1,BorderLayout.NORTH);  
           }    
                public void itemStateChanged(ItemEvent e) 
                   { 
                      if(e.getSource()==choice) 
                         { 
                          
                           if(choice.getSelectedItem().equals("Red"))
                             { 
                                Color c = new Color(255,0, 0);
                                setBackground(c);
                              }
                           else if(choice.getSelectedItem().equals("Blue"))
                             { 
                                Color c = new Color(0,0, 255);
                                setBackground(c);
                             }
                           else if(choice.getSelectedItem().equals("Green"))
                             { 
                                 Color c = new Color(0,255, 0);
                                 setBackground(c);
                             }
                           else if(choice.getSelectedItem().equals("Yellow")) 
                             { 
                                Color c = new Color(255,255, 0);
                                setBackground(c);
                             }
                           else if(choice.getSelectedItem().equals("Orange"))
                             { 
                                Color c = new Color(255,165, 0);
                                setBackground(c);
                             }
                           else if(choice.getSelectedItem().equals("Pink"))
                             { 
                                Color c = new Color(255,192, 203);
                                setBackground(c);
                             }
                           else if(choice.getSelectedItem().equals("Cyan"))
                             { 
                                Color c = new Color(0,255, 255);
                                setBackground(c);
                             }
                           else if(choice.getSelectedItem().equals("Black"))
                             { 
                                Color c = new Color(0,0, 0);
                                setBackground(c);
                             }                    
                         }
                      
                                                                                          
                   }
                public void paint(Graphics g){
                }
                                                                                                  
    }
