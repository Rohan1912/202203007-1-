import java.applet.*;
import java.awt.*;
import java.util.*;
/**
 *
 * @author 91834
 */
public class Program1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
    }
    public void paint(Graphics g) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        name="Hello "+name;
        g.drawString(name,100,100);
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
