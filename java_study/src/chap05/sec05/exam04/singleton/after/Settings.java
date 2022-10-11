package chap05.sec05.exam04.singleton.after;

public class Settings {
	private boolean darkMode = false;
	private int fontSize = 15;
	
	private Settings() {}
	private static Settings settings = null;
	
	public static Settings getInstance() {
		if(settings ==null) {
			settings = new Settings();
		}
		return settings;
	}
	public boolean getDarkMode() {
		return darkMode;
	}
	public void setDarkMode(boolean darkMode) {
		this.darkMode=darkMode;
	}
	public int getFontSize() {
		return fontSize;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	public void getTheme(boolean mode) {
		if(mode==true) {
			System.out.println("Theme: Dark");
		}else {
			System.out.println("Theme: Light");
		}
	}
}
