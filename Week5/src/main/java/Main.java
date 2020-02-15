import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.List;

public class Main {
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    public static void main(String[] args) throws HibernateException {
        Configuration configuration = new Configuration();
        configuration.configure();

        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Main cpu = new Main();

        //Adding Cpu to the DB:
        cpu.addCpu(1, "intel", 2, 16000);
        cpu.addCpu(2, "corei 5", 4, 19000);

        System.out.println("List of Cpu: ");
        List cpuList = cpu.listCpu();
        for (Object c: cpuList) {
            System.out.println(c);
        }

        System.out.println("\n\nUpdating and Removing Cpu");
        cpu.updateCpu(3, 50000);
        cpu.removeCpu(1);

    }

    public void addCpu(int id, String model, int nucleus, double frequency) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Cpu cpu1 = new Cpu(id, model, nucleus, frequency);
        session.save(cpu1);
        transaction.commit();
        session.close();
    }

    public List listCpu() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List list = session.createQuery("from Cpu").list();

        transaction.commit();
        session.close();
        return list;
    }

    public void updateCpu(int Id, double frequency) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Cpu cpu = (Cpu) session.get(Cpu.class, Id);
        cpu.setFrequency(frequency);
        session.update(cpu);
        transaction.commit();
        session.close();
    }

    public void removeCpu(int Id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Cpu cpu = (Cpu) session.get(Cpu.class, Id);
        session.delete(cpu);
        transaction.commit();
        session.close();
    }

}
