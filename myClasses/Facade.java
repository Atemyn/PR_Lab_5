package myClasses;
import java.util.Scanner;

public class Facade
{
	private int windowsAmount;
	private int openedWindowsAmount;
	// Функция по заданию приватных полей класса.
	public void setFacade(int windowsAmount, int openedWindowsAmount)
	{
		this.windowsAmount = windowsAmount;
		this.openedWindowsAmount = openedWindowsAmount;
	}
	// Функция, возвращающая значение поля windowsAmount.
	public int getWindowsAmount()
	{
		return windowsAmount;
	}
	// Функция, возвращающая значение поля openedWindowsAmount.
	public int getOpenedWindowsAmount()
	{
		return openedWindowsAmount;
	}
	// Функция, выводящая приватные поля в консоль.
	public void getFacade()
	{
		System.out.println("Общее количество окон: " + windowsAmount);
		System.out.println("Количество открытых окон: " + openedWindowsAmount);
	}
	// Функция по вводу полей.
	public void inputFacade()
	{
		System.out.print("Введите общее количество окон вашего здания: ");
		Scanner scanner = new Scanner(System.in);
		windowsAmount = scanner.nextInt();
		while (windowsAmount <= 0)
		{
			System.out.print("Неверный ввод количества окон - оно должно быть целым неотрицательным числом. Попробуйте еще раз: ");
			scanner = new Scanner(System.in);
			windowsAmount = scanner.nextInt();
		}

		System.out.print("Введите количество открытых окон вашего здания: ");
		scanner = new Scanner(System.in);
		openedWindowsAmount = scanner.nextInt();
		while (openedWindowsAmount <= 0 || openedWindowsAmount > windowsAmount)
		{
			System.out.print("Неверный ввод количества открытых окон - оно должно быть не меньше нуля и не больше общего числа окон. Попробуйте еще раз: ");
			scanner = new Scanner(System.in);
			openedWindowsAmount = scanner.nextInt();
		}
	}
	// Функция по открытию определенного числа окон.
	public void openWindows()
	{
		int windowsToOpen;
		System.out.print("Введите количество окон, которые вы хотите открыть: ");
		Scanner scanner = new Scanner(System.in);
		windowsToOpen = scanner.nextInt();
		while (windowsToOpen < 0 || windowsToOpen > (windowsAmount - openedWindowsAmount))
		{
			System.out.print("Неверный ввод количества окон для открытия - оно должно быть не меньше нуля и не больше возможного для открытия числа окон. Попробуйте еще раз: ");
			scanner = new Scanner(System.in);
			windowsToOpen = scanner.nextInt();
		}
		openedWindowsAmount += windowsToOpen;
	}
	// Функция по закрытию определенного числа окон.
	public void closeWindows()
	{
		int windowsToClose;
		System.out.print("Введите количество окон, которые вы хотите закрыть: ");
		Scanner scanner = new Scanner(System.in);
		windowsToClose = scanner.nextInt ();
		while (windowsToClose < 0 || windowsToClose > openedWindowsAmount)
		{
			System.out.print("Неверный ввод количества окон для закрытия - оно должно быть не меньше нуля и не больше числа открытых окон. Попробуйте еще раз: ");
			scanner = new Scanner(System.in);
			windowsToClose = scanner.nextInt();
		}

		openedWindowsAmount -= windowsToClose;
	}
	// Функция по сложению двух объектов класса Facade.
	void addToFacade(Facade facadeToAdd)
	{
		windowsAmount += facadeToAdd.windowsAmount;
		openedWindowsAmount += facadeToAdd.openedWindowsAmount;
	}
};