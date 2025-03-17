package framework;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.HashMap;

public class ControlData {
    public static final String executionTimeStamp = Utils.getTimeStamp("yyyy-MM-dd_HH-mm-ss");

    public static int noOfTestCasesSetToRun = 0;

    public static String currTestCaseID = null;

    public static String currTestCaseName = null;

    public static HashMap<String, Integer> methodCount;

    public static String currTestSetExcelWorkbookFileName;

    public static XSSFWorkbook currTestSetExcelWorkbook;

    public static String currTestMethod;

    public static String reportPath;

    public static String reportFileName;

    public static String reportFileNameWithPath;

    public static int testcaseScreenshotCount;

    public static String screenshotDirectory;

    public static String currTestcaseScreenshotDirectory;

    public static String currScreenshotName;
}
