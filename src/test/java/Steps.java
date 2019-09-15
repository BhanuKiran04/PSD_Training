import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Steps {

    @Given("^enter \"([^\"]*)\"$")
    public void enter(String arg1) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^click \"([^\"]*)\"$")
    public void click(String arg1) throws Throwable {
        System.out.print("result is"+ new RpcCalc().compute("2 3 +"));
        Assert.assertEquals(0,new RpcCalc().compute("10 12 /"));
        //Assert.assertEquals(-5,new RpcCalc().compute("2 2 -12 + /"));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^Result should be (\\d+)$")
    public void result_should_be(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^Result should be Invalid$")
    public void result_should_be_Invalid() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }
}
