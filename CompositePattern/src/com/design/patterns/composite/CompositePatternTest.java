package com.design.patterns.composite;

public class CompositePatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent panCakeHouseMenu = new Menu("PanCake House Menu", "Breakfast");
		MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
		MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
		MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course!!!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(panCakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		dinerMenu.add(new MenuItem("Chicken Chipotle", "Grilled chicken breast with chipotle sauce", false, 10.99));
		dinerMenu.add(new MenuItem("Choripolo", "Grillen chicken topped with chorizo", false, 11.99));
		dinerMenu.add(new MenuItem("Veg Fajitas", "Grilled vegetables", true, 8.99));
		
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("ChocoLava Cake", "Brownie with vanilla cream", false, 1.99));
		dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with pecans", true, 2.99));
		
		panCakeHouseMenu.add(new MenuItem("RedVelvetPanCake", "Red Velvet Flavor with Cream", true, 3.99));
		panCakeHouseMenu.add(new MenuItem("ChocolateChipPanCake", "Chocolate Flavor with chocolate chips", true, 3.99));
		panCakeHouseMenu.add(new MenuItem("ButterMilkPanCake", "Traditional Butter Milk Flavor", true, 2.99));
		
		cafeMenu.add(new MenuItem("Pizza", "Chicken pizza with buffalo sauce", false, 10.99));
		cafeMenu.add(new MenuItem("Pasta", "Mushroom Pasta with cheddar cheese", true, 8.99));
		cafeMenu.add(new MenuItem("Burger", "Double Stack Steak Burger", false, 9.99));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		waitress.printVegeterianMenu();
	}

}
