import robocode.*;
import robocode.util.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

public class Giragira extends AdvancedRobot
{
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setBodyColor(Color.red);
		setGunColor(Color.pink);
		setRadarColor(Color.white);
		setScanColor(Color.blue);
		setBulletColor(Color.black);

		// esse loop mantém o robô em um estado contínuo de execução, o que é necessário para o comportamento contínuo em uma batalha. o robô continuará executando as ações que estão dentro deste loop até que o jogo termine
		while(true) {
			setAhead(20); // vai para frente 100 pixels
			setTurnRight(10); // gira para direita 360 graus
			setTurnGunRight(-12); // gira a arma 360 graus para direita. a quantidade negativa faz com que o movimento seja no sentido horário
			execute(); // faz o robô executar todas as ações programadas até o momento, ele processa e envia todos os comandos dados até aquele ponto
		}
	}

	/**
	 * onScannedRobot: é chamado sempre que o robô detecta outro robô no campo de batalha. o parametro "e" é um objeto que contém informações sobre o robô escaneado (distância, ângulo e energia)
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(3); //quando o robô é escaneado o robô atira com uma potência de 3 (quanto maior o valor mais forte e mais energia é gasta)
	}

	/**
	 * onHitByBullet: é chamado quando o robô é atingido por um tiro de outro robô. o parâmetro e contém infos sobre o evento (potência da bala)
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
	}
	
	/**
	 * onHitWall: método é chamado quando o robô colide com uma parede do campo de batalha
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
	}	
}
