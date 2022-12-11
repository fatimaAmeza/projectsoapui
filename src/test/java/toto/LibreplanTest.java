package toto;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LibreplanTest {

    @Test
    public void test_libre_plan() throws Exception {
        SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
        testCaseRunner.setProjectFile("src/test/resources/Projet_2_Libreplan.xml");
        testCaseRunner.setJUnitReport(true);
        testCaseRunner.setExportAll(true);
        testCaseRunner.setPrintReport(true);
        testCaseRunner.setOutputFolder("target/surefire-reports");

        final boolean result = testCaseRunner.run();
        assertTrue(result);
    }

}
