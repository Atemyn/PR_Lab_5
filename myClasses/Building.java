package myClasses;
import java.util.Scanner;

public class Building
{
	// ����� ��஭� �᭮�����.
	private double sideLength;
	// ���� �㭤�����.
	private double basementHeight;
	// ���� �⠦�.
	private double floorHeight;
	// ������⢮ �⠦��.
	private int floorAmount;
	// ��ꥪ� ����� �ᠤ� ������, ᮤ�ঠ騩 ���ଠ�� �� ����� ������.
	private Facade facade = new Facade();
	// �����樥�� ��⮩稢���.
	private double stabilityFactor;
	/* �㭪�� �� ��⠭���� ��।����� ���祭�� � ᢮��⢠ ������� ����� Building. */
	private void setBuiling(double sideLength, double basementHeight, double floorHeight, int floorAmount, double stabilityFactor)
	{
		this.sideLength = sideLength;
		this.basementHeight = basementHeight;
		this.floorHeight = floorHeight;
		this.floorAmount = floorAmount;
		this.stabilityFactor = stabilityFactor;
	}
	/* �㭪�� �� �뢮�� ᢮��� ������� ����� Building. */
	public void getBuilding()
	{
		System.out.println("�����⢠ ������� ������:");
		System.out.println("����� ��஭� �᭮�����: " + sideLength);
		System.out.println("���� �㭤�����: " + basementHeight);
		System.out.println("���� �⠦�: " + floorHeight);
		System.out.println("������⢮ �⠦��: " + floorAmount);
		facade.getFacade();
		System.out.println("�����樥�� ��⮩稢���: " + stabilityFactor + "\n");
	}
	/* �㭪�� �� ������� ᢮��� �� 㬮�砭�� ������� ����� Building. */
	public void initBuilding()
	{
		setBuiling(1.0, 1.0, 1.0, 1, 1.0);
		facade.setFacade(0, 0);
	}
	/* �㭪�� �� ����� � ���������� ᢮��� ��� ������� ����� Building */
	public void inputBuilding()
	{
		// ����� �� ��ࠪ� ��� ����� ��� ����室���� ������.
		System.out.print("������ ����� ��஭� ��襣� ������: ");
		Scanner scanner = new Scanner(System.in);
		sideLength = scanner.nextDouble();
		while (sideLength <= 0)
		{
			System.out.print("������ ���� ����� ��஭� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			sideLength = scanner.nextDouble();
		}

		System.out.print("������ ����� �㭤����� ��襣� ������: ");
		scanner = new Scanner(System.in);
		basementHeight = scanner.nextDouble();
		while (basementHeight <= 0)
		{
			System.out.print("������ ���� ����� �㭤����� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			basementHeight = scanner.nextDouble();
		}

		System.out.print("������ ����� ������ �⠦� ��襣� ������: ");
		scanner = new Scanner(System.in);
		floorHeight = scanner.nextDouble();
		while (floorHeight <= 0)
		{
			System.out.print("������ ���� ����� �⠦� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			floorHeight = scanner.nextDouble();
		}

		System.out.print("������ ������⢮ �⠦�� ��襣� ������: ");
		scanner = new Scanner(System.in);
		floorAmount = scanner.nextInt();
		while (floorAmount <= 0)
		{
			System.out.print("������ ���� ������⢠ - ��� ������ ���� ������⥫�� 楫� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			floorAmount = scanner.nextInt();
		}
		facade.inputFacade();
		// ����� �����業� ��⮩稢���.
		stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
		// �᫨ �����樥�� ��⮩稢��� ����� 1 - ������ 㯠���; ����嫤�� ������ ���� �ࠪ���⨪
		if (stabilityFactor < 1.0)
		{
			System.out.println("������ �� ᬮ��� ������ � ���㫮!\n\n");
			initBuilding();
		}
		else
		{
			System.out.println("�⫨筮! ������ ����稫��� ��⮩稢� � �����樥�⮬ ��⮩稢��� k = " + stabilityFactor + ".\n\n");
		}
	}
	/* �㭪�� �� ᫮����� ���� ������஢ ����� Building, ��� build - �������, ����� �㤥� �ਡ��������. */
	public void addToBuilding(Building build)
	{
		System.out.println("�����頥� ��� ������... �� ᢮��⢠ ⠪��:");
		System.out.println("����� ��஭ �᭮�����: " + sideLength + " � " + build.sideLength + "\n" +
			"����� �㭤����⮢: " + basementHeight + " � " + build.basementHeight + "\n" + "����� �⠦��: " + floorHeight + " � " + build.floorHeight + "\n" +
			"������⢠ �⠦��: " + floorAmount + " � " + build.floorAmount + "\n" + "�����樥��� ��⮩稢���: " + stabilityFactor + " � " + build.stabilityFactor + "\n" + 
			"��騥 ������⢠ ����: " + facade.getWindowsAmount() + " � " + build.facade.getWindowsAmount() + "\n" +
			"������⢠ ������� ����: " + facade.getOpenedWindowsAmount() + " � " + build.facade.getOpenedWindowsAmount() + "\n");

		if (sideLength < build.sideLength)
			sideLength = build.sideLength;

		if (basementHeight < build.basementHeight)
			basementHeight = build.basementHeight;

		if (floorHeight < build.floorHeight)
			floorHeight = build.floorHeight;

		floorAmount = floorAmount + build.floorAmount;

		facade.addToFacade(build.facade);
		// ����� ������ �����樥�� ��⮩稢��� � �஢�ઠ ��� ���४⭮��.
		stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
		if (stabilityFactor < 1)
		{
			System.out.println("� ᮦ������, ��᫥ ᮢ��饭�� ���� ������ ����� ������ �ࠧ� �� ࠧ��������, ⠪ ��� ��� �����樥�� ��⮩稢��� k = " + stabilityFactor + " ����� �������.\n");
			initBuilding();
		}
		else
		{
			System.out.println("�⫨筮! ����� ������ ���﫮. ��� ᢮��⢠ ⠪��:");
			getBuilding();
		}
	}
	/* �㭪�� �� ���������� floorsToAdd �⠦�� �������� ����� Building. */
	public void addFloors()
	{
		int floorsToAdd;
		// ���� �� ��ࠪ� ��� ����� floorsToAdd.
		System.out.print("������ ������⢮ �⠦�� ��� ���������� � ��襬� ������: ");
		Scanner scanner = new Scanner(System.in);
		floorsToAdd = scanner.nextInt();
		while (floorsToAdd < 0)
		{
			System.out.print("������ ���� ������⢠ - ��� ������ ���� ������⥫�� 楫� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			floorsToAdd = scanner.nextInt();
		}

		floorAmount = floorAmount + floorsToAdd;
		// ����� ������ �����樥�� ��⮩稢��� � �஢�ઠ ��� ���४⭮��.
		stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
		if (stabilityFactor < 1.0)
		{
			System.out.println("�����樥�� �⠡��쭮�� ��襣� ������ k = " + stabilityFactor +
				" �⠫ ����� �������.\n��� ����� ������ � ������ �� ������. ���஡�� �������� ������⢮ �⠦�� � ���������� (���ਬ��, �� 0)\n");
			floorAmount = floorAmount - floorsToAdd;
			addFloors();
		}
		else
		{
			System.out.println("�⫨筮! ������ ����稫��� ��⮩稢� � �����樥�⮬ ��⮩稢��� k = " + stabilityFactor + "\n");
			// �⮡ࠦ���� ���ଠ樨 � ������.
			getBuilding();
		}
	}

	/* �㭪�� �� 㤠����� floorsToRemove �⠦�� � ������� ����� Building. */
	public void removeFloors()
	{
		int floorsToRemove;
		// ���� �� ��ࠪ� ��� ����� floorsToRemove.
		System.out.print("������ ������⢮ �⠦�� ��� 㤠����� � ��襣� ������: ");
		Scanner scanner = new Scanner(System.in);
		floorsToRemove = scanner.nextInt();
		while (floorsToRemove < 0 || floorsToRemove >= floorAmount)
		{
			System.out.print("������ ���� ������⢠ - ��� ������ ���� ������⥫�� 楫� �᫮� � ����訬 ��饣� �᫠ �⠦��. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			floorsToRemove = scanner.nextInt();
		}
		// ����� ������ �����樥�� ��⮩稢���.
		floorAmount = floorAmount - floorsToRemove;
		stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
		System.out.println("�⠦� �ᯥ譮 㤠����!");
		// �⮡ࠦ���� ���ଠ樨 � ������.
		getBuilding();
	}

	public void openWindowsOnFacade()
	{
		facade.openWindows();
		getBuilding();
	}

	public void closeWindowsOnFacade()
	{
		facade.closeWindows();
		getBuilding();
	}

};