package resources;

public class DBConstants {
	
	/*
	 * Database connection information
	 */
	final public static String host = "co2_sche";
	final public static String user = "root";
	final public static String pass = "password";
	
	/*
	 * Database table names
	 */
	final public static String table_user = host + ".user";
	final public static String table_recipe = host + ".recipe";
	final public static String table_mealplan = host + ".mealplan";
	final public static String table_mealplan_recipe = host + ".mealplan_recipe";
	
	final public static String table_recipe_review = host + ".recipe_review";
	final public static String table_mealplan_review = host + ".mealplan_review";
	
	final public static String table_action = host + ".action";
	final public static String table_instruction = host + ".instruction";	
	final public static String table_ingredient = host + ".ingredient";
	final public static String table_unit = host + ".unit";
	final public static String table_instingunit = host + ".instingunit";

	final public static String table_images = host + ".image";
}