package homework2;

import java.awt.*;


public class FontFamilyNames {
    String allFontNames[];
    public String[] getFontName(){
        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
        allFontNames=ge.getAvailableFontFamilyNames();
        return allFontNames;
    }
}
