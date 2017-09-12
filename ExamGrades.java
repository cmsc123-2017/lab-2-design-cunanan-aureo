/*SIGNATURE
 * -->double
 * 
 * PURPOSE
 * computes for the highest value in this array
 *
 * STUB
 * double maxim(){
 *   return 0;
 * }
 * 
 */

class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  /*TEMPLATE
   * ...this.grades[] --> double
   * 
   */
  // TODO design a function that returns the highest grade
  double maxim(){
    double max = 0.0;
    
    for(int i = 0; i < grades.length; i++){
      if (max < grades[i]){
        max = grades [i];
      }
    }
    return max;
  }
}
