package studio.ignitionigloogames.dungeondiver1;

import java.io.IOException;

import javax.imageio.ImageIO;

import org.retropipes.diane.asset.image.BufferedImageIcon;

public class GraphicsManager {
    // Methods
    public static BufferedImageIcon getLogo() {
	try {
	    return new BufferedImageIcon(ImageIO.read(GraphicsManager.class.getResource("/asset/image/logo/logo.png")));
	} catch (final IOException ie) {
	    DungeonDiver.debug(ie);
	    return null;
	}
    }
}
