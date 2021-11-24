//Q (11)
//Name		: W.W.R.W.M.A.S.B.Weerasooriya
//Index NO	: MGT/5182
//REG NO	: MGT/2018/400
//Acd Year	: 2017/2018 
//Date 		: 2021/07/13

//Q (1)
public class MGT5182{
	public void MGT5182(){
	}
	public static void main(String[] args) {

//Q (2)
	int[]scores=new int[5];
	

//Q (3)
	Scanner sc=new Scanner(System.in);
	for(int i =0 ; i< scores.length; i++){
		int j = sc.nextINT();
		scores[i] = j ;

	}

//Q (4)
	int j=0;
	int avg=0;
	for(int i=0; i<scores.length; i++){
		j = j+ scores[i];
	}
	avg = j/scores.length;
	System.out.println(avg);

//Q (5)
	double[] weights=new double[]{1.2, 0.8, 1.5, 1.3, 1.1};

//Q (6)
	for(int i= 0; i < weights.length; i++){
		System.out.println(weights[i]);

	}
}
//Q (7)
	public static int maxArrayElem(int[] scores1){
	int maxElem=0;
	for ( int i = 0; i< scores1.length; i++){
		if(maxElem< scores1[i])
		    maxElem = scores1[1];
	}
	return maxElem;
 
//Q (8)
	int maxElem = MGT5182.maxArrayElem(scores1, 5);
		System.out.println(maxElem);

//Q (9)
	public String CompetencyLevel(double avg) {
        if (avg >= 85 & avg <= 100) {
		 System.out.println("The competency level is very good");

        } else if (avg >= 65 & avg < 85) {
           	 System.out.println("The competency level is good");

        } else if (avg >= 40 & avg < 65) {
            	System.out.println("The cmpetency level is Average");

        } else if (avg < 40) {
           	System.out.println("The competency level is weak" );

	}
}
               
//Q (10)
	MGT5182 avg = new MGT5182();
		avg.CompetencyLevel(avg);
		System.out.println(avg);
	}
}	





