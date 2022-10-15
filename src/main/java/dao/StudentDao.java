package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.StudentDetails;

public class StudentDao
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
public void addStudent(StudentDetails details)
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(details);
	entityTransaction.commit();		
}
public StudentDetails findStudent(int id)
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	return entityManager.find(StudentDetails.class, id);	
}
public List<StudentDetails> findStudent() {
EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Query query=entityManager.createQuery("select c from StudentDetails c",StudentDetails.class);
	return query.getResultList();
}

}
