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
    public Job idJob;
    public Job fieldJob;
    public Job stringJob;

    @Test
    public void testSettingJobId() {
        idJob = new Job();
        fieldJob = new Job();
        assertNotEquals(idJob.getId(), fieldJob.getId());
    }

    @Test
    public void testConstructorSetsAllFields() {
        Job idJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Object expected = "";
        assertEquals(expected= "Product tester", idJob.getName());
        assertEquals(expected= "ACME", idJob.getEmployer().getValue());
        assertEquals(expected= "Desert", idJob.getLocation().getValue());
        assertEquals(expected= "Quality control", idJob.getPositionType().getValue());
        assertEquals(expected= "Persistence", idJob.getCoreCompetency().getValue());

        assertTrue(idJob.getName() instanceof String);
        assertTrue(idJob.getEmployer() instanceof Employer);
        assertTrue(idJob.getLocation() instanceof Location);
        assertTrue(idJob.getPositionType() instanceof PositionType);
        assertTrue(idJob.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job idJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job fieldJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(idJob.equals(fieldJob));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job stringJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = stringJob.toString().charAt(0);
        char lastChar = stringJob.toString().charAt(stringJob.toString().length() - 1);
        assertTrue(firstChar == lastChar);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job labelJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output2 = "\nID: " + labelJob.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n";
        assertEquals(output2, labelJob.toString());
    }

   @Test
   public void testToStringHandlesEmptyField() {
        Job emptyJob = new Job();
        String output = "\nID: " + emptyJob.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n";
        assertEquals(output, emptyJob.toString());

   }


   // }



}


