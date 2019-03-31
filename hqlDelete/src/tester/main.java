package tester;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		String qry = "delete from Dinga where id=3";
		Query qr1 = s.createQuery(qry);
		// Insert upadte and delete
		qr1.executeUpdate();// list for select
		tr.commit();
		s.close();
	}
}
