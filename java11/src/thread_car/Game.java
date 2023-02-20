package thread_car;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game f = new Game();
	}

	public Game() {
		setTitle("Game");
		setSize(800, 800);
		MyThread c1 = new MyThread("car01.png", 100, 100);
		MyThread c2 = new MyThread("car02.png", 100, 200);
		MyThread c3 = new MyThread("car03.png", 100, 300);

		c1.start();
		c2.start();
		c3.start();
		setVisible(true);

	}

	public class MyThread extends Thread {

		int x, y;
		JLabel label;

		public MyThread(String img, int x, int y) {

			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(img);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 200);
			add(label);

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(40);
				x += move;
				label.setBounds(x, y, 200, 200);

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}
