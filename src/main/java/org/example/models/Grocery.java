package org.example.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList=new ArrayList<>();


    public void startGrocery(){
        Scanner scanner = new Scanner(System.in);
        boolean b=true;
        while (b){
            System.out.println("0.Çıkış,1.Malzeme Ekleme,2.Malzeme çıkarma. lütfen bu sayılardan birini girin.");
        int number = scanner.nextInt();
            if(number==0){
                b=false;
                System.out.println("Programdan çıkılıyor");
                break;
            }else if(number==1){
                Scanner scanner1=new Scanner(System.in);
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String fruits=scanner1.nextLine();
                String[] fruitsTrim=fruits.split(",");
                for (String fruit: fruitsTrim){
                    if (!checkItemsInList(fruit.trim())){
                    groceryList.add(fruit.trim());
                    }else{
                        System.out.println("Bu malzeme daha önce zaten eklenmmiş.");
                    }
                }
                System.out.println("Güncellenmiş liste: " + groceryList);
            }else if(number==2){
                Scanner scanner2=new Scanner(System.in);
                System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                String fruits=scanner2.nextLine();
                String[] fruitsTrim=fruits.split(",");
                for (String fruit: fruitsTrim){
                    groceryList.remove(fruit.trim());
                }
                System.out.println("Güncellenmiş liste: " + groceryList);

            }else{
                System.out.println("Hatalı numara tuşladınız. lütfen uyarıları dikkate alarak numara giriniz.");
                break;
            }
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
