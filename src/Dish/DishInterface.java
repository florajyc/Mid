package Dish;

import java.util.List;

public interface DishInterface {

	    //  @return Back to pizza menu
	    public List<Dish> initMenu();

	    //  @param dishList pizza list
	    public void showMenu(List<Dish> dishList);

	    //  @param orderedList Current ordered items
	    public void showOrderedMenu(List<Dish> orderedList);

	    // Delete dish items
	    // @param id          Item No.
	    // @param dishList    Item list
	    // @param orderedList Ordered item list
	    public void deleteDish(int id, List<Dish> dishList, List<Dish> orderedList);

	    // Check and make payment
	    // @param orderedList
	    public void checkout(List<Dish> orderedList);
	}