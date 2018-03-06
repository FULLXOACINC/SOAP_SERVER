/**
 * ArticleServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package by.zhuk.aipos.service;

import by.zhuk.aipos.model.xsd.Article;
import by.zhuk.aipos.util.ArticleService;

import java.io.IOException;


public class ArticleServiceSkeleton {

    private ArticleService service;

    public ArticleServiceSkeleton() {
        service = new ArticleService();
    }

    public by.zhuk.aipos.service.GetArticlesNameResponse getArticlesName(
            by.zhuk.aipos.service.GetArticlesName getArticlesName) {
        GetArticlesNameResponse res =
                new GetArticlesNameResponse();
        res.set_return(service.getArticlesName().toArray(new String[0]));
        return res;

    }

    public by.zhuk.aipos.service.GetArticleResponse getArticle(
            by.zhuk.aipos.service.GetArticle getArticle)
            throws ArticleServiceIOExceptionException {
        GetArticleResponse res =
                new GetArticleResponse();
        Article article;
        try {
            article = service.getArticle(getArticle.getName());
        } catch (IOException e) {
            throw new ArticleServiceIOExceptionException();
        }
        res.set_return(article);
        return res;
    }

    public void updateArticle(by.zhuk.aipos.service.UpdateArticle updateArticle)
            throws ArticleServiceIOExceptionException {
        try {
            service.updateArticle(updateArticle.getArticle());
        } catch (IOException e) {
            throw new ArticleServiceIOExceptionException();
        }
    }

    public void deleteArticle(by.zhuk.aipos.service.DeleteArticle deleteArticle)
            throws ArticleServiceIOExceptionException {
        try {
            service.deleteArticle(deleteArticle.getName());
        } catch (IOException e) {
            throw new ArticleServiceIOExceptionException();
        }
    }

    public void saveArticle(by.zhuk.aipos.service.SaveArticle saveArticle)
            throws ArticleServiceFileNotFoundExceptionException {
        try {
            service.saveArticle(saveArticle.getArticle());
        } catch (IOException e) {
            throw new ArticleServiceFileNotFoundExceptionException();
        }
    }

}
