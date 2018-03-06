/**
 * ArticleServiceSkeleton.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package by.zhuk.aipos.service;

import by.zhuk.aipos.model.xsd.Article;
import by.zhuk.aipos.util.ArticleService;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArticleServiceSkeleton {

    private final static String PATH = "articles/";
    private ArticleService service;

    public ArticleServiceSkeleton() {
        service = new ArticleService();
    }

    public by.zhuk.aipos.service.GetArticlesNameResponse getArticlesName(
            by.zhuk.aipos.service.GetArticlesName getArticlesName) {
        GetArticlesNameResponse res =
                new GetArticlesNameResponse();
        File[] directories = new File(PATH).listFiles(File::isDirectory);
        List<String> result = new ArrayList<>();
        if (directories != null) {
            for (File directory : directories) {
                result.add(directory.getName());
            }
        }
        Collections.sort(result);

        res.set_return(result.toArray(new String[0]));
        return res;

    }

    public by.zhuk.aipos.service.GetArticleResponse getArticle(
            by.zhuk.aipos.service.GetArticle getArticle)
            throws ArticleServiceIOExceptionException {
        GetArticleResponse res =
                new GetArticleResponse();
        Article article = new Article();
        String intro;
        String body;
        String codeExample;
        try {
            intro = readFile(PATH + getArticle.getName() + "/intro");
            body = readFile(PATH + getArticle.getName() + "/body");
            codeExample = readFile(PATH + getArticle.getName() + "/examples");
        } catch (IOException e) {
            throw new ArticleServiceIOExceptionException(e);
        }
        article.setName(getArticle.getName());
        article.setInto(intro);
        article.setBody(body);
        article.setCodeExample(codeExample);

        res.set_return(article);
        return res;
    }

    public void updateArticle(by.zhuk.aipos.service.UpdateArticle updateArticle)
            throws ArticleServiceIOExceptionException {
        Article article = updateArticle.getArticleThrift();
        File directory = new File(PATH + article.getName());
        try {
            FileUtils.deleteDirectory(directory);
        } catch (IOException e) {
            throw new ArticleServiceIOExceptionException(e);
        }
        File file = new File(PATH + article.getName());
        boolean isCreate = file.mkdir();
        if (!isCreate) {
            //articleServer.log("Can't save article " + articleThrift);
            return;
        }
        try (PrintWriter outIntro = new PrintWriter(PATH + article.getName() + "/intro");
             PrintWriter outBody = new PrintWriter(PATH + article.getName() + "/body");
             PrintWriter outExamples = new PrintWriter(PATH + article.getName() + "/examples")) {
            outIntro.println(article.getInto());
            outBody.println(article.getBody());
            outExamples.println(article.getCodeExample());
        } catch (FileNotFoundException e) {
//            articleServer.log("ERROR " + e.getMessage());
            throw new ArticleServiceIOExceptionException(e);
        }
    }

    public void deleteArticle(by.zhuk.aipos.service.DeleteArticle deleteArticle)
            throws ArticleServiceIOExceptionException {
        File directory = new File(PATH + deleteArticle.getName());
        try {
            FileUtils.deleteDirectory(directory);
        } catch (IOException e) {
            throw new ArticleServiceIOExceptionException(e);
        }
    }

    public void saveArticle(by.zhuk.aipos.service.SaveArticle saveArticle)
            throws ArticleServiceFileNotFoundExceptionException {
        Article article = saveArticle.getArticle();
        File file = new File(PATH + article.getName());
        boolean isCreate = file.mkdir();
        if (!isCreate) {
            //articleServer.log("Can't save article " + articleThrift);
            return;
        }
        try (PrintWriter outIntro = new PrintWriter(PATH + article.getName() + "/intro");
             PrintWriter outBody = new PrintWriter(PATH + article.getName() + "/body");
             PrintWriter outExamples = new PrintWriter(PATH + article.getName() + "/examples")) {
            outIntro.println(article.getInto());
            outBody.println(article.getBody());
            outExamples.println(article.getCodeExample());
        } catch (FileNotFoundException e) {
//            articleServer.log("ERROR " + e.getMessage());
            throw new ArticleServiceFileNotFoundExceptionException(e);
        }
    }

    private String readFile(String file) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        }
    }
}
