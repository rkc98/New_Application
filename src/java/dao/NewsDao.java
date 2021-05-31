/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.News;
import java.util.List;

/**
 *
 * @author hamee_000
 */
public interface NewsDao {
    public List<News> getAllNews();
    public List<News> getAllApprovedNews();
    public List<News> getUnAllApprovedNews();
    public News getNewsByID(int id);
    public List<News> getNewsByCategory(String cat);
    public List<News> getNewsByHeading(String head);
    public boolean addNews(News n);
    public boolean updateNews(News n);
    public boolean deleteNews(News n);
    
}
