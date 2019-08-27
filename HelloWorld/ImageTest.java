package HelloWorld;
import java.awt.*;

public class ImageTest extends Component
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();
        frame.add(new CustomPaintComponent());
        
        int frameWidth = 300;
        int frameHeight = 300;
        
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }
}
