public class ProgramMobil {

	//args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]

	public static void main(String[] args){

		Mobil mob = new Mobil();

		String model = mob.getModel();
		String tahun = mob.getTahun();
		String bbm = mob.getBBM();
		String warna = mob.getWarna();
		String kapasitas_mesin = mob.getKapasitas_Mesin();
		String varian = mob.getVarian();
		String transmisi = mob.getTransmisi();
		String tipe_body = mob.getTipe_Body();
		String sistem_penggerak = mob.getSistem_Penggerak();
		String fitur = mob.getFitur();

		System.out.println("\n================MOBIL ANDA================");
		System.out.println("Model Mobil : "+model);
		System.out.println("Tahun : "+tahun);
		System.out.println("Bahan Bakar : "+bbm);
		System.out.println("Warna : "+warna);
		System.out.println("kapasitas_mesin : "+kapasitas_mesin);
		System.out.println("Varian Mobil : "+varian);
		System.out.println("Transmisi : "+transmisi);
		System.out.println("Tipe Body : "+tipe_body);
		System.out.println("Sistem Penggerak : "+sistem_penggerak);
		System.out.println("Fitur Mobil : "+fitur);
	}
}