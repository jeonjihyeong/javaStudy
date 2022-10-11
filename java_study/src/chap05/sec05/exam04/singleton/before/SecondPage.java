package chap05.sec05.exam04.singleton.before;

public class SecondPage {
	private Settings settings = new Settings();
	
	public void setAndPrintSettings() {
		
		settings.getTheme(settings.getDarkMode());
		System.out.println("Font Size: "+settings.getFontSize());
	}
}
