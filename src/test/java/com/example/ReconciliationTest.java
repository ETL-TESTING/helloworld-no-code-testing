package com.example;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("configs/database.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class ReconciliationTest {

    @Test
	@Scenario("tests/reconciliation/reconciliation_automated_test.json")
	public void testDbCsvLoadWithHeaders() throws Exception {
	}

}
