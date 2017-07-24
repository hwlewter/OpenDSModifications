package eu.opends.camera;

import eu.opends.tools.PanelCenter;

import java.io.File;
//import eu.opends.basics.SimulationBasics;
import com.jme3.app.state.ScreenshotAppState;

public class ScreenshotCapture {
	public static String message = "screenshot capture class property";
	public static String filePath = "C:"+File.separator+"Users"+File.separator+"carsim"+File.separator+"Desktop"+File.separator+
			"dcg_testbuilds"+File.separator+"ods_test_build"+File.separator+"OpenDS4.5_test"+File.separator+"Screenshots"+File.separator;
	
	public static void showMessage() {
		PanelCenter.getMessageBox().addMessage("Z pressed for screenshot inside class", 3);
		System.out.println(message);
	}
	
	public static void testScreenshot() {
		
		String fileName = "Test Center";
		ScreenshotAppState screenShotState = new ScreenshotAppState(filePath, fileName, 0);
		screenShotState.takeScreenshot();
	}
}
