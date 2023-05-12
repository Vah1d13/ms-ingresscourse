package javaReflection;

public class DbConnection {
    private static DbConnection dbConection;
    private static String queryHistory = "Query History:\n";

    public static DbConnection getDbConection(){
        if (dbConection == null) dbConection = new DbConnection();
        return dbConection;
    }

    private DbConnection(){};
    public void addQuery(String query){
        queryHistory += query + "\n";
    }

    public void showQueries(){
        System.out.println(queryHistory);
    }
}
