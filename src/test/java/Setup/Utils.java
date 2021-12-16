package Setup;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import javax.net.ssl.SSLEngineResult.Status;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


public class Utils {
	public static void logPrint(String strLog) {
		String strLogFormatado = formatarNomeLog(strLog);
		ExtentTest extentTest = TestRule.getExtentTest();
		try {
			efetuarPrintTela(strLogFormatado);
			extentTest.log(Status.INFO, strLog,
					MediaEntityBuilder.createScreenCaptureFromPath(
							System.getProperty("user.dir") + "\\src\\test\\resources\\" + strLogFormatado + ".png")
							.build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void efetuarPrintTela(String strLog) {
		File scrFile = ((TakesScreenshot) TestRule.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,
					new File(System.getProperty("user.dir") + "\\src\\test\\resources\\" + strLog + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void logPass(String strMensagem) {
		ExtentTest extentTest = TestRule.getExtentTest();
		extentTest.log(Status.PASS, strMensagem);
	}

	public static void logFail(String strMensagem) {
		ExtentTest extentTest = TestRule.getExtentTest();
		extentTest.log(Status.FAIL, strMensagem);
	}


	public static void wait(int intSegundos) {
		try {
			synchronized (TestRule.getDriver()) {
				TestRule.getDriver().wait(intSegundos * 1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static String formatarNomeLog(String strLog) {
		LocalDateTime dataHoraAgora = LocalDateTime.now();
		DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd_MM_yy_HH_mm_ss");
		String strLogFormatado = strLog + "_" + dataHoraAgora.format(formatoDataHora);
		return strLogFormatado;
	}

	
}
