package DAO;

import java.util.ArrayList;

import Metier.Pharmacie;

public interface Dao<A> {
	
		public A getByID(long id);
		public void save(A a); 
		public ArrayList<Pharmacie> getAll(); 
		public void update (A a,String[] args); 
		public void delete (A a);
		public String getnom();
		public String getemplacement();
		

}
