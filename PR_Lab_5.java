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
				
		/* Список объектов. */
		int amount = 2;
		ArrayList<Building> firstDynamicArray = new ArrayList<>();
		Building helpBuilding = new Building();

		System.out.println("\nСписок объектов: ");

		firstDynamicArray.add(new Building());
		firstDynamicArray.get(0).inputBuilding();
		firstDynamicArray.add(new Building());
		firstDynamicArray.get(1).initBuilding();
		firstDynamicArray.get(0).addToBuilding(firstDynamicArray.get(1));
		/*...............................*/
				
		/* Массив объектов. */
		Building[] firstArrayOfDyn = new Building[amount];
		Building[] secondArrayOfDyn = new Building[amount];
		for (int i = 0; i < amount; i++)
		{
			firstArrayOfDyn[i] = new Building();
			secondArrayOfDyn[i] = new Building();
		}

		System.out.println("\nМассив объектов: ");

		firstArrayOfDyn[0].inputBuilding();
		secondArrayOfDyn[1].initBuilding();

		firstArrayOfDyn[0].addToBuilding(secondArrayOfDyn[1]);
		/*..............................*/
	}
}