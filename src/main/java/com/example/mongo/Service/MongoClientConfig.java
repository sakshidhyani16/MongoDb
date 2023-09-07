//package com.example.mongo.Service;
//
//
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.MongoException;
//import com.mongodb.ServerApi;
//import com.mongodb.ServerApiVersion;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//
//public class MongoClientConfig extends AbstractMongoClientConfiguration {
//	
//	
//	    @Bean
//	    @Override
//	    public MongoClient mongoClient() {
//	        ConnectionString connectionString = new ConnectionString("mongodb+srv://sakshi9:<password>@cluster0.ko7tjq9.mongodb.net/?retryWrites=true&w=majority");
//	        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
//	                .applyConnectionString(connectionString)
//	                .build();
//
//	        return MongoClients.create(mongoClientSettings);
//	    
//	
////    public static void main(String[] args) {
////        String connectionString = "mongodb+srv://sakshi9:HTFkI7pvjL8oprvp@cluster0.ko7tjq9.mongodb.net/?retryWrites=true&w=majority";
////
////        ServerApi serverApi = ServerApi.builder()
////                .version(ServerApiVersion.V1)
////                .build();
////
////        MongoClientSettings settings = MongoClientSettings.builder()
////                .applyConnectionString(new ConnectionString(connectionString))
////                .serverApi(serverApi)
////                .build();
//
//        // Create a new client and connect to the server
////        try (MongoClient mongoClient = MongoClients.create(settings)) {
////            try {
////                // Send a ping to confirm a successful connection
////                MongoDatabase mongoExampledb = mongoClient.getDatabase("admin");
////                mongoExampledb.runCommand(new Document("ping", 1));
////                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
////            } catch (MongoException e) {
////                e.printStackTrace();
////            }
////        }
//    }
//
//	@Override
//	protected String getDatabaseName() {
//		
//        return "mongoExampledb";
//
//	}
//}
