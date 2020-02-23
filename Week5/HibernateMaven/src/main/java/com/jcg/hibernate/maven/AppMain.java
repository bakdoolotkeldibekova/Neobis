package Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class AppMain {
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		AppMain runner = new AppMain();

		//runner.addCpu("corrrr", 45, 258);
		//runner.updateEmployee(2, 50000);
		//runner.removeCpu(4);

		List cpuList = runner.listCpu();
		for (Object cpu: cpuList) {
			System.out.println(cpu);
		}
	}

	public void addCpu(String model, int n, double f) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		transaction = session.beginTransaction();
		Cpu cpu = new Cpu(model ,n, f);
		session.save(cpu);
		transaction.commit();
		session.close();
	}

	public List listCpu() {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = null;

		transaction = session.beginTransaction();
		List developers = session.createQuery("FROM Cpu").list();

		transaction.commit();
		session.close();
		return developers;
	}

    public void updateEmployee(int Id, int nucleus) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Cpu cpu = (Cpu) session.get(Cpu.class, Id);
        cpu.setNucleus(nucleus);
        session.update(cpu);
        transaction.commit();
        session.close();
    }

    public void removeCpu(int Id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
			Cpu cpu = (Cpu) session.get(Cpu.class,Id);
        session.delete(cpu);
        transaction.commit();
        session.close();
    }

}
