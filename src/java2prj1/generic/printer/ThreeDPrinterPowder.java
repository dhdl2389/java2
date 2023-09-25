package java2prj1.generic.printer;

public class ThreeDPrinterPowder {

	private Powder material;

	public void setMaterial(Powder material) {
		this.material = material;
	}

	public Powder getMaterial() {
		return material;
	}

	public void print() {
		System.out.println("3D Print Use:" + material);
	}
}
