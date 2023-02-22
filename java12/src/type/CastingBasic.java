package type;

public class CastingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//큰거 <- 작은거 자동형변환(업캐스팅)
		
		byte b1=100;	//1byte -128~127
		int i1=200;		//4byte -21억~21억
		
		i1=b1;			//큰 <--작, 자동 형변환
		b1=(byte)i1;	//작 <--큰, 강제형변환
		
		double d1=i1;	//자동형변환
		i1=(int)d1;		//강제형변환
		
	}

}
