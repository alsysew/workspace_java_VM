
public class TimeTeste {

	public static void main(String[] args) {
		
		Time h1;
	
		h1 = new Time();
		h1.setTime(24, 15, 30);
		
		System.out.println(h1.exibirHoraUniversal());		
		System.out.println(h1.exibirHoraPadrao());
	}

}
