package lambdas;

public class Threads {
	public static void main(String[] args) {
		Runnable trabalho1 = new Trabalho01();

		Runnable trabalho2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #02");
				}
			}
		};

		// Lambda
		Runnable trabalho3 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Tarefa #03");
			}
		};
		
		// Method Reference
		Runnable trabalho4 = Threads::trabalho4;

		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		Thread t4 = new Thread(trabalho4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	static void trabalho4() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #04");
		}
	}
}
