package java2prj.interfaceEx.cook;

public class kjy extends Cook implements 중식가능한 {

	public kjy() {

	}
	
	
	public kjy(String name) {
		super(name);
	}

	@Override
	public String 마라탕만들기() {
		// TODO Auto-generated method stub
		return "5단계 마라탕으로 주세요";
	}

	@Override
	public String 탕수육만들기() {
		// TODO Auto-generated method stub
		return "찍먹으로 해주세요";
	}

	@Override
	public String 짜장면만들기() {
		// TODO Auto-generated method stub
		return "쟁반으로 해주세요";
	}

}
