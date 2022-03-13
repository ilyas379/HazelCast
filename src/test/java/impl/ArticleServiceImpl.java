package impl;

import api.Article;
import config.TestConfig;
import io.restassured.response.ValidatableResponse;
import lombok.NonNull;
import service.ArticleService;
import lombok.extern.log4j.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

@Log4j2
public class ArticleServiceImpl implements ArticleService {
    TestConfig testConfig = new TestConfig();

    public List<Article> getArticles(String url) {
        String URL = testConfig.getURL() + url;

        List<Article>articles = new ArrayList<Article>();

        ValidatableResponse r = given().log().everything()
//                .contentType("application/json")
                .get(URL)
                .then().log().ifError();
        try {
             articles = r.extract().jsonPath().getList("articles.", Article.class);
        } catch (Exception e) {
            log.error("Article request exception: " + Arrays.toString(e.getStackTrace()));
        }

        return articles;
    }

    public static void main(String[] args) {
        System.out.println("nu privet");
        System.out.println("commit");

    }
}
