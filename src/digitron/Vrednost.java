package digitron;

public interface Vrednost {
	// Novac
	public double dinToEur = 0.0085, dinToDol = 0.01, dinToYuan = 0.06;
	public double dolarToEur = 0.87, dolarToYuan = 6.33, dolarToRsd = 102.73;
	public double evroToYuan = 7.24, evroToRsd = 118, evroToDol = 1.14;
	public double yuanToDol = 0.16, yuanToRsd = 16.22, yuanToEur = 0.14;
	
	// Temperatura
	public double kelvinToCel = -272.15, kelvinToFah = -457.87;
	public double CelToFah = 33.8,  CelToKelvin = 274.15;
	public double FahToKelvin = 459.67, FahToCel = -17.22222;
	
	// Duzina
	public double mmToCm = 0.1, mmToM = 0.001, mmToKm = 0.000001, mmToInch = 0.03937008;
	public double cmToMm = 10, cmToM = 0.01, cmToKm = 0.00001, cmToInch = 0.3937008;
	public double mToMm = 1000, mToCm = 100, mTokm = 0.001, mToInch = 39.37008;
	public double kmToMm = 1000000, kmToCm = 100000, kmToM = 1000, kmToInch = 39370.08;
	public double InchToMm = 25.4, InchToCm = 2.54, InchToM = 0.0254, InchToKm = 2.54e-5;
	
	// Tezina
	public double mgToG = 0.001, mgToKg = 0.000001, mgToP = 0.000002;
	public double gToMg = 1000, gToKg = 0.001, gToP = 0.002205;
	public double kgToMg = 1000000, kgToG = 1000, kgToP = 2.204623;
	public double pToMg = 453592.4, pToG = 453.5924, pToKg = 0.453592;
	
	// Podaci
	public double byteToKB = 0.001, byteToMb = 1e-6, byteToGb = 1e-9, byteToTB = 1e-12;
	public double KbToByte = 1024, KbToMb = 0.001, KbToGb = 1e-6, KbToTB = 1e-9;
	public double MbToByte = 1048576, MbToKb = 1024, MbToGb = 0.008, MbToTB = 0.000008;
	public double GbToByte = 1073741824, GbToKb = 1048576, GbToMb = 1024, GbToTB = 0.001;
	public double TbToByte = 1099511627 * 1000, TbToKb = 1073741824, TbToMb = 1048576, TbToGb = 1024;
	
	// Vreme 
	public double sToM = 0.016667, sToH = 0.000278, sToD = 0.000012;
	public double mTos = 60, mToH = 0.016667, mToD = 0.000694;
	public double hToS = 3600, hToM = 60, hToD = 0.041667;
	public double dToS = 86400, dToM = 1440, dToh = 24;
	
}
