package _01.LooseCoupling_EsnekBag;

/*
 * arabaMotor nesnesi, ArabaMotor sınıfından nesnesi üretilmiştir.
 * motor nesnesi arabaMotor nesnesini parametre olarak alarak nesnesi oluşturulmuştur.
 * Motor nesnesi ileride MotorInterface tarafından implement edilen başka bir sınıf nesnesinide alabilir.
 * motor nesnesi, arabaMotor nesnesinin sınıfına ait metotları çağırmaktadır.
 */

public class Test {

	public static void main(String[] args) {
		MotorInterface arabaMotor=new ArabaMotor();
		Motor motor = new Motor(arabaMotor);
		
		motor.start();
		motor.stop();
	}

}
