package initiator;

import framework.*;

public class Initiator {

    public static void main(String[] args) {
        Config.readConfigFile();

        for (String param : args)
            BatchFileConfig.setConfigValue(param);

        ExecutionController.readExecutionControllerExcel();
        Report.generateReportTemplate();
        StaticDataManager.readConfigFile();
        ExecutionController.doTestExecution();
        Report.openTestSummaryReport();
    }
}
