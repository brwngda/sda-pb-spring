package pl.sda.spring.springrestapi;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi
 * @created 9/1/2023
 */
public class RecipeAlreadyExistsException extends RuntimeException {

    public RecipeAlreadyExistsException(String recipeName) {
        super(String.format("Recipe %s already exists!", recipeName));
    }
}
