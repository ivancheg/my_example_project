package com.pmmedia;

import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SuccessfulRegistrationJUnitTest.class})
public class JUnitTestSuite {
  @Rule
  public ExternalResource beforeAndAfterSuitheMethods = new ExternalResource() {
    @Override
    protected void before() throws Throwable {
     //To do
    };

    @Override
    protected void after() {
      //To do
    };
  };
}
