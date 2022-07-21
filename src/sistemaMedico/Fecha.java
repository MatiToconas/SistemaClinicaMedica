package sistemaMedico;

public class Fecha 
{
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		
		this.dia=1;
		this.mes=1;
		this.anio=2000;
	}
	
	public Fecha(int d, int m, int a)
	{
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void corrobora() {
	    
	    boolean diaCorrecto,mesCorrecto,anioCorrecto;

	    anioCorrecto = this.anio <=2020;
	    mesCorrecto = this.mes >=1 && this.mes <=12;

	        switch(this.mes)
	        {
	            case 2:
	                if(anioBisiesto())
	                {
	                    diaCorrecto = this.dia >= 1 && this.dia <=29;
	                }
	                else
	                {
	                diaCorrecto = this.dia >= 1 && this.dia <=28;
	                }
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                diaCorrecto = this.dia >=1 && this.dia <=30;
	                break;
	            default:
	                diaCorrecto = this.dia >=1 && this.dia <=31;
	        }
	        if (diaCorrecto==false){
	        	System.out.println("El dia ingresado no es correcto");
	        }
	        if (mesCorrecto==false) {
	        	System.out.println("El mes ingresado no es correcto");
	        }
	        if(anioCorrecto==false) {
	        	System.out.println("El año ingresado no es correcto");
	        }
	     }

	 private boolean anioBisiesto() {

	     return (this.anio % 4 == 0 && this.anio % 100 !=0 || this.anio % 400 == 0);
	    }       

	public boolean dia() {
		
		boolean diaCorrecto, mesCorrecto;
		mesCorrecto = this.mes >=1 && this.mes <=12;
	    switch(mes)
	    {
	        case 2:
	            if(anioBisiesto())
	            {
	                diaCorrecto = this.dia >= 1 && this.dia <=29;
	            }
	            else
	            {
	            diaCorrecto = this.dia >= 1 && this.dia <=28;
	            }
	            break;
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	            diaCorrecto = this.dia >=1 && this.dia <=30;
	            break;
	        default:
	            diaCorrecto = this.dia >=1 && this.dia <=31;
	    }
	   
	    	return diaCorrecto && mesCorrecto;
	}
	public boolean mes() {
		
		boolean mesCorrecto = this.mes >=1 && this.mes <=12;
	    return mesCorrecto;
	}
	public boolean anio() {
		
		boolean anioCorrecto = this.anio <=2020;
		return anioCorrecto;
	}
	@Override
	public String toString() {
		return  dia + "/" + mes + "/" + anio;
	}
}
