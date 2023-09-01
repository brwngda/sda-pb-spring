package pl.sda.spring.springrestapi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi
 * @created 9/1/2023
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    //ryż,ser;ser,ryż
    List<Recipe> findAllByIngredientsContains(String ingredients, Pageable pageable);

    List<Recipe> findAllByComplexity(Complexity complexity, Pageable pageable);

    List<Recipe> findAllByDuration(int duration, Pageable pageable);

    Optional<Recipe> findByName(String name);//SELECT * FROM RECIPE WHERE name = 'name'
}
