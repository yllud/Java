package thread;

public class ThreadImage extends Thread {
	@Override
	public void run() {
		String[] images = {
				"1.png", "2.png", "3.png", "4.png", "5.png",
				"1.png", "2.png", "3.png", "4.png", "5.png",
				"1.png", "2.png", "3.png", "4.png", "5.png",
				"1.png", "2.png", "3.png", "4.png", "5.png",
				"1.png", "2.png", "3.png", "4.png", "5.png"
		};
		for (int i = 0; i < images.length; i++) {
			System.out.println("Image>> " + images[i]);
			try {
				ThreadTimer.sleep(5000); //5초재워라! //ms(밀리세컨즈)
			} catch (Exception e) {
				System.out.println("Error cpu");
			}
		}
	}
}
