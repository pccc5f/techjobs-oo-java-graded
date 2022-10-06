package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
@Test
public void testSettingJobId() {
    Job test_job_1 = new Job();
    Job test_job_2 = new Job();
    assertNotEquals(test_job_1.getId(), test_job_2.getId(), .001);
}
@Test
public void testJobContructorSetsAllFields() {
   Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
   assertTrue(test_job.getName() instanceof String);
   assertTrue(test_job.getEmployer() instanceof Employer);
   assertTrue(test_job.getLocation() instanceof Location);
   assertTrue(test_job.getPositionType() instanceof PositionType);
   assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
   assertEquals("Product tester", test_job.getName());
   assertEquals("ACME", test_job.getEmployer().toString());
   assertEquals("Desert", test_job.getLocation().toString());
   assertEquals("Quality control", test_job.getPositionType().toString());
   assertEquals("Persistence", test_job.getCoreCompetency().toString());
}
@Test
public void testJobsForEquality() {
    Job test_job_1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job test_job_2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(test_job_1 == test_job_2);
}
}
