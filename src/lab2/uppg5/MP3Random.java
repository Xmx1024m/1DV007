package lab2.uppg5;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

import javazoom.jl.player.Player;

import org.apache.commons.io.FileUtils;

public class MP3Random {
	
	private File dir;
	private Player player;
	private Random rnd;
	private int plSize = 0;
	private ArrayList<File> mp3;
	
	public String MP3Random () throws Exception {
		
		mp3 = new ArrayList<File>();
		String[] ext = {"mp3"};		// Vilka extensions som vi vill ha i v�r lista med musik
		dir = new File("C:\\Users\\Hero\\Music\\Java");
		
		if (!dir.exists())
			throw new Exception("Katalogen: " + dir.toString() + " fanns inte");
		
		System.out.println("MP3-filer:");
		
		/* Vi hittade ett fiffigt .jar arkiv med m�nga anv�ndbara saker, s� som FileUtils
		 * som l�ter mig manipulera v�r Collection mp3files att bara lista filer som:
		 * - Ligger i v�r valda katalog
		 * - Har fil�ndelsen vi speciferat i variablen "ext"
		 * 
		 * API: http://commons.apache.org/io/apidocs/org/apache/commons/io/FileUtils.html
		 * Download: http://www.jarfinder.com/index.php/jars/jarClasses/41916
		 */
		
		Collection mp3files = FileUtils.listFiles(dir, ext, true);
		
		for (Iterator itr = mp3files.iterator(); itr.hasNext();) {
			File f = File.class.cast(itr.next());
			mp3.add(f);
		}
		
		if (!dir.exists())
			throw new Exception("Katalogen " + dir.toString() + " finns inte.");
		
		rnd = new Random(mp3.size());
		
		return mp3.get(rnd.nextInt()).getPath();
	}
}
