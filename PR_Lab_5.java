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
	}
}