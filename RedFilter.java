import java.awt.Color;

import java.util.List;
import java.util.ArrayList;

/**
 * An image filter to red values
 * 
 * @author Christopher Reyes.
 * @version 1.0
 */
public class RedFilter extends Filter
{
    /**
	 * Constructor for objects of class GrayScaleFilter.
	 * @param name The name of the filter.
	 */
	public RedFilter(String name)
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
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int red = (pix.getRed());
                image.setPixel(x, y, new Color(red, red, red));
            }
        }
    }
}
