
public class Autobuz extends Autovehicul{
		int ruta;
		
		public Autobuz (int ruta) {
			this.ruta = ruta;
		}
		@Override
		public void accelereaza(int delta) {
			if(vitezaCurenta < vitezaMaxima) {
				vitezaCurenta += delta; 
			}
		}
		
}
