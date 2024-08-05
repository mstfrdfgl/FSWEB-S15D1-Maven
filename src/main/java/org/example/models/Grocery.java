package org.example.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList=new ArrayList<>();


    public void startGrocery(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one of the number 0,1,2");
        int number = scanner.nextInt();

        if(number==0){
            scanner.close();
        }else if(number==1){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
            String fruits=scanner1.nextLine();
            String[] fruitsTrim=fruits.split(",");
            for (String fruit: fruitsTrim){
                groceryList.add(fruit.trim());
            }
        }else if(number==2){
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
            String fruits=scanner2.nextLine();
            String[] fruitsTrim=fruits.split(",");
            for (String fruit: fruitsTrim){
                groceryList.remove(fruit.trim());
            }
        }else{
            System.out.println("Wrong number");
            scanner.close();
        }
    }
    public static boolean checkItemsInList(String product){
        Collections.sort(groceryList);

        return groceryList.contains(product);
    }
    public static void addItems(String input){
        String[] fruitsTrim=input.split(",");
            for (String fruit: fruitsTrim){
                if(!checkItemsInList(fruit)){
                    groceryList.add(fruit.trim());
                }
            }
        Collections.sort(groceryList);
    }public static void removeItems(String input){
        String[] fruitsTrim=input.split(",");
        for (String fruit: fruitsTrim){
            groceryList.remove(fruit.trim());
        }
        Collections.sort(groceryList);
    }
    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }

}
