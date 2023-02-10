package com.weirdoc.recommendationservice.service;

import com.weirdoc.recommendationservice.model.Recommendation;
import java.util.List;

public interface RecommendationService {
	Recommendation getRecommendationById(Long recommendationId);
    Recommendation saveRecommendation(Recommendation recommendation);
    List<Recommendation> getAllRecommendationByProductName(String productName);
    void deleteRecommendation(Long id);
}
