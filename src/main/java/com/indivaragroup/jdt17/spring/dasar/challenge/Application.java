package com.indivaragroup.jdt17.spring.dasar.challenge;

import com.indivaragroup.jdt17.spring.dasar.challenge.configuration.AppConfig;
import com.indivaragroup.jdt17.spring.dasar.challenge.model.Animal;
import com.indivaragroup.jdt17.spring.dasar.challenge.service.AnimalService;
import com.indivaragroup.jdt17.spring.dasar.challenge.service.BallService;
import com.indivaragroup.jdt17.spring.dasar.challenge.service.GreetingService;
import com.indivaragroup.jdt17.spring.dasar.challenge.service.UserSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		challenge1(context);
		challenge2(context);
		challenge3(context);
		challenge4(context);
		challenge5(context);
//		challenge6(); // Pakai Application Runner
//		challenge7(); // Auto run
//		challenge8(); // Pakai Application Runner
//		finalChallenge(); // Pakai Application Runner
		ballChallenge(context);
	}

	public static void challenge1(ApplicationContext context){
		GreetingService greetingService = context.getBean(GreetingService.class);

		System.out.println(greetingService.sayHello());
	}

	public static void challenge2(ApplicationContext context){
		GreetingService greetingService = context.getBean(GreetingService.class);

		greetingService.greet();
	}

	public static void challenge3(ApplicationContext context){
		AnimalService animal = context.getBean(AnimalService.class);
		animal.getSound();

		Animal dog = context.getBean(Animal.class);
		System.out.println(dog.sound());


		/*
		- Apa yang terjadi saat aplikasi dijalankan?
			Program error
		- Mengapa terjadi error?
			Karna AnimalService membutuhkan 1 bean sedangkan ditemukan 2 bean yaitu cat dan dog
		- Bagaimana memperbaikinya menggunakan:
		  @Primary
		  	Pada salah satu class implementasi Cat/Dog diberi notasi @Primary (disini dicontohkan di class Dog)
		  @Qualifier
		  	Pada class implementasi gunakan annotasi @Qualifier("nama") dan pada saat DI di constructor AnimalService
		  	Gunakan anotasi @Qualifier("nama-class-yang-ingin-diinject")
		 */
	}

	public static void challenge4(ApplicationContext context){
		UserSession session1 = context.getBean(UserSession.class);
		UserSession session2 = context.getBean(UserSession.class);

		System.out.println(session1 == session2);

		/*
		Bandingkan hasil:
		java System.out.println(session1 == session2);
		Apa hasilnya?
			Hasilnya adalah false karna object yang dibuat memiliki instance yang berbeda

		Bagaimana jika scope diubah menjadi Singleton?
			Hasilnya true karna object yang dibuat memiliki instance yang sama
		 */
	}

	public static void challenge5(ApplicationContext context){
		System.out.println(context.getBean(AppConfig.class).applicationName());
	}

	public static void challenge6(){
		// pakai aplication runner
	}

	public static void challenge7(){
		// saat aplicasi start akan di construct
		// saat aplikasi stop akan di destroy
	}

	public static void challenge8(){
		// Pake Application Runner
	}

	public static void finalChallenge(){
		// Pake Aplication Runner
	}

	public static void ballChallenge(ApplicationContext context){
		BallService ballService = context.getBean(BallService.class);

		ballService.setBlueBallQuantity(198);
		ballService.setOtherBallQuantity(2);

		ballService.calculateBlueBallTargetPercentage(98);
	}

}




