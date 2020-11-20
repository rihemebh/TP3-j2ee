package tp3_jee;

import java.util.List;
public class testCatalogue {
public static void main(String[] args) { 
	CatalogueImpl metier= new CatalogueImpl();
List<Produit> prods = metier.getProduitsParMotCle("prod");
for (Produit p : prods) System.out.println(p.getNomProduit());
}
}