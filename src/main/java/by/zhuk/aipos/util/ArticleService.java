package by.zhuk.aipos.util;

import by.zhuk.aipos.model.xsd.Article;
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

public class ArticleService {
    private final static String PATH = "articles/";

    public void saveArticle(Article article) throws FileNotFoundException {
        File file = new File(PATH + article.getName());
        boolean isCreate = file.mkdir();
        if (!isCreate) {
            throw new FileNotFoundException();
        }
        try (PrintWriter outIntro = new PrintWriter(PATH + article.getName() + "/intro");
             PrintWriter outBody = new PrintWriter(PATH + article.getName() + "/body");
             PrintWriter outExamples = new PrintWriter(PATH + article.getName() + "/examples")) {
            outIntro.println(article.getInto());
            outBody.println(article.getBody());
            outExamples.println(article.getCodeExample());
        }
    }

    public Article getArticle(String name) throws IOException {
        Article article = new Article();
        String intro;
        String body;
        String codeExample;
        intro = readFile(PATH + name + "/intro");
        body = readFile(PATH + name + "/body");
        codeExample = readFile(PATH + name + "/examples");

        article.setName(name);
        article.setInto(intro);
        article.setBody(body);
        article.setCodeExample(codeExample);


        return article;
    }


    public void deleteArticle(String name) throws IOException {
        File directory = new File(PATH + name);
        FileUtils.deleteDirectory(directory);

    }


    public void updateArticle(Article article) throws IOException {
        deleteArticle(article.getName());
        saveArticle(article);
    }


    public List<String> getArticlesName() {
        File[] directories = new File(PATH).listFiles(File::isDirectory);
        List<String> result = new ArrayList<>();
        if (directories != null) {
            for (File directory : directories) {
                result.add(directory.getName());
            }
        }
        Collections.sort(result);

        return result;
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