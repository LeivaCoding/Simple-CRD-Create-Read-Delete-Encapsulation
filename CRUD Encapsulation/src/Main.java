import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	Vector<Weapon> vecWeapon = new Vector<>();
	Random rand = new Random();

	Weapon w;
	int menu, maxAmmo;
	String name, id, rarity;

	public Main() {
		do {
			cls();
			System.out.println("Apex Weapon List");
			System.out.println("================");
			System.out.println("1. Add weapon");
			System.out.println("2. View weapon");
			System.out.println("3. Remove weapon");
			System.out.println("4. Exit");
			System.out.print("Choose >> ");
			menu = scan.nextInt();
			scan.nextLine();
			if (menu == 1) {
				cls();
				do {
					System.out.print("Insert weapon's name [3 - 20 characters]: ");
					name = scan.nextLine();
				} while (name.length() < 3 || name.length() > 20);
				do {
					System.out.print("Choose weapon rarity [Common|Rare|Epic]: ");
					rarity = scan.nextLine();
				} while (!rarity.equals("Common") && !rarity.equals("Rare") && !rarity.equals("Epic"));
				do {
					System.out.print("Input max ammo [2 - 50]: ");
					maxAmmo = scan.nextInt();
					scan.nextLine();
				} while (maxAmmo < 2 || maxAmmo > 50);

				id = "" + Math.abs(rand.nextInt() % 10) + Math.abs(rand.nextInt() % 10) + Math.abs(rand.nextInt() % 10);

				w = new Weapon(id, name, rarity, maxAmmo);
				vecWeapon.add(w);
				
				System.out.println("Insert Success!");
				scan.nextLine();
				
			} else if (menu == 2) {
				cls();
				if (vecWeapon.size() == 0) {
					System.out.println("There are no weapon!");
					scan.nextLine();
				} else {
					viewWeapon();
					scan.nextLine();
				}
			} else if (menu == 3) {
				cls();
				if (vecWeapon.size() == 0) {
					System.out.println("There are no weapon!");
					scan.nextLine();
				} else {
					viewWeapon();
					System.out.print("Insert weapon ID: ");
					id = scan.nextLine();
					int index = 0, flag = 0;
					for (Weapon weapon : vecWeapon) {
						if (weapon.getId().equals(id)) {
							flag = 1;
							vecWeapon.remove(index);
							break;
						}
						index++;
					}
					if (flag == 0) {
						System.out.println("Weapon not found!");
						scan.nextLine();
					}
				}
			}
		} while (menu != 4);
	}

	private void viewWeapon() {
		System.out.println("Weapon List");
		System.out.println("===========");
		for (Weapon weapon : vecWeapon) {
			System.out.println(
					weapon.getId() + " " + weapon.getName() + " " + weapon.getRarity() + " " + weapon.getMaxAmmo());
		}
		System.out.println("===========");
	}
	
	private void cls() {
		for(int q=1;q<=100;q++)
			System.out.println();
	}

	public static void main(String[] args) {
		new Main();
	}
}
