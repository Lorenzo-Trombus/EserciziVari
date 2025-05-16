import java.util.LinkedList;
import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;



public class Main {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);

		// Create una lista con 10 elementi Wifi casuali
		LinkedList<WiFi> lwifi = new LinkedList<WiFi>();
		for (int i = 0; i < 10; i++) {
			lwifi.add(WiFi.MakeWifi());
		}

		System.out.println(lwifi);

		// Domanda:La potreste stampare in formato CSV poiché
		// dobbiamo passarla al vostro collega Onisa?
		for (var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			System.out.print(a);
			
			System.out.printf("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
		}
		var fou = Util.OpenFileForWriting("WiFi.dat");
		for (var x: lwifi) {
			String a = String.format("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			fou.write(0);
		}
		fou.close();
		
		
		
		String riga = fin.readLine();
		while (riga != null) {
			String[] items = riga.split(",");
			
			WiFi it = new WiFi(items[0], items[1], items[2], Double.parseDouble(items[3]));
			
			lwifi.add(it); 
			System.out.println(riga);
			
			riga = fin.readLine();
		}
		fin.close();
		
		
		var tmp = """
				{
				"Protocollo": "WPA2",
				"Password":"Hhkfhspsdpfh",
				"Frequenza": 2234345356.193610
				}
				""";
		
		WiFi appo = WiFi.MakeWifi();
		
		String jsonString;
		ObjectMapper objectMapper = new ObjectMapper();
		jsonString = objectMapper.writeValueAsString(appo);
		
		System.out.println(jsonString);
		
		WiFi nuovo= objectMapper.readValue(jsonString, WiFi,class);
		System.out.println(nuovo);
	}

}
