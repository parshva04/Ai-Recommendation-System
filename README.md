# AI-BASED-RECOMMENDATION-SYSTEM

COMPANY: CODTECH IT SOLUTIONS

NAME: PARSHVA SHAH

INTERN ID: CTIS4370

DOMAIN: Java Programming

DURATION: 12 Weeks

MENTOR: NEELA SANTOSH

## DESCRIPTION OF TASK
The objective of this task was to build an AI-based recommendation system using Java and machine learning libraries. Recommendation systems are widely used in modern applications such as e-commerce platforms, streaming services, and social media to suggest products or content based on user preferences and behavior.

In this project, a recommendation engine was implemented using the Apache Mahout library. Apache Mahout is a machine learning framework that provides scalable algorithms for collaborative filtering, clustering, and classification. The recommendation system in this task is based on collaborative filtering, which analyzes user-item interactions and predicts items that a user might prefer.

The application reads a dataset containing user IDs, item IDs, and ratings from a CSV file. This dataset represents user preferences for different items. Using this data, the system calculates similarity between users using the Pearson Correlation Similarity algorithm. After identifying similar users, the system determines which items those users liked and recommends similar items to the target user.

The program loads the dataset, builds a data model, calculates similarity between users, identifies the nearest neighbors, and generates recommendations for a specific user. The recommended items are displayed along with their predicted recommendation scores.

This task helped in understanding how AI-powered recommendation systems work and how machine learning libraries can be integrated into Java applications to process user preference data and generate intelligent suggestions.

## CONCEPTS USED

Operation | Class Used
----------|-----------
Data Model Creation | FileDataModel
User Similarity Calculation | PearsonCorrelationSimilarity
Neighbor Selection | NearestNUserNeighborhood
Recommendation Engine | GenericUserBasedRecommender
Recommendation Output | RecommendedItem
Error Handling | Try-Catch (Exception Handling)

## PROJECT STRUCTURE

RecommendationSystem/

├── RecommendationEngine.java  
├── data.csv  
├── lib/  
│   ├── mahout-core.jar  
│   ├── mahout-math.jar  
│   ├── mahout-integration.jar  
│   ├── slf4j-api.jar  
│   ├── slf4j-simple.jar  
│   ├── guava.jar  
│   └── commons-math3.jar  
├── README.md  
└── .gitignore  

## FEATURES

- AI-based recommendation system using collaborative filtering  
- User similarity calculation using Pearson correlation  
- Identifies nearest neighbor users  
- Recommends products based on similar user preferences  
- Reads dataset from CSV file  
- Displays recommended items with prediction scores  
- Exception handling implemented  

## TECHNOLOGIES / TOOLS USED

Java (JDK 8+)  
Apache Mahout  
Java IO (File Handling)  
CSV Dataset  
Command Prompt / PowerShell  
Git & GitHub  

## HOW TO RUN

Compile

javac -cp ".;lib/*" RecommendationEngine.java

Run

java -cp ".;lib/*" RecommendationEngine

## SAMPLE OUTPUT

Recommended items for User 1:

Item ID: 104 Score: 4.2  
Item ID: 105 Score: 4.4  

## LEARNING OUTCOME

Understanding AI-based recommendation systems  
Learning collaborative filtering techniques  
Working with Apache Mahout machine learning library  
Processing user preference datasets  
Building intelligent recommendation engines in Java
