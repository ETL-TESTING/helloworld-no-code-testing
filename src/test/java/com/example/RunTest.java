package com.example;

import org.jsmart.zerocode.core.domain.EnvProperty;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.TestPackageRoot;
import org.jsmart.zerocode.core.runner.ZeroCodePackageRunner;
import org.junit.runner.RunWith;

@TargetEnv("configs/host.properties")       // <--- "app_host_sst.properties" if running against 'sst'
@TestPackageRoot("tests")                   // <--- Root of the all tests folder in the test/resources
@EnvProperty("_${env}")                     // <--- mvn clean install -Denv=ci1 or -Denv=sst1
@RunWith(ZeroCodePackageRunner.class)
public class RunTest{
    // Nothing needed here
}
