import java.awt.Color;

import java.util.List;
import java.util.ArrayList;

/**
 * An image filter to red values
 * 
 * @author Christopher Reyes.
 * @version 1.0
 */
public class Warhol extends Filter
{
    private OFImage original;
    private OFImage blue;
    private OFImage red;
    private OFImage green;
    /**
	 * Constructor for objects of class GrayScaleFilter.
	 * @param name The name of the filter.
	 */
	public Warhol(String name)
    {
        super(name);
	}

    
    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        original = new OFImage(image);
        blue = new OFImage(image);
        red = new OFImage(image);
        green = new OFImage(image);
        
        int heightBlue = blue.getHeight () /2;
        int widthBlue = blue.getWidth()/2 ;
        for(int y = 0; y < heightBlue; y++) {
            for(int x = 0; x < widthBlue; x++) {
                Color pix = blue.getPixel(x, y);
                int blueColor = (pix.getBlue());
                image.setPixel(x + widthBlue, y, new Color(0, 0, blueColor));
            }
        }
        
        int heightRed = red.getHeight ()/2;
        int widthRed = red.getWidth()/2;
        for(int y =0; y < heightRed; y++) {
            for(int x = 0; x < widthRed; x++) {
                Color pix = red.getPixel(x, y);
                int redColor = (pix.getRed());
                image.setPixel (x, y, new Color(redColor, 0, 0));
            }
            
        }
        
        int heightGreen = green.getHeight()/2;
        int widthGreen = green.getWidth()/2;
        for(int y = 0; y < heightGreen; y++) {
            for(int x = 0; x < widthGreen; x++) {
                Color pix = green.getPixel(x, y);
                int greenColor = (pix.getGreen());
                image.setPixel(x, y + heightGreen, new Color(0, greenColor, 0));
            }
        }
        
        int heightOriginal = original.getHeight()/2;
        int widthOriginal = original.getWidth()/2;
        for(int y =0; y < heightOriginal; y++) {
            for(int x = 0; x < widthRed; x++) {
                 image.setPixel (x + widthOriginal, y + heightOriginal, original.getPixel(x * 2, y * 2));
            }
        }
    }
   
    
    
    
    
}
