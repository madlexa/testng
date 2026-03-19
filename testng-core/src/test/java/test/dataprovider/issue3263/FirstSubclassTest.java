package test.dataprovider.issue3263;

import org.testng.annotations.Test;

@Test(dataProviderClass = DataProviderAlpha.class)
public class FirstSubclassTest extends AbstractBaseTest {}
