package oop2;

public class SeleniumLib {

	public void LaunchBrowser(String browserName) {
		System.out.println("Launch browser: " + browserName);
		interactWithBrowser(browserName);
		
	}

	private void interactWithBrowser(String browserName) {
		if (browserName.equals("chrome")) {
			System.out.println("launch chrome");
			launchChrome();
		} else if (browserName.equals("ff")) {
			System.out.println("launch ff");
			launchFF();
		} else if (browserName.equals("safari")) {
			System.out.println("launch safari");
			launchSafari();
		} else {
			System.out.println("no browser is defined");
		}
	}

	private void launchChrome() {
		System.out.println("goolge chrome is launched");
	}

	private void launchFF() {
		System.out.println("FF is launched");
	}

	private void launchSafari() {
		System.out.println("Safari is launched");
	}
}
