package java2prj1.generic.printer;

public class ThreeDPrinterPlastic {

	private Plastic material;

	public void setMaterial(Plastic material) {
		this.material = material;
	}

	public Plastic getMaterial() {
		return material;
	}

	public void print() {
		System.out.println("3D Print Use:" + material);
	}
}
