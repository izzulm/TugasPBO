import java.util.Scanner;

public class Mobil{

/* Attribute Mobil
- Model
- Tahun
- BBM
- Warna
- Kapasitas_mesin
- Varian
- Transmisi
- Tipe_Body
- Sistem_Penggerak
- Fitur 
String model, String tahun, String bbm, String warna, String kapasitas_mesin, String varian, String transmisi, String tipe_body, String sistem_Penggerak, String fitur
*/
	Scanner sc = new Scanner(System.in);
	private String model;
	private String tahun;
	private String bbm;
	private String warna;
	private String kapasitas_mesin;
	private String varian;
	private String transmisi;
	private String tipe_body;
	private String sistem_Penggerak;
	private String fitur;

	public Mobil(){
		
		this.model = sc.nextLine();
		this.tahun = sc.nextLine();
		this.bbm = sc.nextLine();
		this. warna = sc.nextLine();
		this.kapasitas_mesin = sc.nextLine();
		this.varian = sc.nextLine();
		this.transmisi = sc.nextLine();
		this.tipe_body = sc.nextLine();
		this.sistem_Penggerak = sc.nextLine();
		this.fitur = sc.nextLine();
	}

	public String getModel(){
		return model;
	}

	public String getTahun(){
		return tahun;
	}

	public String getBBM(){
		return bbm;
	}

	public String getWarna(){
		return warna;
	}

	public String getKapasitas_Mesin(){
		return kapasitas_mesin;
	}

	public String getVarian(){
		return varian;
	}

	public String getTransmisi(){
		return transmisi;
	}

	public String getTipe_Body(){
		return tipe_body;
	}

	public String getSistem_Penggerak(){
		return sistem_Penggerak;
	}

	public String getFitur(){
		return fitur;
	}

}