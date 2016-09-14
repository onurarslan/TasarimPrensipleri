package _01.LooseCoupling_EsnekBag;

/**
 * 
 * @author Onur Arslan
 *
 */

/*
 * Motor sınıfı, MotorInterface nesnesini oluşturarak parametre olarak gelen nesneyi kontrol altına almıştır.
 * _motor parametresi, MotorInterface yi implement eden sınıfları temsil etmektedir.
 * start ve stop metotoları içinde kullanılan motor nesnesi
 * parametre olarak gelen nesnenin metotlarını çalıştırmaktadır.
 */

public class Motor {
	private MotorInterface motor;

	public Motor(MotorInterface _motor) {
		this.motor = _motor;
	}

	public void start() {
		motor.start();
	}

	public void stop() {
		motor.stop();
	}

}
