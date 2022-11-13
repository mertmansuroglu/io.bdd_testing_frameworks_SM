package base;

import com.thoughtworks.gauge.*;
import configuration.Configuration;
import helper.SlackHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestBase {
    /**
     *
     */
    private SlackHelper slackHelper;

    public TestBase() {
        var slackMessageString = Configuration.getInstance().getStringValueOfProp("slack_message");
        var slackMessage = Boolean.parseBoolean(slackMessageString);
        slackHelper = new SlackHelper(slackMessage);
    }
    /**
     *burda setStartDate() koyduk oda baslangic zamanini ayarliyor
     * testing ne kadar sure kostugunu duration cikarmak icin
     */
    @BeforeSuite
    public void beforeSuit() {
        SlackHelper.setStartDate();
    }

    /**
     * buda slack helperdaki sendSlackMessage() metodundan slack mesaji yolluyoruz
     */
    @AfterSuite
    public void afterSuit() {
        slackHelper.sendSlackMessage();
    }

    @AfterScenario
    public void afterScenario(ExecutionContext context) {
        slackHelper.updateStatus(context);
    }

}
