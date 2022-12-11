package toto;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LogicalDocTest {

    @Test
    public void test_logical_doc() throws Exception {
        SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
        testCaseRunner.setProjectFile("src/test/resources/LogicalDoc-soapui-project.xml");
        testCaseRunner.setJUnitReport(true);
        testCaseRunner.setExportAll(true);
        testCaseRunner.setPrintReport(true);
        testCaseRunner.setOutputFolder("target/surefire-reports");

        final boolean result = testCaseRunner.run();
        assertTrue(result);
    }

}
