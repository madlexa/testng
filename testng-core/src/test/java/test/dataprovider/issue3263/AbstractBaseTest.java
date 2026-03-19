package test.dataprovider.issue3263;

import org.testng.annotations.Test;

public abstract class AbstractBaseTest {
  @Test(dataProvider = "places")
  public void verifyPlace(String place, String city) {}
}
