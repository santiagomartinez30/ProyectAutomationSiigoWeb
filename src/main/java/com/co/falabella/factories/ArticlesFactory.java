package com.co.falabella.factories;

import com.co.falabella.exceptions.NotFoundException;
import com.co.falabella.models.ArticlesModel;
import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class ArticlesFactory {
    private static final String USERS_PATH = "json/articles.json";

    private ArticlesFactory() {
    }

    public static ArticlesModel of(String code) {
        return getDataUsers().stream()
                .filter(user -> user.getCode()
                        .equals(code))
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException(String.format("data user with code %s not found", code)));
    }

    public static List<ArticlesModel> getDataUsers() {
        return Arrays.asList(from(getDataFile()).getObject("articlesData", ArticlesModel[].class));
    }

    @SneakyThrows
    private static URL getDataFile() {
        String path = USERS_PATH;
        URL filePath = ArticlesFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for articles: " + path);
        }
        return filePath;
    }
}
