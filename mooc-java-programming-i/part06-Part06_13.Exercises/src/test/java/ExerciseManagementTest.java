import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
  ExerciseManagement management;

  @Before
  public void initialize() {
    management = new ExerciseManagement();
  }

  @Test
  public void exerciseListEmptyAtBeginning() {
    assertEquals(0, management.exerciseList().size());
  }

  @Test
  public void addingExerciseGrowsListByOne() {
    management.add("Write a test");
    assertEquals(1, management.exerciseList().size());
  }

  @Test
  public void addedExerciseInList() {
    management.add("Mock Data");
    assertTrue(management.exerciseList().contains("Mock Data"));
  }


}