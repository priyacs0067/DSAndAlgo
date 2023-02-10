package myPackage;

import java.util.*;

class Solution {
    static final String EXPECTED_OUTPUT = String.join(
            System.getProperty("line.separator"),
            "==== Just Falafs ====",
            "    ~ Menu ~",
            "Starters",
            "dumplings, salad or peanuts",
            "",
            "Mains",
            "pasta, rice, bento or sushi",
            "",
            "Desserts",
            "strawberries, apples or cheese"
    );

    static final Map<String, List<String>> FOOD_CATEGORIES = Map.of(
            "starters", Arrays.asList(
                    "bread", "salad", "peanuts", "dumplings"
            ),
            "mains", Arrays.asList(
                    "steak", "bento", "chicken", "pizza", "sandwich", "wrap",
                    "sushi", "burger", "hotdog", "pasta", "burrito", "taco", "rice"
            ),
            "desserts", Arrays.asList(
                    "apples", "strawberries", "cheese", "ice-cream", "pie", "cake"
            )
    );

    static final List<String> CHEF_DISHES = Arrays.asList(
            "strawberries", "dumplings", "pasta", "rice", "apples", "salad",
            "peanuts", "cheese", "bento", "sushi"
    );

    public static void main(String [] args){

        Set keySet = FOOD_CATEGORIES.keySet();
        int countCategories = keySet.size();
        Object[] keyAsArray = keySet.toArray();
        List<String> chefDishesInMenu = new ArrayList<>();

        System.getProperty("line.separator");
        System.out.println("==== Just Falafs ====");
        System.out.println("    ~ Menu ~");
        System.out.println("");
        for(int i = 0 ;i < countCategories ;i++){
            String key = (String)keyAsArray[i];
            List<String> chefDishes = FOOD_CATEGORIES.get(key);
            System.out.println(capitalizeStr(key));
            for (String dish: chefDishes) {
                if(CHEF_DISHES.contains(dish)) {
                    chefDishesInMenu.add(dish);
                    System.out.print(dish +",");
                }
            }
//            printDishesInMenu(chefDishesInMenu);
            System.out.println("");
//            chefDishesInMenu = new ArrayList<>();
    }
}

    private static void printDishesInMenu(List<String> chefDishesInMenu) {
        int count = chefDishesInMenu.size();
        if(count<=2){
            System.out.println(chefDishesInMenu+ ",");
        }else {
            Object[] str = chefDishesInMenu.toArray();
            for (int i = 0;i < chefDishesInMenu.size()-2;i++) {
                System.out.print(str[i]+",");
            }
            System.out.print("or "+str[chefDishesInMenu.size()-1]);

        }

    }

    public static String capitalizeStr(String str) {
    if (str == null)
        return null;

    Character s = str.charAt(0);
    String strSplit = str.substring(1, str.length());
    return s.toString().toUpperCase().concat(strSplit);

}
}