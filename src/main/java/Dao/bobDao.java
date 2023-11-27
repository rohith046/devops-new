package Dao;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import antlr.collections.List;
import dto.dto;
import servlethwjj.ball;

public class bobDao {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m = f.createEntityManager();
	EntityTransaction t = m.getTransaction();

	public void insert(dto b) {
		t.begin();
		m.persist(b);
		t.commit();
	}
	
	public void update(int id ,String new_name){
		dto b=m.find(dto.class, id);
		if(b!=null) {
			b.setName(new_name);
			t.begin();
			m.merge(b);
			t.commit();
		}
	}

	public Object fetch(String email) {
		dto b = m.find(dto.class, email);
		if (b != null) {
			return b.getPassword();

		} else {
			return"data not available";
		}
		
		
		

	}

	public java.util.List<dto> fetchALl() throws IOException {

		Query q = m.createQuery("select a from bob a");
		java.util.List<dto> d = q.getResultList();
		return d;
		

	}

	public void delete(int id) {
		dto b = m.find(dto.class, id);
		t.begin();
		m.remove(b);
		t.commit();
		System.out.println("******data removed*******");
		
	}

	public String deleteAll() {
		Query q = m.createQuery("select a from bob a");
		java.util.List<dto> d = q.getResultList();
		if (d.isEmpty()) {
			return "no data found";
		} else {
			for (dto b : d) {
				t.begin();
				m.remove(b);
				t.commit();
			}
		}
		return "data deleted";

	}
}
