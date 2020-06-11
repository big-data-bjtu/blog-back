package com.bigdata.blog;

import com.bigdata.blog.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArticleTest {

    @Autowired
    private ArticleService articleService;

    @Test
    void publishArticle(){
        String title = "word2Vec";
        String lable = "ML";
        String summary = "word2Vec\n" +
                "word2vec的核心是神经网络，采用 CBOW（Continuous Bag-Of-Words，即连续的词袋模型）和 Skip-Gram 两种模型，将词语映像到同一坐标系，输出为数值型向量的方法。";
        String content = "word2Vec\n" +
                "word2vec的核心是神经网络，采用 CBOW（Continuous Bag-Of-Words，即连续的词袋模型）和 Skip-Gram 两种模型，将词语映像到同一坐标系，输出为数值型向量的方法。简而言之，就是将人类才可以看懂的文字，转换为机器也可以识别、操作、处理的数值，将一串文字转化为一个数值型向量的过程。这个词向量的维度一般情况下要远远小于词语总数 V 的大小，所以 Word2vec 本质上是一种降维操作——把词语从 one-hot encoder 形式的表示降维到 Word2vec 形式的表示。\n" +
                "由word2vec思想，即考察前后文的关联性产生了这两个模型：Skip-gram是通过一个词a去预测它周围的上下文；而CBOW相反，是通过上下文来预测其间的词。CBOW一般用于数据，而Skip-Gram通常用在数据量较大的情况。";
        int type = 1;
        int authorId = 1;
        articleService.createArticle(title,lable,summary,content,type,authorId);
    }

}
