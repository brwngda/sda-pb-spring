package pl.sda.spring.springrestapi;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi
 * @created 9/1/2023
 */

public class NoRecipeFoundException extends RuntimeException {

    public NoRecipeFoundException(Long id) {
        super(String.format("Can't find recipe with id %d", id));
    }
}
