package _01.LooseCoupling_EsnekBag;

/*
 * MotorInterface ArabaMotor tarafından implement edilerek ilgili metotlar doldurulmuştur.
 */

public class ArabaMotor implements MotorInterface{

	@Override
	public void start() {
		System.out.println("Araba motoru çalıştı");
	}

	@Override
	public void stop() {
		System.out.println("Araba motoru durdu");
	}
	

}
