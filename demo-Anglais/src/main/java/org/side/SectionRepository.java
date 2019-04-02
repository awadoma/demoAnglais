package org.side;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface SectionRepository extends JpaRepository<Section, Long>{
	public List<Section> findById(int id);
//	@Query("select s from Section Where ")
	public List<Section> findByuserEntry(String userEntry);
	 
	@Query("select p from Section p Where p.userEntry like :x")
		public List<Section> chercher(@Param("x")String userEntry);
		//public List<Etudiant> findByNomsStartsWith(String nom);

}
