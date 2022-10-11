package chap05.sec05.exam04.singleton.before;

public class FirstPage {
	private Settings settings = new Settings();
	
	public void setAndPrintSettings() {
		settings.setDarkMode(true);
		settings.setFontSize(17);
		
		settings.getTheme(settings.getDarkMode());
		System.out.println("Font Size: "+settings.getFontSize());
		
	}
}
