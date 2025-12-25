package studio.ignitionigloogames.dungeondiver1;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Help {
    // Fields
    private URL helpURL;
    private String helpLink;

    // Constructor
    public Help() {
	try {
	    this.helpURL = new URI("https://ignitionigloogames.studio/games/dungeondiver1/help/").toURL();
	    this.helpLink = this.helpURL.toExternalForm();
	} catch (final MalformedURLException | URISyntaxException e) {
	    // Ignore exception
	}
    }

    // Method
    public void showHelp() {
	BrowserLauncher.openURL(this.helpLink);
    }
}
