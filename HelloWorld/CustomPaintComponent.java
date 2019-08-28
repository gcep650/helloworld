package HelloWorld;
import java.awt.*;
public class CustomPaintComponent extends Component
{
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        
        int x = 0;
        int y = 0;
        int w = getSize().width-1;
        int h = getSize().height-1;
        
        g2d.fillArc(x, y, w, h, 0, 120);
    }
}
