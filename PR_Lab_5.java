import java.util.Scanner;
import java.util.ArrayList;
import myClasses.Facade;
import myClasses.Building;

public class PR_Lab_5{
	public static void main(String[] args){
		/* Работа с экземплярами класса. */
		Building firstBuilding = new Building();
		Building secondBuilding = new Building();

		System.out.println("Программа по созданию зданий.\nВсе размерные данные вводятся в метрах.\n");
		System.out.println("Работа с экземплярами класса: ");

		firstBuilding.inputBuilding();
		secondBuilding.initBuilding();

		firstBuilding.addToBuilding(secondBuilding);

		firstBuilding.addFloors();
		firstBuilding.removeFloors();
		/*............................................*/
	}
}