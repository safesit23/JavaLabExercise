
package warmupkustudent;

public class TestFamily {
     public static void main(String[] args) {
Student child1=new KinderGartenStudent(10000,50000,"Deb",60123, "DebKid1",
25000);
Student child2=new UniversityStudent(10000,true,true, 60124,"DebKid2", 50000);
 System.out.println(child1);
 System.out.println(child2);
 System.out.println();
 System.out.println("Child1 Expense: "+ child1.expensePerSemester());
 System.out.println("Child2 Expense: "+ child2.expensePerSemester());

 }
}
