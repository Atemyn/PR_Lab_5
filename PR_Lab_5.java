import java.util.Scanner;
import java.util.ArrayList;
import myClasses.Facade;
import myClasses.Building;

public class PR_Lab_5{
	public static void main(String[] args){
		/* ����� � ������ࠬ� �����. */
		Building firstBuilding = new Building();
		Building secondBuilding = new Building();

		System.out.println("�ணࠬ�� �� ᮧ����� ������.\n�� ࠧ���� ����� �������� � �����.\n");
		System.out.println("����� � ������ࠬ� �����: ");

		firstBuilding.inputBuilding();
		secondBuilding.initBuilding();

		firstBuilding.addToBuilding(secondBuilding);

		firstBuilding.addFloors();
		firstBuilding.removeFloors();
		/*............................................*/
				
		/* ���᮪ ��ꥪ⮢. */
		int amount = 2;
		ArrayList<Building> firstDynamicArray = new ArrayList<>();
		Building helpBuilding = new Building();

		System.out.println("\n���᮪ ��ꥪ⮢: ");

		firstDynamicArray.add(new Building());
		firstDynamicArray.get(0).inputBuilding();
		firstDynamicArray.add(new Building());
		firstDynamicArray.get(1).initBuilding();
		firstDynamicArray.get(0).addToBuilding(firstDynamicArray.get(1));
		/*...............................*/
	}
}