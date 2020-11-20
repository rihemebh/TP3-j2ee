import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import tp3_jee.ICatalogue;
import tp3_jee.CatalogueImpl;
import tp3_jee.ProduitModele;
import tp3_jee.Produit;


/**
 * Servlet implementation class ControleurServlet
 */
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
private ICatalogue metier;
@Override
public void init() throws ServletException { 
	metier =new CatalogueImpl();
}
@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException, IOException {
   
	String mc=request.getParameter("motCle"); 
	ProduitModele mod = new ProduitModele();
	mod.setMotCle(mc);
	List<Produit> prods = metier.getProduitsParMotCle(mc); 
	mod.setProduits(prods);
	request.setAttribute("modele", mod);
	request.getRequestDispatcher("ProduitsView.jsp").forward(request,response);
	}
	}