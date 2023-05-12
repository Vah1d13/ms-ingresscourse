import javaReflection.DbConnection;

public class SingletonPattern {
    public static void main(String[] args) {
        var dbConection = DbConnection.getDbConection();
        dbConection.addQuery("First Query");
        dbConection.addQuery("Second Query");
        dbConection.showQueries();
        var a = DbConnection.getDbConection();
        System.out.println(dbConection);
        System.out.println(a);
    }
}
