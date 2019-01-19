package computing;

import javafx.fxml.FXML;
import javafx.scene.shape.Polygon;

public class Controller {
	
	static final int TOP_LEFT_X = 217, TOP_LEFT_Y = 40;
	static final int BOTTOM_RIGHT_X = 1372, BOTTOM_RIGHT_Y = 615;
	static final int START_ANGLE = 90;
	

	@FXML Polygon robot;
	
	public Controller() {
		
		
		
	}
	
	public boolean setLocation(double x, double y, double angle) {
		if (inBoundries(x, y)) {
			robot.setLayoutX(TOP_LEFT_X + x);
			robot.setLayoutY(TOP_LEFT_Y + y);
			robot.setRotate(START_ANGLE + angle);
			return true;
		}
		return false;
	}

	private boolean inBoundries(double x, double y) {
		return x <= BOTTOM_RIGHT_X - TOP_LEFT_X  &&  y <= BOTTOM_RIGHT_Y - TOP_LEFT_Y;
	}
	
}
