package sistemaMedico;

public class Pago {

	private Cobertura coberturaRef;
	private double importePago=0;
	private Prestacion prestacionRef;
	
	//constructor
	public Pago(Cobertura coberturaRef, double importe, Prestacion prestacionRef) {
		
		this.coberturaRef = coberturaRef;
		this.importePago = importe;
		this.prestacionRef = prestacionRef;
	}
	
	//getter y setter
	public Cobertura getCoberturaRef() {
		return coberturaRef;
	}
	public void setCoberturaRef(Cobertura coberturaRef) {
		this.coberturaRef = coberturaRef;
	}
	public double getImporte() {
		return importePago;
	}
	public void setImporte(double importe) {
		this.importePago = importe;
	}
	public Prestacion getPrestacionRef() {
		return prestacionRef;
	}
	public void setPrestacionRef(Prestacion prestacionRef) {
		this.prestacionRef = prestacionRef;
	}
	
}
