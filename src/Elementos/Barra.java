package Elementos;

public class Barra {
	public static void pacman() throws InterruptedException {
		String[] pacman = new String[10];
		
		pacman[0] = "                                                                                                                                                       ";
		pacman[1] = "  ██████████████             ██               ██████████         ██      ██                   ██           ██████████  ██████████                      ";
		pacman[2] = "  ██▒▒▒▒▒▒▒▒▒▒▒▒██         ██▒▒██           ████▒▒▒▒▒▒██       ██▒▒██  ██▒▒██               ██▒▒██         ██▒▒▒▒▒▒▒▒████▒▒▒▒▒▒██                      ";
		pacman[3] = "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒██       ████▒▒▒▒▒▒▒▒██       ██▒▒██  ██▒▒██             ██▒▒▒▒▒▒██       ██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒██   ▒▒▒▒▒    ▄████▄    ";
		pacman[4] = "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒██▒▒▒▒▒▒██         ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ▒ ▄▒ ▄▒ ▄███▄█▀     ";
		pacman[5] = "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒██       ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██         ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ▒▒▒▒▒▒▒ █████  █  █ ";
		pacman[6] = "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██ ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ▒▒▒▒▒▒▒ ▀█████▄     ";
		pacman[7] = "  ██▒▒▒▒▒▒▒▒▒▒████   ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ████▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒██  ▒ ▒ ▒ ▒   ▀████▀    ";
		pacman[8] = "  ██▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██   ████▒▒▒▒▒▒██ ██▒▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒▒██ ██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██ ██▒▒▒▒▒▒████▒▒▒▒▒▒▒▒██                      ";      
		pacman[9] = "  ████████████     ██████████  ██████████     ██████████ ████████  ██████  ████████ ██████████  ██████████ ██████████  ██████████                      ";      
		
		for(int i = 0; i < pacman.length; i++) {
			Thread.sleep(50);
		}
		for(int i = 0; i < pacman.length; i++) {
			System.out.println(pacman[i]);
			Thread.sleep(50);
		}
		for(int i = 0; i < pacman.length; i++) {
			Thread.sleep(50);
		}
	}
	public static void pacmanS() {
		System.out.println();
		System.out.println("  ██████████████             ██               ██████████         ██      ██                   ██           ██████████  ██████████                      ");
		System.out.println("  ██▒▒▒▒▒▒▒▒▒▒▒▒██         ██▒▒██           ████▒▒▒▒▒▒██       ██▒▒██  ██▒▒██               ██▒▒██         ██▒▒▒▒▒▒▒▒████▒▒▒▒▒▒██                      ");
		System.out.println("  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒██       ████▒▒▒▒▒▒▒▒██       ██▒▒██  ██▒▒██             ██▒▒▒▒▒▒██       ██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒██   ▒▒▒▒▒    ▄████▄    ");
		System.out.println("  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒██▒▒▒▒▒▒██         ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ▒ ▄▒ ▄▒ ▄███▄█▀     ");
		System.out.println("  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒██       ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██         ██▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ▒▒▒▒▒▒▒ █████  █  █ ");
		System.out.println("  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██ ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ▒▒▒▒▒▒▒ ▀█████▄     ");
		System.out.println("  ██▒▒▒▒▒▒▒▒▒▒████   ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ████▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ██▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒██  ▒ ▒ ▒ ▒   ▀████▀    ");
		System.out.println("  ██▒▒▒▒▒▒▒▒██     ██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██   ████▒▒▒▒▒▒██ ██▒▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒▒██ ██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██ ██▒▒▒▒▒▒████▒▒▒▒▒▒▒▒██                      ");      
		System.out.println("  ████████████     ██████████  ██████████     ██████████ ████████  ██████  ████████ ██████████  ██████████ ██████████  ██████████                      ");      
	}
}
