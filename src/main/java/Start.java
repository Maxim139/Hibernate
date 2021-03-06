import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Start {

    public static void main(String[] args) {

        EntityManagerHelper helper = EntityManagerHelper.getInstance();

        EntityManager em = helper.getEntityManager();

        EntityTransaction trx = em.getTransaction();

        trx.begin();

        Student student = new Student();
        Laptop laptop = new Laptop();
        Teacher teacher = new Teacher();
        Group group = new Group();


        student.setName("Max");
        student.setAge(22);
        student.setLaptop(laptop);

        group.setTeachers(teacher);
        group.setStudents(student);
        teacher.setGroups(group);

        em.persist(student);
        em.persist(laptop);
        em.persist(teacher);
        em.persist(group);
        System.out.println("!!!"+student);

        trx.commit();
        em.close();

    }

}
