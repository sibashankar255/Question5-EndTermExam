package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        int calories = 0;
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	calories =cal.calculateCalories(bread);
                        	System.out.println();
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	calories = cal.calculateCalories(bread, jam);
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	calories = cal.calculateCalories(bread, jam, butter);
                        	System.out.println();
                        	break;
                        }
                        System.out.printf("%.3f",cal.calculateEnergy(calories));
                        System.out.println(" kJ of energy generated from "+cal.returnCalories(calories)+" calories");
            }
}
class Calories {
            
            int calculateCalories(Integer bread) {
            	int cal =  bread*74;
            	return cal;
            }
            int calculateCalories(Integer bread, Integer jam) {
            	int cal = bread*74+jam*26;
            	return cal;
            }
            int calculateCalories(Integer bread, Integer jam, Integer butter) {
            	int cal = bread*74+jam*26+butter*102;
            	return cal;
            }
            double returnCalories(int calories) {
            	return calories;
            }
            double calculateEnergy(int calories) {
            	double energy = calories*4.1868;
            	return energy;
            }
            
            
}
