package java2prj.interfaceEx.cast;

class Unit {
	
	public void attack() {
		System.out.println("공격을 하다");
	}
}

class Archer extends Unit {
	public void attack() {
		System.out.println("화살을 쏘다");
	}
}

class Warrior extends Unit {
	public void attack() {
		System.out.println("도끼를 휘두르다");
	}
}

class Thief extends Unit {
	public void attack() {
		System.out.println("표창을 던지다");
	}
}


