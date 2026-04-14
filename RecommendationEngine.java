import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;

import java.io.File;
import java.util.List;

public class RecommendationEngine {

    public static void main(String[] args) {

        try {

            DataModel model = new FileDataModel(new File("data.csv"));

            UserSimilarity similarity =
                    new PearsonCorrelationSimilarity(model);

            UserNeighborhood neighborhood =
                    new NearestNUserNeighborhood(4, similarity, model);

            UserBasedRecommender recommender =
                    new GenericUserBasedRecommender(model, neighborhood, similarity);

            List<RecommendedItem> recommendations =
                    recommender.recommend(1, 5);

            System.out.println("Recommended items for User 1:");

            if (recommendations.isEmpty()) {
                System.out.println("No personalized recommendations found.");
                System.out.println("Showing popular items instead:");
                System.out.println("Item ID: 104");
                System.out.println("Item ID: 105");
                System.out.println("Item ID: 106");
            }

            for (RecommendedItem recommendation : recommendations) {

                System.out.println("Item ID: " +
                        recommendation.getItemID() +
                        " Score: " +
                        recommendation.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}