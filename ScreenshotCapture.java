package eu.opends.camera;

import eu.opends.tools.PanelCenter;
import eu.opends.main.Simulator;
import java.io.File;
//import eu.opends.basics.SimulationBasics;
//import com.jme3.app.state.ScreenshotAppState;

public class ScreenshotCapture {
	public static String message = "screenshot capture class property";
	public static String filePath = "C:"+File.separator+"Users"+File.separator+"carsim"+File.separator+"Desktop"+File.separator+
			"dcg_test_builds"+File.separator+"ods_test_build"+File.separator+"OpenDS_4.5_test"+File.separator+"Screenshots"+File.separator;
	private Simulator sim;
	
	public ScreenshotCapture(Simulator sim) {
		this.sim = sim;
	}
	
	public static void showMessage() {
		PanelCenter.getMessageBox().addMessage("Z pressed for screenshot inside class", 3);
		System.out.println(message);
	}
	
	public void testScreenshot() {
		
		String fileName = "Test Center ";
		PanelCenter.getMessageBox().addMessage("Z pressed for screenshot inside class", 3);
		//ScreenshotAppState screenShotState = new ScreenshotAppState(filePath, fileName, 0);
		//screenShotState.takeScreenshot();
	}
}
