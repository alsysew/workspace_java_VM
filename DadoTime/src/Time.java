
public class Time {
	private int hora;
	private int minuto;
	private int segundo;

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String exibirHoraUniversal() {
		return formataNumero(hora)+":"+formataNumero(minuto)+":"+formataNumero(segundo);
		
	}
	
	public String exibirHoraPadrao() {
		
		if ((hora == 00) || (hora == 24)) {
			return "12:"+minuto+":"+segundo+" AM";
		}
		else if (hora == 12){
			return hora+":"+minuto+":"+segundo+" PM";
		}
		else if (hora > 12){
			return (hora-12)+":"+minuto+":"+segundo+" PM";
		}		
		else {
			return hora+":"+minuto+":"+segundo+" AM";
		}
	}
	
	private String formataNumero(int numero) {
		if (numero <10) {
			return "0"+numero;
		}
		else {
			return ""+numero;
		}
	}
	
}
