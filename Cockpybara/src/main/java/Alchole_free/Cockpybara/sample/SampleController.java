package Alchole_free.Cockpybara.sample;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    @GetMapping("/sample/search")
    @ResponseBody
    public ResponseEntity<List<SampleRecipe>> helloApi(@RequestParam("name") String name) {
        ArrayList<SampleRecipe> recipeList = new ArrayList<>();
        recipeList.add(new SampleRecipe("ABC", "2016-08-31 19:32:08", 13501L, Boolean.TRUE, "Shot", "http://www.thecocktaildb.com/images/media/drink/tqpvqp1472668328.jpg", "Shot glass", null, "Amaretto", "Bailey's irish cream", "Cognac", "Layered in a shot glass.", "1/3 ", "1/3 ", "1/3 ", null));
        recipeList.add(new SampleRecipe("ABC", "2016-08-31 19:32:08", 13501L, Boolean.TRUE, "Shot", "http://www.thecocktaildb.com/images/media/drink/tqpvqp1472668328.jpg", "Shot glass", null, "Amaretto", "Bailey's irish cream", "Cognac", "Layered in a shot glass.", "1/3 ", "1/3 ", "1/3 ", null));
        recipeList.add(new SampleRecipe("ABC", "2016-08-31 19:32:08", 13501L, Boolean.TRUE, "Shot", "http://www.thecocktaildb.com/images/media/drink/tqpvqp1472668328.jpg", "Shot glass", null, "Amaretto", "Bailey's irish cream", "Cognac", "Layered in a shot glass.", "1/3 ", "1/3 ", "1/3 ", null));
        return ResponseEntity.ok(recipeList);
    }
}
