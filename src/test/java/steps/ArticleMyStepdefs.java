package steps;

import api.Article;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import impl.ArticleServiceImpl;
import service.ArticleService;

import java.util.List;

public class ArticleMyStepdefs {
    ArticleService articleService = new ArticleServiceImpl();

    @Given("Get Articles {string} Request")
    public void getArticlesRequestAndGetResponseWithCode(String url) {
        List<Article> articleList = articleService.getArticles(url);
        System.out.println(articleList);
    }

    @Then("Responce code is: {string}")
    public void responceCodeIs(String status) {

    }
}
