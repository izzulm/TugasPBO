import java.util.Scanner;

class mob{


Scanner sc = new Scanner(System.in);
	private String model = "SUV";
	public String tahun ;
	private String bbm;
	private String warna;
	private String kapasitas_mesin;
	private String varian;
	private String transmisi;
	private String tipe_body;
	private String sistem_Penggerak;
	public String fitur;

	/*public void car(){
		
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
	}*/ 

	public void setModel(){
		System.out.print("Input Model : ");
		model = sc.nextLine();
	}

	public String getModel(){
		return model;
	}

	public void setTahun(){
		tahun = sc.nextLine();
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

	public void setFitur(){
		System.out.print("Input Fitur : ");
		fitur = sc.nextLine();
	}

	public void setFitur(int i){
		for (int z = 0; z<i; z++){
			System.out.print("Input Fitur : ");
			fitur = sc.nextLine();
		}
		
	}

	public String getFitur(){
		return fitur;
	}

}

class honda extends mob{
	
}


class toyota extends mob{

	public void setTahun() {
		System.out.print("Input Tahun : ");
		tahun = sc.nextLine();
	}

}

class nissan extends mob{

}

public class Car {

public static void main (String[] args){

		//Inheritance
		honda c = new honda();

		c.setModel();
		System.out.println(c.getModel());


		//Overridding
		toyota t = new toyota();

		t.setTahun();
		System.out.println(t.getTahun());

		//overloading
		nissan n = new nissan();

		n.setFitur();
		System.out.println(n.getFitur());
		System.out.println("===============");
		n.setFitur(3);
		System.out.println(n.getFitur());

	}
}	