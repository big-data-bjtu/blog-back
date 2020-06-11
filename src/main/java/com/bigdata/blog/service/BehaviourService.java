package com.bigdata.blog.service;


import com.bigdata.blog.dao.*;
import com.bigdata.blog.model.Browse;
import com.bigdata.blog.model.Collection;
import com.bigdata.blog.model.Review;
import com.bigdata.blog.model.Support;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BehaviourService {

    @Autowired
    private BrowseDao browseDao;

    @Autowired
    private SupportDao supportDao;

    @Autowired
    private CollectionDao collectionDao;

    @Autowired
    private ReviewDao reviewDao;

    @Autowired
    private ArticleService articleService;

    public void createBrowse(int userId, int articleId){
        Browse browse = new Browse();
        browse.setUserId(userId);
        browse.setArticleId(articleId);
        browse.setTime(System.currentTimeMillis());
        browseDao.save(browse);
        articleService.addBrowse(articleId);
    }

    public void createSupport(int userId, int articleId){
        Support support =new Support();
        support.setUserId(userId);
        support.setArticleId(articleId);
        support.setTime(System.currentTimeMillis());
        supportDao.save(support);
        articleService.addSupport(articleId);
    }

    public void createCollection(int userId,int articleId){
        Collection collection = new Collection();
        collection.setUserId(userId);
        collection.setArticleId(articleId);
        collection.setTime(System.currentTimeMillis());
        collectionDao.save(collection);
        articleService.addCollection(articleId);
    }

    public void createReview(int userId, int articleId, String content, int fatherId){
        Review review = new Review();
        review.setArticleId(articleId);
        review.setFatherId(fatherId);
        review.setUserId(userId);
        review.setContent(content);
        review.setTime(System.currentTimeMillis());
        reviewDao.save(review);
        articleService.addReview(articleId);

    }

    public Object getArticleReview(int articleId){
        return reviewDao.findByArticleId(articleId);
    }

}
