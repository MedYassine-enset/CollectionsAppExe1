import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppProduit {
    public static void main(String[] args) {
        List<Produit> produits=new ArrayList<>();
        //Q1
        Produit p1=new Produit(1,"HP",18000);
        Produit p2=new Produit(2,"MAC",28000);
        Produit p3=new Produit(3,"DELL",19000);
        produits.add(p1);
        produits.add(p2);
        produits.add(p3);
        //Q2
        produits.remove(0);
        //Q3
        for (Produit p:produits){
            System.out.println(p);
        }
        //Q4
        System.out.println("***********************");
        produits.get(0).setPrix(25000);
        for (Produit p:produits){
            System.out.println(p);
        }
        //Q5
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrez un mot clé");
        String keyWord= scanner.next();
        for (Produit p:produits){
            if (p.getNom().contains(keyWord)){
                System.out.println(p);
            }
        }

    }
}
