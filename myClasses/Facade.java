package myClasses;
import java.util.Scanner;

public class Facade
{
	private int windowsAmount;
	private int openedWindowsAmount;
	// �㭪�� �� ������� �ਢ���� ����� �����.
	public void setFacade(int windowsAmount, int openedWindowsAmount)
	{
		this.windowsAmount = windowsAmount;
		this.openedWindowsAmount = openedWindowsAmount;
	}
	// �㭪��, ��������� ���祭�� ���� windowsAmount.
	public int getWindowsAmount()
	{
		return windowsAmount;
	}
	// �㭪��, ��������� ���祭�� ���� openedWindowsAmount.
	public int getOpenedWindowsAmount()
	{
		return openedWindowsAmount;
	}
	// �㭪��, �뢮���� �ਢ��� ���� � ���᮫�.
	public void getFacade()
	{
		System.out.println("��饥 ������⢮ ����: " + windowsAmount);
		System.out.println("������⢮ ������� ����: " + openedWindowsAmount);
	}
	// �㭪�� �� ����� �����.
	public void inputFacade()
	{
		System.out.print("������ ��饥 ������⢮ ���� ��襣� ������: ");
		Scanner scanner = new Scanner(System.in);
		windowsAmount = scanner.nextInt();
		while (windowsAmount <= 0)
		{
			System.out.print("������ ���� ������⢠ ���� - ��� ������ ���� 楫� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			windowsAmount = scanner.nextInt();
		}

		System.out.print("������ ������⢮ ������� ���� ��襣� ������: ");
		scanner = new Scanner(System.in);
		openedWindowsAmount = scanner.nextInt();
		while (openedWindowsAmount <= 0 || openedWindowsAmount > windowsAmount)
		{
			System.out.print("������ ���� ������⢠ ������� ���� - ��� ������ ���� �� ����� ��� � �� ����� ��饣� �᫠ ����. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			openedWindowsAmount = scanner.nextInt();
		}
	}
	// �㭪�� �� ������ ��।�������� �᫠ ����.
	public void openWindows()
	{
		int windowsToOpen;
		System.out.print("������ ������⢮ ����, ����� �� ��� ������: ");
		Scanner scanner = new Scanner(System.in);
		windowsToOpen = scanner.nextInt();
		while (windowsToOpen < 0 || windowsToOpen > (windowsAmount - openedWindowsAmount))
		{
			System.out.print("������ ���� ������⢠ ���� ��� ������ - ��� ������ ���� �� ����� ��� � �� ����� ���������� ��� ������ �᫠ ����. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			windowsToOpen = scanner.nextInt();
		}
		openedWindowsAmount += windowsToOpen;
	}
	// �㭪�� �� ������� ��।�������� �᫠ ����.
	public void closeWindows()
	{
		int windowsToClose;
		System.out.print("������ ������⢮ ����, ����� �� ��� �������: ");
		Scanner scanner = new Scanner(System.in);
		windowsToClose = scanner.nextInt ();
		while (windowsToClose < 0 || windowsToClose > openedWindowsAmount)
		{
			System.out.print("������ ���� ������⢠ ���� ��� ������� - ��� ������ ���� �� ����� ��� � �� ����� �᫠ ������� ����. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			windowsToClose = scanner.nextInt();
		}

		openedWindowsAmount -= windowsToClose;
	}
	// �㭪�� �� ᫮����� ���� ��ꥪ⮢ ����� Facade.
	void addToFacade(Facade facadeToAdd)
	{
		windowsAmount += facadeToAdd.windowsAmount;
		openedWindowsAmount += facadeToAdd.openedWindowsAmount;
	}
};