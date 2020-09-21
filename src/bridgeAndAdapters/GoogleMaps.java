package bridgeAndAdapters;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements MapaBridge{

	@Override
	public String devolveMapa(String rua) {
		try {
			String googleMaps= "https://maps.google.com/maps?q=rua+vergueiro";
			URL url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			//
			return openStream.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

}
