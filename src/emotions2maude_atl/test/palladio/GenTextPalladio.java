package emotions2maude_atl.test.palladio;

import maude_model2text.MaudeM2T;

public class GenTextPalladio {
	
	private static String IN_MAUDE = "src/emotions2maude_atl/test/palladio/outPalladio.xmi";
	private static String OUT_TEXT = "src/emotions2maude_atl/test/palladio/outmaude.maude";
	
	public static void main(String[] args) {
		System.out.println("IN_Behavior: " + IN_MAUDE);
		System.out.println("OUT_MAUDE: " + OUT_TEXT);
		
		MaudeM2T trans = new MaudeM2T();
		trans.generate(IN_MAUDE, OUT_TEXT);
	}

}
