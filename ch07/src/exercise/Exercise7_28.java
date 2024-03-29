package exercise;
import java.awt.*;
import java.awt.event.*;

class Exercise7_28 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new EventHandler() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}

}

class EventHandler extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}