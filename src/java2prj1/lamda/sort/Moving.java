package java2prj1.lamda.sort;

import java2prj.interfaceEx.cast.Score;

public class Moving implements Comparable<Moving> {

	String name;
	String code;
	int power;

	public Moving() {
		// TODO Auto-generated constructor stub
	}

	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}

	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}

	@Override
	public int compareTo(Moving o) {
		return this.name.compareTo(o.name);
	}

	

}
