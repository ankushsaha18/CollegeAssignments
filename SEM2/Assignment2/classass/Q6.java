package classass;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSE stu1=new CSE(95,93,90);
		NonCSE stu2=new NonCSE(90,88,92);
		System.out.println("Percentage of CSE student:"+stu1.getPercentage());
		System.out.println("Percentage of NonCSE student:"+stu2.getPercentage());
	}

}
abstract class Marks{
	int marksICP;
	int marksDSA;
	double percentage;
	Marks(int marksICP,int marksDSA){
		this.marksICP=marksICP;
		this.marksDSA=marksDSA;
	}
	abstract double getPercentage();
}
class CSE extends Marks{
	int algoDesign;
	CSE(int marksICP,int marksDSA,int algoDesign){
		super(marksICP,marksDSA);
		this.algoDesign=algoDesign;
	}
	double getPercentage() {
		double totalMarks=marksICP+marksDSA+algoDesign;
		return totalMarks/300*100;
	}
}
class NonCSE extends Marks{
	int enggMechanics;
	NonCSE(int marksICP,int marksDSA,int enggMechanics){
		super(marksICP,marksDSA);
		this.enggMechanics=enggMechanics;
	}
	double getPercentage() {
		double totalMarks=marksICP+marksDSA+enggMechanics;
		return totalMarks/300*100;
	}
}
