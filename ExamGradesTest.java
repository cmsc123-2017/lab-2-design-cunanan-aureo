import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ExamGradesTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testCreateExamGrades() {
    double grades[] = new double[10];
    
    for (int i = 0; i < 10; i++) {
      grades[i] = 100 - i;
    }
    
    ExamGrades g = new ExamGrades(grades);

    assertEquals(100.0, g.grades[0]);
    assertEquals(91.0, g.grades[9]);    
  }

  public void testMaxim(){
    double grades[] = {100.0,90.0,50.0,40.0};
    double agrades[] = {50.0,33.3,50.0,10.0,5.0};
    double arr[] = {};
    double arrg[] = {10.0};
    
    ExamGrades g = new ExamGrades(grades);
    ExamGrades a = new ExamGrades(agrades);
    ExamGrades b = new ExamGrades(arr);
    ExamGrades c = new ExamGrades(arrg);
    
    assertEquals(100.0,g.maxim());
    assertEquals(50.0,a.maxim());
    assertEquals(0.0,b.maxim());
    assertEquals(10.0,c.maxim());
  }
}
