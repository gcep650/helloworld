package HelloWorld;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ImageTest extends Component
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new CustomPaintComponent());
        
        int frameWidth = 300;
        int frameHeight = 300;
        
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }
}
